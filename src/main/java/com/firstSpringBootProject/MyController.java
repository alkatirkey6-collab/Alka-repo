package com.firstSpringBootProject;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("moto")
	public static String myMethod() {
		return "This is one more beginning";
	}
	
	@PostMapping("form")
	public static String getData(@RequestParam int num1, @RequestParam int num2) {
		int result= num1+num2;
		
		return String.valueOf(result);
	}

}
