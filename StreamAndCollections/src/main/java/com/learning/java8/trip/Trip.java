package com.learning.java8.trip;

import java.util.List;

public class Trip {

	private List<Journey> journey;

	private List<Passenger> passengers;

	private List<PassengerFlightDetails> passengerFlightDetails;

	public Trip() {
		// TODO Auto-generated constructor stub
	}

	public List<Journey> getJourney() {
		return journey;
	}

	public void setJourney(List<Journey> journey) {
		this.journey = journey;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}

	public List<PassengerFlightDetails> getPassengerFlightDetails() {
		return passengerFlightDetails;
	}

	public void setPassengerFlightDetails(List<PassengerFlightDetails> passengerFlightDetails) {
		this.passengerFlightDetails = passengerFlightDetails;
	}

	@Override
	public String toString() {
		return "Trip [journey=" + journey + ", passengers=" + passengers + ", passengerFlightDetails="
				+ passengerFlightDetails + "]";
	}

}
