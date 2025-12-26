package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringProjectApplication.class, args);
	}

	@GetMapping("/")
	public String welcome() {
		return "<h1> <center> Welcome to Spring Boot </center> </h1> ";
	}

}
