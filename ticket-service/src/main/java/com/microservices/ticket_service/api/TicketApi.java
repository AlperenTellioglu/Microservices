package com.microservices.ticket_service.api;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.ticket_service.business.abstracts.TicketService;
import com.microservices.ticket_service.dto.request.CreateTicketRequest;
import com.microservices.ticket_service.dto.request.UpdateTicketRequest;
import com.microservices.ticket_service.dto.response.GetByIdResponse;
import com.microservices.ticket_service.dto.response.GetByPageableResponse;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RequestMapping("/ticket")
@RestController
@AllArgsConstructor
@NoArgsConstructor
public class TicketApi {

	private TicketService ticketService;
	
	@GetMapping("/{id}")
	public ResponseEntity<GetByIdResponse> getById(@PathVariable UUID id) {
		return ResponseEntity.ok(ticketService.getById(id));
	}
	
	@PostMapping
	public ResponseEntity<CreateTicketRequest> createTicket(@RequestBody CreateTicketRequest ticketRequest) {
		
		return ResponseEntity.ok(ticketService.save(ticketRequest));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<UpdateTicketRequest> updateTicket(UpdateTicketRequest ticketRequest) {
		
		return ResponseEntity.ok(ticketService.update(ticketRequest));
	}
	
	@GetMapping
	public ResponseEntity<Page<GetByPageableResponse>> getAll(Pageable pageable) {
		return ResponseEntity.ok(ticketService.getPagination(pageable));
	}
}
