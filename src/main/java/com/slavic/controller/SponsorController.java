package com.slavic.controller;

import javax.faces.annotation.RequestMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.slavic.dto.Response;
import com.slavic.dto.req.Login;
import com.slavic.service.impl.SponsorService;


@RestController
@RequestMapping("/Spon")
public class SponsorController {
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	SponsorService sponserService;
	
	private  final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@PostMapping("/login")
	public @ResponseBody Response<?> login(@RequestBody Login login){		
		return sponserService.login(login);
	}
	

}
