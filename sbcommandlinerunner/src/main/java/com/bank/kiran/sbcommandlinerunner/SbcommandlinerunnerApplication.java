package com.bank.kiran.sbcommandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SbcommandlinerunnerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SbcommandlinerunnerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(" \n\n\n ################  Kiran ###########");

		RestTemplate restTemplate = new RestTemplate();

		String url = "http://services.groupkt.com/state/get/USA/all";

		ResponseEntity responseEntity = restTemplate.getForEntity(url,String.class);

		System.out.println(responseEntity);

		System.out.println(" \n\n\n ################  Kiran ###########");
	}
}


/*
1.selected the web project for sb
2.used the commandlinerunner interface
3.used
  RestTemplate    --- to make the get call getForEntity();
  ResponseEntity  --- to capture the json response
 */