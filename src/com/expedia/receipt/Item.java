package com.expedia.receipt;

public class Item {

	private int quantity;

	private String name;

	private double price;

	private double total;

	private double taxes;
	
	private double tax_percentage=20.0; // Can be changed using setter if required.

	public Item(int quantity, String name, double price) {

		this.quantity = quantity;
		this.name = name;
		this.price = price;

		calcPrice();

		calcTax();
	}

	private void calcTax() {

		Medical medical = new Medical();

		if (medical.isMedical(this.name)) {
			this.taxes = 0;

		}

		else {

			double tax = 0.0;
			tax = (this.price) * ((tax_percentage/100));
			this.taxes = tax;
		}

	}

	private void calcPrice() {

		this.total = (this.price * this.quantity) + this.taxes;

	}

	public int getQuantity() {
		return quantity;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getTotal() {
		return total;
	}

	public double getTaxes() {
		return taxes;
	}

	public double getTax_percentage() {
		return tax_percentage;
	}

	public void setTax_percentage(double tax_percentage) {
		this.tax_percentage = tax_percentage;
	}
	
	

}
