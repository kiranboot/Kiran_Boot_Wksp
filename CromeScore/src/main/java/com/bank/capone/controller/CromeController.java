package com.bank.capone.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/crome/")
public class CromeController {
	
	@RequestMapping (value = "/score")
	public String getScore() {
		
		System.out.println(new Date() + " Score=750");
		
		return "750";
		
	}
	

}
