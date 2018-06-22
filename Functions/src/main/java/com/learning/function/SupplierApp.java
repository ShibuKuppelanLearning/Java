package com.learning.function;

import java.util.List;
import java.util.function.Consumer;

public class SupplierApp {
	public static void main(String[] args) {
		Consumer<List<Trade>> tradeListConsumer = (tradeList) -> System.out.println(tradeList);
		tradeListConsumer.accept(TradeUtil.createTrade());
	}
}
