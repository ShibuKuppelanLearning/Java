package com.java8.interfaces;

public interface Engine {
	default public String getModel(){
		return "Engine getModel";
	}
}
