package com.learning.java8;

import java.util.Date;
import java.util.List;

public class PurchaseOrder {

	private List<Item> items;

	private Date orderDate;

	private String orderedBy;

	private int orderId;

	private double totalAmount;

	public PurchaseOrder(int orderId, Date orderDate, List<Item> items, String orderedBy, double totalAmount) {
		super();
		this.items = items;
		this.orderDate = orderDate;
		this.orderedBy = orderedBy;
		this.orderId = orderId;
		this.totalAmount = totalAmount;
	}

	public List<Item> getItems() {
		return items;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public String getOrderedBy() {
		return orderedBy;
	}

	public int getOrderId() {
		return orderId;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public void setOrderedBy(String orderedBy) {
		this.orderedBy = orderedBy;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "PurchaseOrder [items=" + items + ", orderDate=" + orderDate + ", orderedBy=" + orderedBy + ", orderId=" + orderId + ", totalAmount="
				+ totalAmount + "]\n\n";
	}

}
