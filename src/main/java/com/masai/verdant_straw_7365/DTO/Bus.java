package com.masai.verdant_straw_7365.DTO;

import jakarta.persistence.*;

@Entity
public class Bus {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int busid;
    
    private String busType;
    private String busNumber;
    private int busCapacity;
    
    public Bus() {
		super();
	}
    
	@Override
	public String toString() {
		return "Bus [busid=" + busid + ", busType=" + busType + ", busNumber=" + busNumber + ", busCapacity="
				+ busCapacity + "]";
	}
	public Bus(String busType, String busNumber, int busCapacity) {
		super();
		this.busType = busType;
		this.busNumber = busNumber;
		this.busCapacity = busCapacity;
	}

	public int getBusid() {
		return busid;
	}

	public void setBusid(int busid) {
		this.busid = busid;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public int getBusCapacity() {
		return busCapacity;
	}

	public void setBusCapacity(int busCapacity) {
		this.busCapacity = busCapacity;
	}
    
	
	
    
    
    }
