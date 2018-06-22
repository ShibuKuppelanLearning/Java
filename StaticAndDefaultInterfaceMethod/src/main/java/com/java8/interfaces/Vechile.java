package com.java8.interfaces;

public interface Vechile extends Engine{
	default public String getModel(){
		return "Vechile getModel";
	}
}
