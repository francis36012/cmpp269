package com.fagyapong.cmpp269.labmidterm;

import java.util.Scanner;

public class Q1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		double baseCharge = 20;
		double gstRate = 0.05;
		double gst;
		double downloadSize;
		double dataCharge;
		double totalCharge;
		String clientName;

		Scanner keyboard = new Scanner(System.in);

		System.out.printf("Enter client name: ");
		clientName = keyboard.nextLine();

		System.out.printf("Enter # of Gb used: ");
		downloadSize = keyboard.nextDouble();

		dataCharge = 0.10 * downloadSize;
		gst = gstRate * (dataCharge + baseCharge);
		totalCharge = gst + (dataCharge + baseCharge);

		// close the input stream
		keyboard.close();
		System.out.println("Base charge = $" + baseCharge);
		System.out.println("Data charge = $" + dataCharge);
		System.out.println("GST = $" + gst);
		System.out.println("Total = $" + totalCharge);
	}
}
