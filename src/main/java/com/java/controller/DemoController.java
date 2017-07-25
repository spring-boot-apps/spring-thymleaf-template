package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/")
	public String getIndex() {
		return "home";
	}
	
	@GetMapping("/about-us")
	public String getIndex1() {
		return "about-us";
	}

}
