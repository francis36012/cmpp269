/**
 * Purpose: Calculate the balance on a Fox International Calling Card based on the data supplied by user (customer)
 * 
 * Input:
 *      Number of calls made to each region(US, Europe, and Australia). These numbers are entered separately
 *      Duration of calls to each of the three regions. These are also entered separately.
 *
 * Processing done:
 *      Charges of calls to a particular region is calculated using a connection fee of 49 cents per call, and
 *      a rate that varies between regions.
 *      
 * Output: A summary (with charges based on the calculations done for each region and a grand total) of all calls done.
 *
 * @author Francis Agyapong 
 * @version (a version number or a date)
 */
package com.fagyapong.cmpp269.assignment1;

// Needed if Scanner is going to be used (this makes the Scanner class accessible from this program)
import java.util.Scanner;

public class Fox {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// An object for reading user input from the keyboard (or keyboard input
		// from the user).
		Scanner keyinput = new Scanner(System.in);

		String cardHolderName;
		int cardNumber;
		double startingBalance;

		// Connection fee (same for all regions)
		final double costPerConnection = 49;

		// Rate constants for the three regions
		final double costPerMinuteUS = 1.2;
		final double costPerMinuteEurope = 2.3;
		final double costPerMinuteAustralia = 6.4;

		// Total number, duration, and charges for calls to US
		int totalCallsUS, totalDurationUS;
		double callChargesUS;

		// Total number, duration, and charges for calls to Europe
		int totalCallsEurope, totalDurationEurope;
		double callChargesEurope;

		// Total number, duration, and charges for calls to Australia
		int totalCallsAustralia, totalDurationAustralia;
		double callChargesAustralia;

		// Total number, duration, and charges for calls to all the three
		// regions
		int totalCalls, totalCallDuration;
		double totalCallCharges, cardBalance;

		System.out.println("Fox International Calling Card Calculator");
		System.out.print("Enter account holders name: ");
		cardHolderName = keyinput.nextLine(); // read a string from the keyboard

		System.out.print("Enter card number: ");
		cardNumber = keyinput.nextInt(); // read an int from the keyboard
		System.out.print("Starting Balance: ");
		startingBalance = keyinput.nextDouble(); // read a double from the
													// keyboard
		System.out
				.println("-----------------------------------------------------------------");

		System.out.println("US calls");
		System.out.print("\tTotal # of US calls: ");
		totalCallsUS = keyinput.nextInt();
		System.out.print("\tTotal duration of ALL US calls in minutes: ");
		totalDurationUS = keyinput.nextInt();

		System.out.println("European calls");
		System.out.print("\tTotal # of calls to Europe: ");
		totalCallsEurope = keyinput.nextInt();
		System.out
				.print("\tTotal duration of ALL calls to Europe in minutes: ");
		totalDurationEurope = keyinput.nextInt();

		System.out.println("Australian calls");
		System.out.print("\tTotal # of calls to Australia: ");
		totalCallsAustralia = keyinput.nextInt();
		System.out
				.print("\tTotal duration of ALL calls to Australia in minutes: ");
		totalDurationAustralia = keyinput.nextInt();
		System.out
				.println("-----------------------------------------------------------------");

		/**
		 * Charges calculated for each of the three regions. Formula used:
		 * charge = ((cost per connection x number of calls to region) +
		 * (duration of calls to region * rate of calls to region)) / 100
		 */
		callChargesUS = ((costPerConnection * totalCallsUS) + (totalDurationUS * costPerMinuteUS)) / 100;

		callChargesEurope = ((costPerConnection * totalCallsEurope) + (totalDurationEurope * costPerMinuteEurope)) / 100;

		callChargesAustralia = ((costPerConnection * totalCallsAustralia) + (totalDurationAustralia * costPerMinuteAustralia)) / 100;

		/**
		 * Calling balance on card, total number of calls, duration, and charges
		 * for all calls to the three regions.
		 */
		totalCalls = totalCallsUS + totalCallsEurope + totalCallsAustralia;
		totalCallDuration = totalDurationUS + totalDurationEurope
				+ totalDurationAustralia;
		totalCallCharges = callChargesUS + callChargesEurope
				+ callChargesAustralia;
		cardBalance = startingBalance - totalCallCharges;

		keyinput.close();

		/**
		 * Print the summary of all calls including number of calls, duration,
		 * and charges to each of the regions. A sum of these values are also
		 * printed. The balance on the card (after subtracting the total charges
		 * from the starting balance) is also printed.
		 */
		System.out.printf("Charge Summary\n");
		System.out.printf("US Charges\n");
		System.out.printf("\t# of calls        %d\n", totalCallsUS);
		System.out.printf("\t# of minutes      %d\n", totalDurationUS);
		System.out.printf("\tCharges           $%.2f\n", callChargesUS);

		System.out.printf("European Charges\n");
		System.out.printf("\t# of calls        %d\n", totalCallsEurope);
		System.out.printf("\t# of minutes      %d\n", totalDurationEurope);
		System.out.printf("\tCharges           $%.2f\n", callChargesEurope);

		System.out.printf("Australian Charges\n");
		System.out.printf("\t# of calls        %d\n", totalCallsAustralia);
		System.out.printf("\t# of minutes      %d\n", totalDurationAustralia);
		System.out.printf("\tCharges           $%.2f\n", callChargesAustralia);

		System.out.printf("Total Charges\n");
		System.out.printf("\tTotal Calls       %d\n", totalCalls);
		System.out.printf("\tTotal Duration    %d\n", totalCallDuration);
		System.out.printf("\tTotal Cost        $%.2f\n", totalCallCharges);
		System.out.printf("\tCard Balance      $%.2f\n", cardBalance);
	}
}