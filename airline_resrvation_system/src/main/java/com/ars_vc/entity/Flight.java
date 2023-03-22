package com.ars_vc.entity;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="flights")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int flight_id;
	@Column(name = "avilable_seats")
private int avilableSeats;
	@Column(name="total_seats")
private int totalSeats;
	@Column(length = 50)
private String travellerClass;
private String time;
private LocalDate date;
@Column(length = 50)
private String source;
@Column(length = 50)
private String destination;
@ManyToOne(cascade = CascadeType.ALL)

@JoinColumn(name="airline_id",referencedColumnName="id")
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
public int getTotalSeats() {
	return totalSeats;
}
public void setTotalSeats(int totalSeats) {
	this.totalSeats = totalSeats;
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
