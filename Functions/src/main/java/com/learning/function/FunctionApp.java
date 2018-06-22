package com.learning.function;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionApp {

	public static void main(String[] args) {
		
		Supplier<List<Trade>> tradeSupplier = ()->TradeUtil.createTrade();
		
		Function<List<Trade>, Trade> mainFunction = (tradeList) -> {
			System.out.println("Main Function\n" + tradeList);
			Predicate<Trade> tradePredicate = ((trade) -> trade.getTradeId() == 4);
			return tradeList.stream().filter(tradePredicate).findFirst().get();
		};

		Function<List<Trade>, List<Trade>> preFunction = (tradeList) -> {
			System.out.println("Before Function\n" + tradeList);
			Predicate<Trade> tradePredicate = ((trade) -> trade.getTradeValue() >= 200000d);
			return tradeList.stream().filter(tradePredicate).collect(Collectors.toList());
		};

		Function<Trade, String> andThenFunction = (trade) -> {
			System.out.println("andThen Function\n" + trade);
			return trade.getTradeCompany();
		};

		System.out.println(mainFunction.compose(preFunction).andThen(andThenFunction).apply(tradeSupplier.get()));
		System.out.println(Function.identity().apply(tradeSupplier.get()));
	}
}
