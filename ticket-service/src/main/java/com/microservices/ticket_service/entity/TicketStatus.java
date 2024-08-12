package com.microservices.ticket_service.entity;

import lombok.Getter;

@Getter
public enum TicketStatus {

	OPEN("Açık"),
	IN_PROGRESS("Üzerinde Çalışılıyor"),
	RESOLVED("Çözüldü"),
	CLODES("Kapandı");
	
	private String label;
	
	TicketStatus(String label) {
		this.label = label;
	}
}
