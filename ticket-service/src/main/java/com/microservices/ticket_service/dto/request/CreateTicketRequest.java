package com.microservices.ticket_service.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CreateTicketRequest {

	private String description;
	
	private String notes;
	
	private String assignee;
}
