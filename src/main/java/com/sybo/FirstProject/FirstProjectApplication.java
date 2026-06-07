package com.sybo.FirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // This annotation makes this class act as a Controller
public class FirstProjectApplication {

	// 1. Route for String
	@GetMapping("/string")
	public String getString() {
		return "This is a String value";
	}

	// 2. Route for Integer
	@GetMapping("/integer")
	public Integer getInteger() {
		return 42;
	}

	// 3. Route for Boolean
	@GetMapping("/boolean")
	public Boolean getBoolean() {
		return true;
	}

	// 4. Route for Character
	@GetMapping("/character")
	public Character getCharacter() {
		return 'A';
	}

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}
}
