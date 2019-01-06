package com.expedia.receipt.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.expedia.receipt.Receipt;

public class Junit1 {

	@Test
	public void test() {
		
		Receipt receipt =new Receipt();
		receipt.addItem(1, "book", 30);
		receipt.addItem(1, "chocolate", 1);
		
		ArrayList<String> expected =new ArrayList<String>();
		expected.add("1 book: 36.0");		
		expected.add("1 chocolate: 1.2");		
		expected.add("Sales Taxes: 6.2");		
		expected.add("Total: 37.2");
		
				
		
		assertEquals(expected, receipt.printReceipt());
		
	}

}
