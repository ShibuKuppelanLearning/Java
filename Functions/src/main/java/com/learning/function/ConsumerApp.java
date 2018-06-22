package com.learning.function;

import java.util.function.Consumer;

public class ConsumerApp {

	public static void main(String[] args) {
		String message1 = "Hi, How are you";
		String message2 = "myself shibu";
		Consumer<String> consumer = (msg1)-> System.out.println(msg1);
		consumer = consumer.andThen((msg2)->System.out.println(message2));
		consumer.accept(message1);
	}

}
