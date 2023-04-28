package com.slavic;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import brave.sampler.Sampler;


@SpringBootApplication
public class SponsorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SponsorApplication.class, args);
	}
}
