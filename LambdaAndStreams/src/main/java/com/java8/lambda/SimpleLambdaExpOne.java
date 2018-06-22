package com.java8.lambda;

public class SimpleLambdaExpOne {

	public static void calculateSum(int i, int j,SimpleLabmdaOne simpleLabmdaOne){
		System.out.println("Result = "+simpleLabmdaOne.caluculateAddition(i, j));
	}
	
	public static void main(String[] args) {
		SimpleLabmdaOne simpleLabmdaOne = (int i,int j) -> i+j;
		int result = simpleLabmdaOne.caluculateAddition(10, 20);
		System.out.println("Result = "+result);
		calculateSum(10, 30, simpleLabmdaOne);
	}

}
