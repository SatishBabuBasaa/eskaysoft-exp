package com.rest.eskaysoftAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/home1")
public class HomeController {
	
	@GetMapping("test123")
	public String home() {
		System.out.println("*******123*****************");
		return "forward:/index.html";
	}

}