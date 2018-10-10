package com.rest.eskaysoftAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping
	public String home() {
		System.out.println("************************");
		return "forward:/index.html";
	}

}