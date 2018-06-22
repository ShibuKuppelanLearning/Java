package com.learning.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class TradeUtil {

	private static Supplier<List<Trade>> tradeListSupplier = () -> {
		List<Trade> tradeList = new ArrayList<>();
		tradeList.add(new Trade(1, "Trade-SLK", 100000d, "slk.co"));
		tradeList.add(new Trade(2, "Trade-IND", 200000d, "ind.co"));
		tradeList.add(new Trade(3, "Trade-LHR", 300000d, "lhr.co"));
		tradeList.add(new Trade(4, "Trade-JFK", 400000d, "jfk.co"));
		return tradeList;
	};

	public static List<Trade> createTrade() {
		return tradeListSupplier.get();
	}
}
