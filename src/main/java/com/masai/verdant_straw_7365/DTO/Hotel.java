package com.masai.verdant_straw_7365.DTO;

import java.util.Date;

import jakarta.persistence.*;

@Entity
public class Hotel {
	private int hotelId;
	private String hotelName;
	private String hotelType;
	private String hotelDescription;
	private String address;
	private double rent;
	private String status;
	
}
