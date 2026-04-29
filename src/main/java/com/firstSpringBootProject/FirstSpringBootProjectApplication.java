package com.firstSpringBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringBootProjectApplication {

	public static void main(String[] args) {
		System.out.println("hello my girl, I'm back");
		
		//System.out.println(MyController.myMethod());
		SpringApplication.run(FirstSpringBootProjectApplication.class, args);
	}
	//http://localhost:8080/
}
