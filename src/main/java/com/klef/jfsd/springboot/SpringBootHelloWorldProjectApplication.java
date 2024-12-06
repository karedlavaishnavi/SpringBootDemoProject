package com.klef.jfsd.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//this is the main class from where the execution will be started
public class SpringBootHelloWorldProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldProjectApplication.class, args);
		System.out.println("Hi Spring Boot...!");
	}

}
