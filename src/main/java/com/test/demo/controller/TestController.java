package com.test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/home")
	public String homePage() {
		return "Welcome to home";
	}

}
