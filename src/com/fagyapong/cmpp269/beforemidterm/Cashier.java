package com.fagyapong.cmpp269.beforemidterm;

import java.util.Scanner;

public class Cashier {

	public static void main(String[] args) {
		Scanner keyinput = new Scanner(System.in);

		double saleAmount, saleTotal, gst, amountTendered, change;
		final double GST_RATE = 0.05;

		System.out.print("Enter amount of sale: ");
		saleAmount = keyinput.nextDouble();
		gst = saleAmount * GST_RATE;
		saleTotal = saleAmount + gst;

		System.out.printf("\tGST $%.2f\n", gst);
		System.out.printf("\tTotal $%.2f\n", saleTotal);

		System.out.print("Enter amount tendered: ");
		amountTendered = keyinput.nextDouble();
		change = amountTendered - saleTotal;
		System.out.printf("\tChange $%.2f\n", change);

		keyinput.close();
	}
}
