package com.masai.verdant_straw_7365.DTO;

import jakarta.persistence.*;

@Entity
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hotelId;
	private String hotelName;
	private String hotelType;
	private String hotelDescription;
	private String address;
	private double rent;
	private String status;
	
	
	public Hotel() {
		super();
	}


	public Hotel(String hotelName, String hotelType, String hotelDescription, String address, double rent,
			String status) {
		super();
		this.hotelName = hotelName;
		this.hotelType = hotelType;
		this.hotelDescription = hotelDescription;
		this.address = address;
		this.rent = rent;
		this.status = status;
	}


	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelType=" + hotelType
				+ ", hotelDescription=" + hotelDescription + ", address=" + address + ", rent=" + rent + ", status="
				+ status + "]";
	}


	public int getHotelId() {
		return hotelId;
	}


	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}


	public String getHotelName() {
		return hotelName;
	}


	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}


	public String getHotelType() {
		return hotelType;
	}


	public void setHotelType(String hotelType) {
		this.hotelType = hotelType;
	}


	public String getHotelDescription() {
		return hotelDescription;
	}


	public void setHotelDescription(String hotelDescription) {
		this.hotelDescription = hotelDescription;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public double getRent() {
		return rent;
	}


	public void setRent(double rent) {
		this.rent = rent;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
