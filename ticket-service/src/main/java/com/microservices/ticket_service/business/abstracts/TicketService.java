package com.microservices.ticket_service.business.abstracts;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.microservices.ticket_service.dto.request.CreateTicketRequest;
import com.microservices.ticket_service.dto.request.UpdateTicketRequest;
import com.microservices.ticket_service.dto.response.GetByIdResponse;
import com.microservices.ticket_service.dto.response.GetByPageableResponse;

public interface TicketService {

	CreateTicketRequest save(CreateTicketRequest createTicketRequest);
	
	UpdateTicketRequest update(UpdateTicketRequest updateTicketRequest);
	
	GetByIdResponse getById(UUID ticketId);
	
	Page<GetByPageableResponse> getPagination(Pageable pageable);
}
