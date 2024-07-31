package com.microservices.account_service.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservices.account_service.dataAccess.AccountRepository;
import com.microservices.account_service.entity.Account;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountService {

	private AccountRepository accountRepository;
	
	public Account get(String id) {
		return accountRepository.findById(id).orElseThrow();
		
	}
	
	public Account save(Account account) {
		return accountRepository.save(account);
	}
	
	public Account update(String id) {
		
		Account account = accountRepository.findById(id).orElseThrow();
		
		return accountRepository.save(account);
	}
	
	public void delete(String id) {

	}
	
	public List<Account> findAll() {
		return accountRepository.findAll();
	}
	
}
