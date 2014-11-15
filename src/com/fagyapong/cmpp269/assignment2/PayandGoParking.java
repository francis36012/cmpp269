/**
 * Purpose:
 * Input:
 *      number of minutes to park
 *      credit card number
 *      credit card security number
 *
 * Processing done:
 *      calculate customer charges based on entered minutes
 *      calculate total number ofminutes sold on the parking vending machine
 *
 * Output:
 *
 * @author Francis Agyapong
 * @version October 2014
 */
package com.fagyapong.cmpp269.assignment2;

import java.util.*;
import java.io.*;

public class PayandGoParking {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {

		double chargesCustomer = 0;
		double totalChargesMachine = 0;

		String creditCardNumber;
		short creditCardSecurity;

		char userOption;

		Scanner keyboard = new Scanner(System.in);

		System.out.printf("Welcome to Pay and Go Parking\n");
		System.out.printf("+ to add 30 minutes ($1.00 charge)\n");
		System.out.printf("p to print the ticket\n");
		System.out.printf("r to restart the program\n");
		System.out.printf("x to exit the program\n");
		System.out.printf("Please enter your selection: ");

		// Since all of the options are single characters, get the first
		// character in the user's input
		userOption = keyboard.next().charAt(0);

		// Create a time object and give it current date and time
		Calendar now = Calendar.getInstance();

		// Clone the above time object, this clone will be used to calculate
		// parking times
		Calendar paidTill = (Calendar) now.clone();

		while (userOption != 'x') {

			switch (userOption) {

			case '+':
				paidTill.add(Calendar.MINUTE, 30);
				chargesCustomer += 1;

				// System.out.printf("\f");

				System.out
						.printf("-------------------------------------------------------\n");
				System.out
						.printf("Current Time: %d-%d %d:%d\n",
								now.get(Calendar.MONTH) + 1,
								now.get(Calendar.DAY_OF_MONTH),
								now.get(Calendar.HOUR_OF_DAY),
								now.get(Calendar.MINUTE));

				System.out.printf("Paid Till: %d-%d %d:%d\n",
						paidTill.get(Calendar.MONTH) + 1,
						paidTill.get(Calendar.DAY_OF_MONTH),
						paidTill.get(Calendar.HOUR_OF_DAY),
						paidTill.get(Calendar.MINUTE));

				System.out.printf("Current Charge: $%.2f\n", chargesCustomer);
				System.out
						.printf("-------------------------------------------------------\n");

				System.out.printf("Welcome to Pay and Go Parking\n");
				System.out.printf("+ to add 30 minutes ($1.00 charge)\n");
				System.out.printf("p to print the ticket\n");
				System.out.printf("r to restart the program\n");
				System.out.printf("x to exit the program\n");
				System.out.printf("Please enter your selection: ");

				userOption = keyboard.next().charAt(0);
				break;
			case 'r':
				chargesCustomer = 0;

				// update calendar to current time
				now = Calendar.getInstance();

				paidTill = (Calendar) now.clone();

				// System.out.printf("\f");

				System.out
						.printf("-------------------------------------------------------\n");
				System.out
						.printf("Current Time: %d-%d %d:%d\n",
								now.get(Calendar.MONTH) + 1,
								now.get(Calendar.DAY_OF_MONTH),
								now.get(Calendar.HOUR_OF_DAY),
								now.get(Calendar.MINUTE));

				System.out.printf("Paid Till: %d-%d %d:%d\n",
						paidTill.get(Calendar.MONTH) + 1,
						paidTill.get(Calendar.DAY_OF_MONTH),
						paidTill.get(Calendar.HOUR_OF_DAY),
						paidTill.get(Calendar.MINUTE));

				System.out.printf("Current Charge: $%.2f\n", chargesCustomer);
				System.out
						.printf("-------------------------------------------------------\n");

				System.out.printf("Welcome to Pay and Go Parking\n");
				System.out.printf("+ to add 30 minutes ($1.00 charge)\n");
				System.out.printf("p to print the ticket\n");
				System.out.printf("r to restart the program\n");
				System.out.printf("x to exit the program\n");
				System.out.printf("Please enter your selection: ");

				userOption = keyboard.next().charAt(0);
				break;
			case 'p':
				System.out.print("Enter Credit Card Number: ");
				keyboard.nextLine();
				creditCardNumber = keyboard.nextLine();
				System.out
						.print("Enter 3 digit security code from back of Credit Card: ");
				creditCardSecurity = keyboard.nextShort();

				totalChargesMachine += chargesCustomer;

				// System.out.printf("\f");

				System.out
						.printf("-------------------------------------------------------\n");
				System.out.printf("Pay and Go Parking\n");
				System.out.printf("Lot Location: 123 Main St,\n");
				System.out.printf("Honolulu, Hawaii\n");
				System.out
						.printf("-------------------------------------------------------\n");
				System.out
						.printf("Current Time: %d-%d %d:%d\n",
								now.get(Calendar.MONTH) + 1,
								now.get(Calendar.DAY_OF_MONTH),
								now.get(Calendar.HOUR_OF_DAY),
								now.get(Calendar.MINUTE));

				System.out.printf("Paid Till: %d-%d %d:%d\n",
						paidTill.get(Calendar.MONTH) + 1,
						paidTill.get(Calendar.DAY_OF_MONTH),
						paidTill.get(Calendar.HOUR_OF_DAY),
						paidTill.get(Calendar.MINUTE));

				System.out.printf("Total charged to Credit Card: $%.2f\n",
						chargesCustomer);
				System.out
						.printf("=======================================================\n");
				System.out.printf("Tear off receipt and place on dash\n");
				System.out.printf("Press any key to continue...\n");
				System.in.read();

				chargesCustomer = 0;

				// Update calendar to current time
				now = Calendar.getInstance();

				paidTill = (Calendar) now.clone();

				// System.out.printf("\f");
				System.out
						.printf("-------------------------------------------------------\n");
				System.out
						.printf("Current Time: %d-%d %d:%d\n",
								now.get(Calendar.MONTH) + 1,
								now.get(Calendar.DAY_OF_MONTH),
								now.get(Calendar.HOUR_OF_DAY),
								now.get(Calendar.MINUTE));

				System.out.printf("Paid Till: %d-%d %d:%d\n",
						paidTill.get(Calendar.MONTH) + 1,
						paidTill.get(Calendar.DAY_OF_MONTH),
						paidTill.get(Calendar.HOUR_OF_DAY),
						paidTill.get(Calendar.MINUTE));

				System.out.printf("Current Charge: $%.2f\n", chargesCustomer);
				System.out
						.printf("-------------------------------------------------------\n");

				System.out.printf("Welcome to Pay and Go Parking\n");
				System.out.printf("+ to add 30 minutes ($1.00 charge)\n");
				System.out.printf("p to print the ticket\n");
				System.out.printf("r to restart the program\n");
				System.out.printf("x to exit the program\n");
				System.out.printf("Please enter your selection: ");

				userOption = keyboard.next().charAt(0);
				break;
			}
		}
		keyboard.close();

		System.out.printf("\n");
		// System.out.printf("\f");
		System.out.printf("Totals for Pay and Go Parking\n");
		System.out.printf("=============================\n");
		System.out.printf("%-20s $%.2f\n", "Totals", totalChargesMachine);
	}
}