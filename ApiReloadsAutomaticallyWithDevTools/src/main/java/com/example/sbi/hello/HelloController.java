package com.example.sbi.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHi(){
		System.out.println("sayHi()");
		System.out.println("ok");
		return "Hello";
	}

}
