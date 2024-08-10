package com.microservices.ticket_service.entity;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ticket")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Ticket extends BaseEntityModel {

	@Getter
	@Id
	@GeneratedValue(generator = "UUID")
	@Column(name = "id")
	private UUID id = UUID.randomUUID();
	
	@Getter
	@Setter
	@Column(name = "description", length = 600)
	private String description;
	
	@Getter
	@Setter
	@Column(name = "notes", length = 4000)
	private String notes;
	
	@Getter
	@Setter
	@Column(name = "assignee", length = 50)
	private String assignee;
	
	@Getter
	@Setter
	@Column(name = "ticket_date")
	private Date ticketDate;
	
	@Getter
	@Setter
	@Enumerated(EnumType.ORDINAL) //Default ordinal
	@Column(name = "priority_type")
	private PriorityType priorityType;
	
	@Getter
	@Setter
	@Enumerated(EnumType.ORDINAL) //Default ordinal
	@Column(name = "ticket_status")
	private TicketStatus ticketStatus;
	
}
