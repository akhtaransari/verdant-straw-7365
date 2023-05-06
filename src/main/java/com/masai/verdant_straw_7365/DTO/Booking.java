package com.masai.verdant_straw_7365.DTO;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	
	private String bookingType;
	private String description;
	private String bookingTitle;
	private LocalDate bookingDate;
	
	public Booking() {
		super();
	}

	
	
	
	public int getBookingId() {
		return bookingId;
	}




	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}




	public String getBookingType() {
		return bookingType;
	}




	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public String getBookingTitle() {
		return bookingTitle;
	}




	public void setBookingTitle(String bookingTitle) {
		this.bookingTitle = bookingTitle;
	}




	public LocalDate getBookingDate() {
		return bookingDate;
	}




	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}




	public Booking(String bookingType, String description, String bookingTitle, LocalDate bookingDate) {
		super();
		this.bookingType = bookingType;
		this.description = description;
		this.bookingTitle = bookingTitle;
		this.bookingDate = bookingDate;
	}




	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingType=" + bookingType + ", description=" + description
				+ ", bookingTitle=" + bookingTitle + ", bookingDate=" + bookingDate + "]";
	}
	
	
	

}
