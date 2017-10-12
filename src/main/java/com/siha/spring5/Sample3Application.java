package com.siha.spring5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class Sample3Application {
	public static void main(String[] args) {
		SpringApplication.run(Sample3Application.class, args);
	}
}
