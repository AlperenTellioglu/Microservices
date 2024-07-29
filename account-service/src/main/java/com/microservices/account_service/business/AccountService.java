package com.microservices.account_service.business;

import org.springframework.stereotype.Service;

import com.microservices.account_service.entity.Account;

@Service
public class AccountService {

	public Account get(String id) {
		return new Account("test-id");
	}
	
	public Account save(Account account) {
		return new Account("test-id");
	}
	
	public Account update(Account account) {
		return new Account("test-id");
	}
	
	public void delete(String id) {

	}
	
}
