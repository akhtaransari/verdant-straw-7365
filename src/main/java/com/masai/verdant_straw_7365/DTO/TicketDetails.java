package com.masai.verdant_straw_7365.DTO;


import jakarta.persistence.*;
@Entity
public class TicketDetails {
	
	@Id
	private String ticketId;
	private String status;
	
	public TicketDetails() {
		super();
	}

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TicketDetails [ticketId=" + ticketId + ", status=" + status + "]";
	}

	public TicketDetails(String ticketId, String status) {
		super();
		this.ticketId = ticketId;
		this.status = status;
	}
	
	
}

