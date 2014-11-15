package com.fagyapong.cmpp269.beforemidterm;

import java.util.Scanner;

public class GST {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double amount, tax, afterTax;
		final double GST = 0.05;
		System.out.print("Enter Amount: ");
		amount = in.nextDouble();
		tax = amount * 0.05;
		System.out.printf("%10s%10s\n", "Desc", "Amount");
		System.out.printf("%10s%10.2f\n", "GST", tax);
		afterTax = amount + tax;
		System.out.printf("%10s%10.2f\n", "Total", afterTax);

		in.close();
	}
}
