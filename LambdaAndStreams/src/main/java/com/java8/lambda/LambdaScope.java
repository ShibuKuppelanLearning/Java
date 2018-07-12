package com.java8.lambda;

public class LambdaScope extends SuperScope{
	
	public String member = "GRANDPA";
	
	public void printFamilyMember(String member){
		Family family = (familyMember) -> {
			System.out.println("local member = "+member);
			System.out.println("instance member = "+this.member);
			System.out.println("super member = "+super.member);
			System.out.println("super member = "+super.counter(10));
		};
		family.who(member);
		System.out.println("Labmda class extends = "+family.getClass().getSuperclass().getName());
		if(family.getClass().getInterfaces()!= null && family.getClass().getInterfaces().length > 0){
			for(Class implInterface : family.getClass().getInterfaces()){
				System.out.println("Labmda class implements = "+implInterface.getName());
			}
		}
		System.out.println("Labmda class extends = "+family.getClass().getSuperclass());
		System.out.println("Labmda class is enclosed under class = "+family.getClass().getEnclosingClass());
		System.out.println("Labmda class is enclosed under method = "+family.getClass().getEnclosingMethod());
	}
	
	public static void main(String[] args) {
		new LambdaScope().printFamilyMember("SON");
	}
}
