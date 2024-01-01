package com.cqrs.query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
public class QueryHandlerApp {

	public static void main(String[] args) {
		SpringApplication.run(QueryHandlerApp.class, args);
	}

}
