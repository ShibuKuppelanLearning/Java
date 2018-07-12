package com.learning.function;

import java.util.function.Predicate;

/**
 * Hello world!
 *
 */
public class PredicateApp {
	public static void main(String[] args) {
		Predicate<String> equalsHello = (value) -> value.equalsIgnoreCase("hello");
		Predicate<String> equalsHai = (value) -> value.equalsIgnoreCase("hai");
		System.out.println(equalsHello.or(equalsHai).test("hello"));
	}
}
