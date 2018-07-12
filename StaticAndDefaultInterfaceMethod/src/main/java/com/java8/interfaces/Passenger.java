package com.java8.interfaces;

public class Passenger implements User,Person{
	public Passenger() {
		super();
	}
	@Override
	public void display() {
		Person.super.display();
	}
}
