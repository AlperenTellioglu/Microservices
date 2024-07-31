package com.microservices.account_service.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.account_service.business.AccountService;
import com.microservices.account_service.entity.Account;

@RestController
@RequestMapping("account")
/*
 * localhost:8080/account
 */
public class AccountApi {

	private final AccountService accountService;

	public AccountApi(AccountService accountService) {
		this.accountService = accountService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Account> get(@PathVariable("id") String id) {
		return ResponseEntity.ok(accountService.get(id));
	}

	@GetMapping
	public ResponseEntity<List<Account>> findAll() {
		return ResponseEntity.ok(accountService.findAll());
	}

	@PostMapping
	public ResponseEntity<Account> save(@RequestBody Account account) {
		return ResponseEntity.ok(accountService.save(account));
	}

	@PutMapping
	public ResponseEntity<Account> update(String id) {
		return ResponseEntity.ok(accountService.update(id));
	}

	@DeleteMapping
	public void delete(String id) {
		accountService.delete(id);
	}

}
