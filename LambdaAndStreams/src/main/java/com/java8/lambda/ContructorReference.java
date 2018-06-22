package com.java8.lambda;

public class ContructorReference {
	
	public static void main(String[] args) {
		TradeCreator tradeCreator = Trade::new;
		TradeCreatorId tradeCreatorWithId = Trade::new;
		TradeCreatorIdAndName tradeCreatorWithIdAndName = Trade::new;
		System.out.println(tradeCreator.createTrade());
		System.out.println(tradeCreatorWithId.createTrade(10));
		System.out.println(tradeCreatorWithIdAndName.createTrade(10,"Trade-1"));
	}
}
 