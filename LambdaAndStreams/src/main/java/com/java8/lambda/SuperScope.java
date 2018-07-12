package com.java8.lambda;

public class SuperScope {
	public String member = "GODFATHER";
	
	public int counter(int count){
		count++;
		count++;
		count++;
		count++;
		count++;
		return count;
	}
}
