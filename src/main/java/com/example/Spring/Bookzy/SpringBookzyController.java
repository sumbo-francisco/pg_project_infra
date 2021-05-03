package com.example.Spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBookzyController {
  
      @RequestMapping("/hello")
      pubblic String index() {
        return "Spring Boot Example!!";
      }
   
}
