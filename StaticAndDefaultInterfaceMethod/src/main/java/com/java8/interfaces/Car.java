package com.java8.interfaces;

public class Car implements Engine,Vechile{
	public void displayModel(){
		System.out.println(getModel());
	}
}
