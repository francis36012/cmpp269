package com.fagyapong.cmpp269.midtermpractices;

import java.util.Scanner;

public class Sales {

	public static void main(String[] args) {

		double userInput;

		long totalPrice;
		// initialize to prevent compiler error
		long discount = 0;
		long gstRate = 5L;
		long gst;
		long finalPrice;

		Scanner input = new Scanner(System.in);

		System.out.printf("Enter the price: ");
		userInput = input.nextDouble();

		// change amount to pennies
		totalPrice = (long) Math.round(userInput * 100.0);

		if (totalPrice <= 100) {
			discount = (long) (0.03 * totalPrice);
			discount = (long) Math.round(discount);
		} else if (totalPrice > 100 && totalPrice <= 500) {
			discount = (long) (0.05 * totalPrice);
			discount = (long) Math.round(discount);
		} else if (totalPrice > 500) {
			discount = (long) (0.08 * totalPrice);
			discount = (long) Math.round(discount);
		}

		finalPrice = totalPrice - discount;
		gst = (long) Math.round((finalPrice * (gstRate / 100.0)));
		finalPrice += gst;

		System.out.printf("\nOriginal Price: $%.2f\n", totalPrice / 100.0);
		System.out.printf("Discount: $%.2f\n", discount / 100.0);
		System.out.printf("GST: $%.2f\n", gst / 100.0);
		System.out.printf("Final Price: $%.2f\n", finalPrice / 100.0);

		input.close();
	}
}