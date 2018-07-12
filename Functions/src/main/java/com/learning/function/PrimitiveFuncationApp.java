package com.learning.function;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.Predicate;

public class PrimitiveFuncationApp {

	public static void main(String[] args) {

		int intPrimitiveValue = 10;
		long longPrimitiveValue = 10L;
		double doublePrimitiveValue = 10D;

		Integer intWrapperValue = new Integer(intPrimitiveValue);
		Long longWrapperValue = new Long(longPrimitiveValue);
		Double doubleWrapperValue = new Double(doublePrimitiveValue);

		Predicate<Integer> integerPredicate = (i) -> i % 2 == 0;
		IntPredicate intPredicate = (i) -> i % 2 == 0;
		Predicate<Long> longPredicate = (i) -> i % 2 == 0;
		LongPredicate lngPredicate = (i) -> i % 2 == 0;
		Predicate<Double> doublePredicate = (i) -> i % 2 == 0;
		DoublePredicate dblPredicate = (i) -> i % 2 == 0;

		IntConsumer intConsumer = (value) -> System.out.println("value * 10 = " + value * 10);
		LongConsumer longConsumer = (value) -> System.out.println("value * 10 = " + value * 10);
		DoubleConsumer doubleConsumer = (value) -> System.out.println("value * 10 = " + value * 10);

		System.out.println("Even Integer Number :" + integerPredicate.test(intPrimitiveValue));
		System.out.println("Even int Number :" + intPredicate.test(intPrimitiveValue));

		System.out.println("Even Long Number :" + longPredicate.test(longPrimitiveValue));
		System.out.println("Even long Number :" + lngPredicate.test(longPrimitiveValue));

		System.out.println("Even Double Number :" + doublePredicate.test(doublePrimitiveValue));
		System.out.println("Even double Number :" + dblPredicate.test(doublePrimitiveValue));

		intConsumer.accept(intPrimitiveValue);
		longConsumer.accept(longPrimitiveValue);
		doubleConsumer.accept(doublePrimitiveValue);

		IntSupplier intSupplier = () -> intWrapperValue.intValue();
		LongSupplier longSupplier = () -> longWrapperValue.intValue();
		DoubleSupplier doubleSupplier = () -> doubleWrapperValue.intValue();

		System.out.println("intSupplier value : " + intSupplier.getAsInt());
		System.out.println("longSupplier value : " + longSupplier.getAsLong());
		System.out.println("doubleSupplier value : " + doubleSupplier.getAsDouble());
		
		IntFunction<Integer> intFunction = (value)-> value * intWrapperValue.intValue();
		LongFunction<Long> longFunction = (value)-> value * longWrapperValue.longValue();
		DoubleFunction<Double> doubleFunction = (value)-> value * doubleWrapperValue.doubleValue();
		
		System.out.println("intFunction value : "+intFunction.apply(intPrimitiveValue));
		System.out.println("longFunction value : "+longFunction.apply(longPrimitiveValue));
		System.out.println("doubleFunction value : "+doubleFunction.apply(doublePrimitiveValue));
		
	}

}
