package com.fagyapong.cmpp269.beforemidterm;

import java.text.*;
import java.util.Scanner;

public class DecFormat {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double amount, tax, afterTax;
		final double GST = 0.05;

		// create a pattern called out
		DecimalFormat out = new DecimalFormat("$#,##0.00");

		System.out.print("Enter Amount: ");
		amount = in.nextDouble();
		tax = amount * 0.05;
		System.out.println("Tax = " + out.format(tax));
		afterTax = amount + tax;
		System.out.println("Total Sale = " + out.format(afterTax));

		in.close();
	}
}
