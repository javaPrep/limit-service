package com.example.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.configuration.Configuration;
import com.example.microservice.dto.Limits;

@RestController
public class LimitController {

	@Autowired
	Configuration config;

	@GetMapping(path = "/limits")
	public Limits getLimit() {
		return new Limits(config.getMinimum(), config.getMaximum());
	}

}
