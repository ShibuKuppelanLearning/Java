package com.learning.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PurchaseOrderUtils {
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

	public static List<PurchaseOrder> createPurchaseOrders() {
		List<PurchaseOrder> purchaseOrders = new ArrayList<PurchaseOrder>();
		Item xyzPurchaseOrderItems[] = { new Item(1, "Item-1", 10000), new Item(2, "Item-2", 20000), new Item(3, "Item-3", 10000),
				new Item(4, "Item-4", 10000), };
		Item pqrPurchaseOrderItems[] = { new Item(5, "Item-5", 10000), new Item(6, "Item-6", 20000), new Item(7, "Item-7", 10000),
				new Item(8, "Item-8", 10000), };
		try {
			purchaseOrders.add(new PurchaseOrder(1, dateFormat.parse("12-05-2018"), Arrays.asList(xyzPurchaseOrderItems), "Company-XYZ", 50000));
			purchaseOrders.add(new PurchaseOrder(2, dateFormat.parse("01-06-2018"), Arrays.asList(pqrPurchaseOrderItems), "Company-PQR", 100000));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return purchaseOrders;
	}
}
