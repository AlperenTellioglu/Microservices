package com.microservices.ticket_service.dto.response;

import java.util.Date;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class GetByIdResponse {

	private UUID id = UUID.randomUUID();

	private String description;

	private String notes;

	private String assignee;

	private Date ticketDate;

	private String priorityType;

	private String ticketStatus;
}
