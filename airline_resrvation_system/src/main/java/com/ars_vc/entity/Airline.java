package com.ars_vc.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="airlines")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Airline {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="airline_name",length = 50)
	private String airlineName;
	private float fare;
	
	@OneToMany(mappedBy = "airline",cascade = CascadeType.ALL)
	List<Flight> flights;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public float getFare() {
		return fare;
	}

	public void setFare(float fare) {
		this.fare = fare;
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}
	

}
