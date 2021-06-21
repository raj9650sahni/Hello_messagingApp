package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication

@Controller
public class SpringHelloMessagingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHelloMessagingAppApplication.class, args);
	}

}
