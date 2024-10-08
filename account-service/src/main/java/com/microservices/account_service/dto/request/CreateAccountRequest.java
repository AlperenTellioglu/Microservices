package com.microservices.account_service.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreateAccountRequest {

	private String username;
	private String email;
	private String password;
	
}
