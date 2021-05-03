package com.example.Spring.Bookzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan(basePackages= {"com.example.Spring.Bookzy"})
public class SpringBookzyApplication {

	@RequestMapping("/Spring-Bookzy-0.0.1-SNAPSHOT")
	public static void main(String[] args) {
		SpringApplication.run(SpringBookzyApplication.class, args);
	}

}
