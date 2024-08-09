package com.microservices.account_service.dto.response;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetAllAccountsResponse {

	private UUID id;
	private String username;
	private String password;
	private String email;
	private LocalDateTime createdAt;
	private Boolean active;
}
