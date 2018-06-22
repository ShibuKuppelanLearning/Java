package com.java8.lambda;

public class MethodReference {

	public boolean isHit(int rating) {
		return rating > 4;
	}
	
	public static boolean isFlop(int rating) {
		return rating < 2;
	}

	public static void main(String[] args) {
		MethodReference methodReference = new MethodReference();
		Movie hitMovie1 = rating -> methodReference.isHit(rating);
		System.out.println("Is Hit Movie = "+hitMovie1.checkIt(5));
		
		Movie hitMovie2 = methodReference::isHit;
		System.out.println("Is Hit Movie = "+hitMovie2.checkIt(5));
		
		Movie flopMovie = MethodReference::isFlop;
		System.out.println("Is Flop Movie = "+flopMovie.checkIt(5));
		
		
	}

}
