package com.pgssoft.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MSkeletonApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "first-server");

		SpringApplication.run(MSkeletonApplication.class, args);
	}

}
