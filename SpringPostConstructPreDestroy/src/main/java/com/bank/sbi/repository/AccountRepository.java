package com.bank.sbi.repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository {

	@PostConstruct
	public void initAtServerStart() {

		System.out.println("\n\n###############");
		System.out.println("@PostConsturct got called");
		System.out.println("you can load data from db during the application/server startup");
		System.out.println("###############\n\n");

	}

	@PreDestroy
	public void destroyAtServerShutdown() {

		System.out.println("\n\n###############");
		System.out.println("@PreDestroy got called");
		System.out.println("you can close the resource connections during the application/server shutdown");
		System.out.println("###############\n\n");

	}

	public AccountRepository() {
		System.out.println("\n\n###############");
		System.out.println("The Default Constructor got called");
		System.out.println("###############\n\n");
	}
	
	public void destroy() {
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAa");
	}
	
	

}
