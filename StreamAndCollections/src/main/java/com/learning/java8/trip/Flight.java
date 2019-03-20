package com.learning.java8.trip;

public class Flight {
	private String flightId;

	public Flight() {
		// TODO Auto-generated constructor stub
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + "]";
	}

}
