package com.microservices.account_service.business;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.microservices.account_service.dataAccess.AccountRepository;
import com.microservices.account_service.dto.request.CreateAccountRequest;
import com.microservices.account_service.dto.response.GetAllAccountsResponse;
import com.microservices.account_service.entity.Account;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountService {

	private AccountRepository accountRepository;
	
	public Account get(String id) {
		return accountRepository.findById(id).orElseThrow();
		
	}
	
	public Account save(CreateAccountRequest createAccountRequest) {
		Account account = new Account();
		
		account.setUsername(createAccountRequest.getUsername());
		account.setEmail(createAccountRequest.getEmail());
		account.setPassword(createAccountRequest.getPassword());
		account.setActive(true);
		account.setCreatedAt(LocalDateTime.now());
		
		return accountRepository.save(account);
	}
	
	public Account update(String id) {
		
		Account account = accountRepository.findById(id).orElseThrow();
		
		return accountRepository.save(account);
	}
	
	public void delete(String id) {

	}
	
	public List<GetAllAccountsResponse> findAll() {
		List<Account> accounts = accountRepository.findAll();
		
		List<GetAllAccountsResponse> getAllAccountsResponses = new ArrayList<GetAllAccountsResponse>();
		
		for(Account account : accounts) {

			GetAllAccountsResponse responseItem = new GetAllAccountsResponse();
			responseItem.setId(account.getId());
			responseItem.setUsername(account.getUsername());
			responseItem.setPassword(account.getPassword());
			responseItem.setEmail(account.getEmail());
			responseItem.setActive(account.getActive());
			responseItem.setCreatedAt(account.getCreatedAt());
			
			getAllAccountsResponses.add(responseItem);
		}
		
		return getAllAccountsResponses;
	}
	
}
