package com.ars_vc.model;

import java.time.LocalDate;

import com.ars_vc.entity.Airline;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class FlightDTO {
	private int flight_id;
	private int avilableSeats;
	private int totalSeates;
	private String travellerClass;
	private String time;
	private LocalDate date;
	private String source;
	private String destination;
	private Airline airline;
	public int getFlight_id() {
		return flight_id;
	}
	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}
	public int getAvilableSeats() {
		return avilableSeats;
	}
	public void setAvilableSeats(int avilableSeats) {
		this.avilableSeats = avilableSeats;
	}
	public int getTotalSeates() {
		return totalSeates;
	}
	public void setTotalSeates(int totalSeates) {
		this.totalSeates = totalSeates;
	}
	public String getTravellerClass() {
		return travellerClass;
	}
	public void setTravellerClass(String travellerClass) {
		this.travellerClass = travellerClass;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Airline getAirline() {
		return airline;
	}
	public void setAirline(Airline airline) {
		this.airline = airline;
	}


}
