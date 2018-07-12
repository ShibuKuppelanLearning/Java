package com.learning.java8;

import java.io.Serializable;

public class Item implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5021417501714140296L;

	private Integer itemId;

	private String itemName;

	private double unitPrice;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Integer itemId, String itemName, double unitPrice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
	}

	public Integer getItemId() {
		return itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", unitPrice=" + unitPrice + "]\n";
	}

}
