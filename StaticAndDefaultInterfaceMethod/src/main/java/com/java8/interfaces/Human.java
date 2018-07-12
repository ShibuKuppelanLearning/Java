package com.java8.interfaces;

public interface Human {
	default public void show(){
		System.out.println("show in human");
	}
}
