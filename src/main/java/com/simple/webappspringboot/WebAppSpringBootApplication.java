package com.simple.webappspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class WebAppSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppSpringBootApplication.class, args);
	}

}
