package com.masai.verdant_straw_7365.DTO;

import java.util.Date;

import jakarta.persistence.*;


@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "route_id")
    private String routeId;

    @Column(name = "package_id")
    private int packageId;
    
    @Column(name = "bus_id")
    private int busId;
    
    @Column(name = "booking_date")
    private Date bookingDate;
    
    @Column(name = "status")
    private String status;
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pnr")
    private int PNR;
 
 
    public Ticket() {
    	super();
	}


	@Override
	public String toString() {
		return "Ticket [id=" + id + ", userId=" + userId + ", routeId=" + routeId + ", packageId=" + packageId
				+ ", busId=" + busId + ", bookingDate=" + bookingDate + ", status=" + status + ", PNR=" + PNR + "]";
	}


	public Ticket(String userId, String routeId, int packageId, int busId, Date bookingDate, String status) {
		super();
		this.userId = userId;
		this.routeId = routeId;
		this.packageId = packageId;
		this.busId = busId;
		this.bookingDate = bookingDate;
		this.status = status;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getRouteId() {
		return routeId;
	}


	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}


	public int getPackageId() {
		return packageId;
	}


	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}


	public int getBusId() {
		return busId;
	}


	public void setBusId(int busId) {
		this.busId = busId;
	}


	public Date getBookingDate() {
		return bookingDate;
	}


	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public int getPNR() {
		return PNR;
	}
}

