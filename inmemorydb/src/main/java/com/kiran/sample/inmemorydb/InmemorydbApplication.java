package com.kiran.sample.inmemorydb;

import com.kiran.sample.inmemorydb.domain.Account;
import com.kiran.sample.inmemorydb.domain.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InmemorydbApplication {

	public static void main(String[] args) {
		SpringApplication.run(InmemorydbApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(AccountRepository accountRepository){
		return args -> {
				accountRepository.save(new Account("kiran","Ankireddy", 5000));
		};
	}

}
