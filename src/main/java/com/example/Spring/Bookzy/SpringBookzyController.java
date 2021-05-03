package com.example.Spring.Bookzy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class SpringBookzyController {
  
      @GetMapping("/Spring-Bookzy-0.0.1-SNAPSHOT")
      public String index() {
        return "Spring Boot Example!!";
      }
   
}
