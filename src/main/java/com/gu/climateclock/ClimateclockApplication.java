package com.gu.climateclock;

import com.gu.climateclock.model.ClockResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ClimateclockApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClimateclockApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/clock")
	public String clock(@NonNull RestTemplate restTemplate) {
		final ClockResponse response = restTemplate.getForObject(
				"https://api.climateclock.world/v1/clock",
				ClockResponse.class
		);
		return response.status;
	}

	@Bean
	public RestTemplate restTemplate(@NonNull RestTemplateBuilder builder) {
		builder.additionalMessageConverters(new MappingJackson2HttpMessageConverter());
		return builder.build();
	}
}
