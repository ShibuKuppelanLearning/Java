package com.java8.interfaces;

public interface Person extends Human{
	public default void display() {
		System.out.println("Display in Person");
	}
}
