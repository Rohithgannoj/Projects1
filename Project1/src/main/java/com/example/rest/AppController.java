package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/msg")
	public String message()
	{
		return "Hello";
	}
}
