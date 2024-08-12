package com.microservices.ticket_service.dataAccess;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.ticket_service.entity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, UUID> {

}
