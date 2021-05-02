package com.example.Spring.Bookzy;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//import com.simplilearn.workshop.HelloWorld;

@SpringBootTest
class SpringBookzyApplicationTests {

	@Test
	public void testSpringBookzyConstructor() {
		try{
			new SpringBookzyApplication();
			}catch (Exception e) {
				fail("Construction Failed!");
			}
	}
	
	@Test
	void contextLoads() {
	}

}
