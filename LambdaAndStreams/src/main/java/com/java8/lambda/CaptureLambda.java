package com.java8.lambda;

public class CaptureLambda {

	public int count = 5;

	public void counter(int count) {
		CaptureLambdaExp captureLambdaExp1 = () -> this.count++;
		System.out.println("Print Count Values =" + captureLambdaExp1.printCountValues());
		
//		CaptureLambdaExp captureLambdaExp2 = () -> count++;
	}

	public static void main(String[] args) {
		new CaptureLambda().counter(0);
		;
	}
}
