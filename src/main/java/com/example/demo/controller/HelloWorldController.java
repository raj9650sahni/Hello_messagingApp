package com.example.demo.controller;
import com.example.demo.model.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping(value = {"","/","/home"})
	public String sayHello() {
		return "Hello from BridgeLabz";
	}

	@RequestMapping(value = {"/query"}, method = RequestMethod.GET)
	public String sayHello(@RequestParam(value = "name") String name) {
		return "Hello " + name +  "!";
	}
	
	@GetMapping("/param/{name}")
	public String helloParam(@PathVariable String name) {
		return "Hello " + name + " !!";
	}
	
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " !";
    }

    // Put Request:- Rest call: curl -H "Content-Type: application/json" -X PUT http://localhost:8080/hello/put/Abhishek -d "{\"lastName\":\"Das\"}"
    @PutMapping("/put/{firstName}")
    public String hello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + " !!";
       
    }
    
}

	
	
	
	
	


