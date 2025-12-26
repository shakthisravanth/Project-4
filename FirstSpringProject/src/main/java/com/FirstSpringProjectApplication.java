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
    	return """
        <body style="margin:0; background-color:black;">
            <h1 style="color: rgb(254, 186, 1); text-align:center;">
                Welcome to Spring Boot
            </h1>
        </body>
        """;
	}

}
