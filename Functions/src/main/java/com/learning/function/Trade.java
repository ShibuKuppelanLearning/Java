package com.learning.function;

public class Trade {
	private int tradeId;

	private String tradeName;

	private double tradeValue;

	private String tradeCompany;

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

	public Trade(int tradeId, String tradeName, double tradeValue, String tradeCompany) {
		super();
		this.tradeId = tradeId;
		this.tradeName = tradeName;
		this.tradeValue = tradeValue;
		this.tradeCompany = tradeCompany;
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

	public double getTradeValue() {
		return tradeValue;
	}

	public void setTradeValue(double tradeValue) {
		this.tradeValue = tradeValue;
	}

	public String getTradeCompany() {
		return tradeCompany;
	}

	public void setTradeCompany(String tradeCompany) {
		this.tradeCompany = tradeCompany;
	}

	@Override
	public String toString() {
		return "\nTrade [tradeId=" + tradeId + ", tradeName=" + tradeName + ", tradeValue=" + tradeValue+ ", tradeCompany=" + tradeCompany + "]";
	}

}
