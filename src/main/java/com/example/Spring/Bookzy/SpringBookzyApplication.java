package com.example.Spring.Bookzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@ComponentScan(basePackages={"com.example.Spring.Bookzy"})
public class SpringBookzyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBookzyApplication.class, args);
	}

}

@RestController
class SpringBookzyController {
  
      @RequestMapping("/SpringBookzy")
      public String index() {
        return "Spring Boot Example!!";
      }
   
}

