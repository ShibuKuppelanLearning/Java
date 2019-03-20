package com.learning.java8.trip;

import java.util.List;

public class PassengerFlightDetails {

	private PaxFlightIdentifier paxFlightIdentifier;

	private List<SpecialServiceRequest> specialServiceRequests;

	public PassengerFlightDetails() {
		// TODO Auto-generated constructor stub
	}

	public PaxFlightIdentifier getPaxFlightIdentifier() {
		return paxFlightIdentifier;
	}

	public void setPaxFlightIdentifier(PaxFlightIdentifier paxFlightIdentifier) {
		this.paxFlightIdentifier = paxFlightIdentifier;
	}

	public List<SpecialServiceRequest> getSpecialServiceRequests() {
		return specialServiceRequests;
	}

	public void setSpecialServiceRequests(List<SpecialServiceRequest> specialServiceRequests) {
		this.specialServiceRequests = specialServiceRequests;
	}

	@Override
	public String toString() {
		return "PassengerFlightDetails [paxFlightIdentifier=" + paxFlightIdentifier + ", specialServiceRequests="
				+ specialServiceRequests + "]";
	}

}
