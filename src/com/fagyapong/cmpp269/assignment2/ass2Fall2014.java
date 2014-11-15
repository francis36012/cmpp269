/**
 * PayAndGo Parking System Ass#2 Fall 2014
 * This program acts as a ticket dispenser for short-term parking.
 * Users are able to at time to their ticket, reset their time to zero, and
 * finally print a ticket. Credit card numbers are accepted for payment. All payment 
 * information is recorded in a text file.
 * Inputs:
 * + - to add 30 minutes
 * p - to print the ticket
 * r - to reset the time paid to zero
 * credit card information - including the credit card number, expiry date and CCV
 * 
 * Processing:
 * Each time a '+' command is entered 30 minutes are added to the ticket and the customer
 * is charged a rate based on the constant called 'rate'. Each time a 'p' is entered a ticket is 
 * output AND charge along with the credit card information will then be written to a file in
 * a later release of the software.
 * 
 * Outputs:
 * A ticket with start time, end time and amount paid.
 * 
 * @author SuperDave
 * @version Nov 2014
 */
package com.fagyapong.cmpp269.assignment2;

import java.util.*;
import java.io.*;

public class ass2Fall2014 {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		String CCNumber;
		String validationCode;
		Scanner k = new Scanner(System.in);
		String userInput;
		char option;
		Calendar currentTime = Calendar.getInstance();
		Calendar paidTill = Calendar.getInstance();
		double totalCharge = 0;
		double currentCharge = 0;
		int minutesPaid = 0;
		final int MINUTES_TO_PARK = 30;
		final double RATE = 1.00; // charge is $1 for 30 minutes

		// Print the menu
		System.out.println("Welcome to Pay and Go Parking");
		System.out.println("+ to add 30 minutes ($1.00 charge)");
		System.out.println("p to print the ticket");
		System.out.println("r to restart");
		System.out.println("x to exit the program");
		System.out.print("Please enter your selection: ");
		userInput = k.nextLine();
		// extract the first character from the string for the switch
		option = userInput.charAt(0);
		option = Character.toLowerCase(option);
		System.out.print("\f");
		// continue until user enters an x (for exit)
		while (option != 'x') {

			switch (option) {
			case '+':
				// add 30 minutes
				minutesPaid += MINUTES_TO_PARK;
				// add charge to ti
				currentCharge += RATE;
				break;
			case 'p':
				// get payment information
				System.out.print("Enter Credit Card Number: ");
				CCNumber = k.nextLine();
				System.out
						.print("Enter 3 digit security code from back of Credit Card: ");
				validationCode = k.nextLine();

				// write payment information to file, this will be written later
				// print the ticket
				// reset the counters
				// used to clear the screen in blueJ
				System.out.print("\f");
				System.out.println("=======================================");
				System.out.println("Pay and Go Parking");
				System.out
						.println("Lot Location: 123 Main St,\nHonululu, Hawaii");
				System.out.println("---------------------------------------");
				System.out.print("Current Time: "
						+ (currentTime.get(Calendar.MONTH) + 1) + "-"
						+ currentTime.get(Calendar.DATE) + " "
						+ currentTime.get(Calendar.HOUR_OF_DAY) + ":");
				System.out.printf("%02d\n", currentTime.get(Calendar.MINUTE));
				System.out.print("Paid Till: "
						+ (paidTill.get(Calendar.MONTH) + 1) + "-"
						+ paidTill.get(Calendar.DATE) + " "
						+ paidTill.get(Calendar.HOUR_OF_DAY) + ":");
				System.out.printf("%02d\n", paidTill.get(Calendar.MINUTE));
				System.out.printf("Total charged to Credit Card $%.2f\n",
						currentCharge);
				System.out.println("=======================================");
				System.out.println("Tear off receipt and place on dash");
				System.out.print("Press return to continue");
				System.in.read();
				totalCharge += currentCharge;
				currentCharge = 0;
				minutesPaid = 0;
				break;
			case 'r':
				// reset the ticket counter back to 0 minutes and the customer
				// charge to 0
				currentCharge = 0;
				minutesPaid = 0;
				break;
			}
			// recalculate paidTill time based on CURRENT time
			currentTime = Calendar.getInstance();
			paidTill = (Calendar) currentTime.clone();
			paidTill.add(Calendar.MINUTE, minutesPaid);
			// print up to date ticket info
			System.out.print("\f");
			System.out
					.println("=================================================");
			System.out.print("Current Time: "
					+ (currentTime.get(Calendar.MONTH) + 1) + "-"
					+ currentTime.get(Calendar.DATE) + " "
					+ currentTime.get(Calendar.HOUR_OF_DAY) + ":");
			System.out.printf("%02d\n", currentTime.get(Calendar.MINUTE));
			System.out.print("Paid Till: " + (paidTill.get(Calendar.MONTH) + 1)
					+ "-" + paidTill.get(Calendar.DATE) + " "
					+ paidTill.get(Calendar.HOUR_OF_DAY) + ":");
			System.out.printf("%02d\n", paidTill.get(Calendar.MINUTE));
			System.out.printf("Current Charge $%.2f\n", currentCharge);
			System.out
					.println("=================================================");
			// Print the menu
			System.out.println("Welcome to Pay and Go Parking");
			System.out.println("+ to add 30 minutes ($1.00 charge)");
			System.out.println("p to print the ticket");
			System.out.println("r to restart");
			System.out.println("x to exit the program");
			System.out.print("Please enter your selection: ");
			userInput = k.nextLine();
			option = userInput.charAt(0);
			option = Character.toLowerCase(option);
		}
		System.out.println("Totals for Pay and Go Parking");
		// print totals on report
		System.out.println("====================================");
		System.out.printf("%-20s %3s $%10.2f\r\n", "Totals", "", totalCharge);

		k.close();
	}
}