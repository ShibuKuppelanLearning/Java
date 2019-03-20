package com.learning.java8.trip;

public class Passenger {
	private String passengerId;

	public Passenger() {
		// TODO Auto-generated constructor stub
	}

	public String getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
	}

	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + "]";
	}

}
