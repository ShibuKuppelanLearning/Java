package com.learning.java8.trip;

import java.util.List;

public class Journey {

	private String journeyId;

	private List<Flight> flights;

	public Journey() {
		// TODO Auto-generated constructor stub
	}

	public String getJourneyId() {
		return journeyId;
	}

	public void setJourneyId(String journeyId) {
		this.journeyId = journeyId;
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	@Override
	public String toString() {
		return "Journey [journeyId=" + journeyId + ", flights=" + flights + "]";
	}

}
