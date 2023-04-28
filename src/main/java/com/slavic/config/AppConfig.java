package com.slavic.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;
@Configuration
public class AppConfig {

	@Autowired
	RestTemplate restTemplate;
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}
}
