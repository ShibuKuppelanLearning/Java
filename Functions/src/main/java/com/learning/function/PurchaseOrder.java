package com.learning.function;

import java.util.Date;
import java.util.List;

public class PurchaseOrder {

   private List<Item> items;

   private Date orderDate;

   private int orderId;

   private double totalAmount;



   public PurchaseOrder(int orderId, Date orderDate, List<Item> items, double totalAmount) {
      super();
      this.orderId = orderId;
      this.orderDate = orderDate;
      this.items = items;
      this.totalAmount = totalAmount;
   }


   public List<Item> getItems() {
      return items;
   }


   public Date getOrderDate() {
      return orderDate;
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

   public void setOrderId(int orderId) {
      this.orderId = orderId;
   }

   public void setTotalAmount(double totalAmount) {
      this.totalAmount = totalAmount;
   }

}
