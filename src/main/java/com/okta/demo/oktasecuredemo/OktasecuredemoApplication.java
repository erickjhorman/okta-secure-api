package com.okta.demo.oktasecuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class OktasecuredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OktasecuredemoApplication.class, args);
	}

	/*
	 Free access
	 */
	@GetMapping("/api/home")
	public String home() {
		return "Hello home";
	}

	/*
	Unauthorized access
	 */
 	@GetMapping("/api/users")
	public List<String> getUsers() {
		return List.of("Test", "Test1", "Test2");
	}
}
