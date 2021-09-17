package com.gu.climateclock;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.github.jknack.handlebars.io.ClassPathTemplateLoader;
import com.github.jknack.handlebars.io.TemplateLoader;
import com.gu.climateclock.model.ClimateCrisisData;
import com.gu.climateclock.model.ClockResponse;
import com.gu.climateclock.model.GuMobileCardData;
import com.gu.climateclock.model.GuMobileFrontsResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;


@SpringBootApplication
@RestController
public class ClimateClockApplication {

	private final Handlebars handlebars;

	public ClimateClockApplication() {
		TemplateLoader templateLoader = new ClassPathTemplateLoader("/templates", ".html");
		handlebars = new Handlebars(templateLoader);
	}

	public static void main(String[] args) {
		SpringApplication.run(ClimateClockApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) throws IOException {
		final Template helloTemplate = handlebars.compileInline("Hello {{this}}!");
		return helloTemplate.apply(name);
	}

	@GetMapping("/clock")
	public String clock(@NonNull RestTemplate restTemplate) throws IOException {
		final ClockResponse clockResponse = restTemplate.getForObject(
				"https://api.climateclock.world/v1/clock",
				ClockResponse.class
		);

		final GuMobileFrontsResponse guMobileFrontsResponse = restTemplate.getForObject(
			"https://mobile.guardianapis.com/uk/groups/collections/f6be4f31-749f-4b4e-ac3b-42afc35454d4",
			GuMobileFrontsResponse.class
		);

		System.out.println("Deadline timestamp = " + clockResponse.getData().getModules().getCarbonDeadlineModule().getTimestamp().toString());
		System.out.println("Initial = " + clockResponse.getData().getModules().getRenewablesModule().getInitial());
		System.out.println("Rate = " + clockResponse.getData().getModules().getRenewablesModule().getRate());
		System.out.println("Timestamp = " + clockResponse.getData().getModules().getRenewablesModule().getTimestamp().toString());

		for (GuMobileCardData cardData:  guMobileFrontsResponse.getCards()) {
			System.out.println("Title = " + cardData.getItem().getTitle());
			System.out.println("Date = " + cardData.getItem().getWebPublicationDate());
			System.out.println("Link = " + cardData.getItem().getLinks().getWebUri());
		}
		ClimateCrisisData climateCrisisData = new ClimateCrisisData();
		climateCrisisData.setClockResponse(clockResponse);
		climateCrisisData.setGuMobileFrontsResponse(guMobileFrontsResponse);
		return handlebars.compile("clock").apply(climateCrisisData);
	}

	@Bean
	public RestTemplate restTemplate(@NonNull RestTemplateBuilder builder) {
		return builder.build();
	}
}
