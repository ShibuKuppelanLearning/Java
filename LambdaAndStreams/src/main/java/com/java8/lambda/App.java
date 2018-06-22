package com.java8.lambda;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
public class App {
	
	public void showGreeting2(String name,Greeting1 greeting){
		greeting.sayHello(name);
	}

	public void showGreeting1(String name,Greeting1 greeting){
		System.out.println(greeting);
		System.out.println(greeting.getClass().getName());
		for(Method method : greeting.getClass().getDeclaredMethods()){
			System.out.println("method = "+method);
			for(Class parameterizedType : method.getParameterTypes()){
				System.out.println("parameterizedType = "+parameterizedType.getName());
			}
			System.out.println("method = "+method.getParameterTypes());
		}
		
		for(Field field : greeting.getClass().getDeclaredFields()){
			System.out.println("method = "+field);
		}
		
		String result = greeting.sayHello(name);
		System.out.println("Result = "+result);
	}
	
	public void displayGreeting1(String name,Greeting1 greeting){
		System.out.println(greeting);
		System.out.println(greeting.getClass().getName());
		for(Method method : greeting.getClass().getDeclaredMethods()){
			System.out.println("method = "+method);
		}
		
		for(Field field : greeting.getClass().getDeclaredFields()){
			System.out.println("method = "+field);
		}
		
		String result = greeting.sayHello(name);
		System.out.println("Result = "+result);
	}
	
	public void showGreeting2(Greeting2 greeting){
		System.out.println(greeting);
		System.out.println(greeting.getClass().getName());
		for(Method method : greeting.getClass().getDeclaredMethods()){
			System.out.println("method = "+method);
		}
		
		for(Field field : greeting.getClass().getDeclaredFields()){
			System.out.println("method = "+field);
		}
		greeting.sayHaiFriends();
		System.out.println("Hai frineds ...");
	}

	public static void main(String[] args) {
		App app = new App();
		app.showGreeting1("Shibu", (name) -> new String("Hello,"+name));
//		System.out.println("**********************************************************");
//		app.displayGreeting1("Shibu", (String name) -> "Hello, "+name);
//		app.showGreeting2("Shibu", (String name) -> "Hello, "+name);
//		app.showGreeting2(()->"msg ="+"hai friends");
//		Runnable runnable = ()-> System.out.println("running....by thread ="+Thread.currentThread().getName());
		Runnable runnable = ()-> Thread.currentThread();
		Thread th = new Thread(runnable);
		th.start();
	}
}
