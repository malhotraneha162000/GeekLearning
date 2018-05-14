package com.geeklearning.sampleapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/Hello")
	public String Hello() {
	 return "Hello!";
		
	
	}

}
