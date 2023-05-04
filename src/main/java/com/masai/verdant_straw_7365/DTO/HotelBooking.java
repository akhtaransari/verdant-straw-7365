package com.masai.verdant_straw_7365.DTO;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "hotel_bookings")
public class HotelBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "hotel_name")
    private String hotelName;
    
    @Column(name = "check_in_date")
    private Date checkInDate;
    
    @Column(name = "check_out_date")
    private Date checkOutDate;
    
    
    
    public HotelBooking() {
		super();
	}



	public HotelBooking(Long userId, String hotelName, Date checkInDate, Date checkOutDate) {
		super();
		this.userId = userId;
		this.hotelName = hotelName;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
	}



	@Override
	public String toString() {
		return "HotelBooking [id=" + id + ", userId=" + userId + ", hotelName=" + hotelName + ", checkInDate="
				+ checkInDate + ", checkOutDate=" + checkOutDate + "]";
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Long getUserId() {
		return userId;
	}



	public void setUserId(Long userId) {
		this.userId = userId;
	}



	public String getHotelName() {
		return hotelName;
	}



	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}



	public Date getCheckInDate() {
		return checkInDate;
	}



	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}



	public Date getCheckOutDate() {
		return checkOutDate;
	}



	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
    
    
    
    
    
    
    
    
}
