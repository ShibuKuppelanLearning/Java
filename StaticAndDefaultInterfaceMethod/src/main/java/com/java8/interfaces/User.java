package com.java8.interfaces;

public interface User extends Human{
	public default void display() {
		System.out.println("Display in User");
	}
}
