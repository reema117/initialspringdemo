package com.learnspring.initialspringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.learnspring.*")
@EnableJpaRepositories(basePackages = "com.learnspring.*")
@EntityScan(basePackages = "com.learnspring.*")
@ComponentScan(basePackages = "com.learnspring.*")
public class InitialSpringDemo {
	
	public static void main(String[] args) {
			SpringApplication.run(InitialSpringDemo.class, args);
	}

}
