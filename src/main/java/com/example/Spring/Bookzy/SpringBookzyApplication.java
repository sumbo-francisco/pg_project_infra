package com.example.Spring.Bookzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages={"com.example.Spring.Bookzy"})
public class SpringBookzyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBookzyApplication.class, args);
	}

}
