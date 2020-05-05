package com.example.jenkinsDemo.jenkinsDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/jenkin")
	public String test(){
		return "hello world";
	}
}
