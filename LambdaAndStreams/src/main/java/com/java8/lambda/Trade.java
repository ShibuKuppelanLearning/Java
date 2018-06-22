package com.java8.lambda;

public class Trade {
	private int tradeId;

	private String tradeName;

	public Trade() {
		// TODO Auto-generated constructor stub
	}

	public Trade(int tradeId) {
		super();
		this.tradeId = tradeId;
	}

	public Trade(int tradeId, String tradeName) {
		super();
		this.tradeId = tradeId;
		this.tradeName = tradeName;
	}

	public int getTradeId() {
		return tradeId;
	}

	public void setTradeId(int tradeId) {
		this.tradeId = tradeId;
	}

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	@Override
	public String toString() {
		return "Trade [tradeId=" + tradeId + ", tradeName=" + tradeName + "]";
	}

}
