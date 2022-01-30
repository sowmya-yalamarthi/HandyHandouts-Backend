package com.handyhandouts.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/test")
public class TestApplicationController {
   
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to Handy-Hanouts";
	}
}
