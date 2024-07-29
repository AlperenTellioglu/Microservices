package com.microservices.account_service.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {

	private String id;
	private String username;
	private String email;
	private String passwd;
	
	
	public Account(String id) {
		this.id = id;
	}
	
	
}
