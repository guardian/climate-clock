package com.gu.climateclock;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.github.jknack.handlebars.io.ClassPathTemplateLoader;
import com.github.jknack.handlebars.io.TemplateLoader;
import com.gu.climateclock.model.ClockResponse;
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
		final ClockResponse response = restTemplate.getForObject(
				"https://api.climateclock.world/v1/clock",
				ClockResponse.class
		);
		return handlebars.compile("clock").apply(response);
	}

	@Bean
	public RestTemplate restTemplate(@NonNull RestTemplateBuilder builder) {
		return builder.build();
	}
}
