package com.learnspring.initialspringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.learnspring.*")
public class InitialSpringDemo {
	
	public static void main(String[] args) {
			SpringApplication.run(InitialSpringDemo.class, args);
	}

}
