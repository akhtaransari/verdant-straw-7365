package com.masai.verdant_straw_7365.DTO;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Route {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int routeid;
	
    private String routeFrom;
    private String routeTo;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalDateTime;
    private LocalDate dateOfJourny;
    private String pickupPoint;
    private double fare;
    
    public Route() {
    	super();
	}

	public Route(String routeFrom, String routeTo, LocalDateTime departureTime, LocalDateTime arrivalDateTime,
			LocalDate dateOfJourny, String pickupPoint, double fare) {
		super();
		this.routeFrom = routeFrom;
		this.routeTo = routeTo;
		this.departureTime = departureTime;
		this.arrivalDateTime = arrivalDateTime;
		this.dateOfJourny = dateOfJourny;
		this.pickupPoint = pickupPoint;
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Route [routeid=" + routeid + ", routeFrom=" + routeFrom + ", routeTo=" + routeTo + ", departureTime="
				+ departureTime + ", arrivalDateTime=" + arrivalDateTime + ", dateOfJourny=" + dateOfJourny
				+ ", pickupPoint=" + pickupPoint + ", fare=" + fare + "]";
	}

	public int getRouteid() {
		return routeid;
	}

	public void setRouteid(int routeid) {
		this.routeid = routeid;
	}

	public String getRouteFrom() {
		return routeFrom;
	}

	public void setRouteFrom(String routeFrom) {
		this.routeFrom = routeFrom;
	}

	public String getRouteTo() {
		return routeTo;
	}

	public void setRouteTo(String routeTo) {
		this.routeTo = routeTo;
	}

	public LocalDateTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalDateTime getArrivalDateTime() {
		return arrivalDateTime;
	}

	public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	public LocalDate getDateOfJourny() {
		return dateOfJourny;
	}

	public void setDateOfJourny(LocalDate dateOfJourny) {
		this.dateOfJourny = dateOfJourny;
	}

	public String getPickupPoint() {
		return pickupPoint;
	}

	public void setPickupPoint(String pickupPoint) {
		this.pickupPoint = pickupPoint;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}
    
    
    
}
