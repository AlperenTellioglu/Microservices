package com.microservices.ticket_service.business.concretes;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.microservices.ticket_service.business.abstracts.TicketService;
import com.microservices.ticket_service.dto.request.CreateTicketRequest;
import com.microservices.ticket_service.dto.request.UpdateTicketRequest;
import com.microservices.ticket_service.dto.response.GetByIdResponse;
import com.microservices.ticket_service.dto.response.GetByPageableResponse;


@Service
public class TicketManager implements TicketService {

	@Override
	public CreateTicketRequest save(CreateTicketRequest createTicketRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdateTicketRequest update(UpdateTicketRequest updateTicketRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetByIdResponse getById(UUID ticketId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<GetByPageableResponse> getPagination(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
