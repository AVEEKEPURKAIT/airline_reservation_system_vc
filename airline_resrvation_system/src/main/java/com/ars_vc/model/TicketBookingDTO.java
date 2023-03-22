package com.ars_vc.model;
import java.time.LocalDate;
import java.util.Date;

import com.ars_vc.entity.Airline;
import com.ars_vc.entity.Flight;
import com.ars_vc.entity.Passenger;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class TicketBookingDTO {
	private int ticketId;
	private int no_of_passenger;
	private double totalFare;
	private LocalDate date;
	private Flight fid;
	private Airline aid;
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
	public double getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
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
