package com.example.Spring.Bookzy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBookzyController {
  
      @RequestMapping("/hello")
      public String index() {
        return "Spring Boot Example!!";
      }
   
}
