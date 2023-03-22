package com.ars_vc.entity;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="booking_details")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class TicketBooking {

	@Id
	@GenericGenerator(name="ticket_no",strategy ="com.ars_vc.entity.TicketNoGenerator")
	@GeneratedValue(generator = "ticket_no")
private int ticketId;
private int no_of_passenger;
private float total_fare;
@Column(name="travel_date")
private LocalDate date=LocalDate.now();
@OneToOne
private Flight fid;
@OneToOne
private Airline aid;
@OneToOne
private Passenger pid;
public int getTicketId() {
	return ticketId;
}
public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
}
public int getNo_of_passenger() {
	return no_of_passenger;
}
public void setNo_of_passenger(int no_of_passenger) {
	this.no_of_passenger = no_of_passenger;
}
public float getTotal_fare() {
	return total_fare;
}
public void setTotal_fare(float total_fare) {
	this.total_fare = total_fare;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public Flight getFid() {
	return fid;
}
public void setFid(Flight fid) {
	this.fid = fid;
}
public Airline getAid() {
	return aid;
}
public void setAid(Airline aid) {
	this.aid = aid;
}
public Passenger getPid() {
	return pid;
}
public void setPid(Passenger pid) {
	this.pid = pid;
}

}
