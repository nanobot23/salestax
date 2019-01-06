package com.expedia.receipt;

import java.util.ArrayList;

public class Receipt {

	private ArrayList<Item> itemList = new ArrayList<Item>();

	public void addItem(int quantity, String name, double price) {

		itemList.add(new Item(quantity, name, price));

	}

	public ArrayList<String> printReceipt() {

		double total = 0;
		double tax = 0;

		ArrayList<String> receipt = new ArrayList<String>();

		for (Item itemlist : itemList) {
			String value = itemlist.getQuantity() + " " + itemlist.getName()
					+ ": " + itemlist.getTotal();

			total += itemlist.getTotal();

			tax += itemlist.getTaxes();

			receipt.add(value);

		}

		receipt.add("Sales Taxes: " + tax);
		receipt.add("Total: " + total);

		return receipt;
	}

}
