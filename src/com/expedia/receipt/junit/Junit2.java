package com.expedia.receipt.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.expedia.receipt.Receipt;

public class Junit2 {

	@Test
	public void test() {
		Receipt receipt =new Receipt();
		receipt.addItem(1, "bottle of wine", 20.00);
		receipt.addItem(2, "box of headache pills", 4.00);
		receipt.addItem(1, "box of pens", 10.00);

		ArrayList<String> expected =new ArrayList<String>();
		expected.add("1 bottle of wine: 20.0");		
		expected.add("2 box of headache pills: 8.0");
		expected.add("1 box of pens: 10.0");
		expected.add("Sales Taxes: 6.0");		
		expected.add("Total: 38.0");
		
		System.out.println(receipt.printReceipt());		
		
		assertEquals(expected, receipt.printReceipt());
	}

}
