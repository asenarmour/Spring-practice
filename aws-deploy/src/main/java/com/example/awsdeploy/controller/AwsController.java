package com.example.awsdeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {

	@GetMapping("/hello")
	public String getHello() {
		return "hello this is anurag negi";
	}
}
