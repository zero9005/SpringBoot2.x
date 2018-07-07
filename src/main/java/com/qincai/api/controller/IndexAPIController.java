package com.qincai.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexAPIController {

	@RequestMapping("/")
	public String home() {
		return "Hello World!";
	}
	
}
