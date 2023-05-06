package com.masai.verdant_straw_7365.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Travels {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int travelsID;
	
	private String travelsName;
	private String agentName;
	private String address;
	private String contact;
	
	public Travels() {
		super();
	}
	
	public Travels(String travelsName, String agentName, String address, String contact) {
		super();
		this.travelsName = travelsName;
		this.agentName = agentName;
		this.address = address;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Travels [travelsID=" + travelsID + ", travelsName=" + travelsName + ", agentName=" + agentName
				+ ", address=" + address + ", contact=" + contact + "]";
	}

	public int getTravelsID() {
		return travelsID;
	}

	public void setTravelsID(int travelsID) {
		this.travelsID = travelsID;
	}

	public String getTravelsName() {
		return travelsName;
	}

	public void setTravelsName(String travelsName) {
		this.travelsName = travelsName;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	
	
	
	
	
	
}
