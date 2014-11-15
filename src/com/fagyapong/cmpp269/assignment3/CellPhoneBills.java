/**
 * Purpose:
 * 		Read cellphone usage data file and calculate charges based on
 * 		the file's content
 * 
 * Input:
 * 		Path of the cellphone data file (ex. c:/temp/cellphone.txt)
 *
 * Processing done: 
 * 		For each line in the file read, a usage code is used to identify
 * 		what that line is (incoming call or text, and outgoing call or text).
 * 
 *  	Charges for calls is (0.20 x (total call duration - 50)), if total duration
 *   	of calls is greater than 50 else call charges is free (included in monthly plan)
 *   
 *   	Charges for outgoing texts (0.10 x (total # of outgoing text - 20)), if total # of texts is
 *   	greater than 20, else charges for text is free (included in monthly plan)
 *   	
 *   	charges for calls, texts, system access fee, monthly fee, and emergency fee are added to create
 *   	a sub total. GST of 5% is calculated on the subtotal and added to it to get the total monthly
 *   	charges.
 *
 * Output:
 * 		Summary of usage and charges calculated from the data file
 *
 * @author Francis Agyapong
 * @version November 2014
 */
package com.fagyapong.cmpp269.assignment3;

import java.io.*;
import java.util.*;

public class CellPhoneBills {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {

		// Information for identifying the account
		String accountNumber = "";
		String invoiceNumber = "";
		String invoiceDate = "";
		String accountHoldersName = "";
		String accountAddress = "";
		String city = "";
		String province = "";
		String postalCode = "";

		double outgoingCallsLength = 0;
		double incomingCallsLength = 0;
		double totalCallsLength = 0;
		double callsMinutesOver = 0;
		int outgoingTexts = 0;
		int outgoingTextsOver = 0;
		int incomingTexts = 0;
		
		// constants
		final int CALLS_MINS_INCLUDED = 50;
		final int OUT_TEXTS_INCLUDED = 20;
		final double GST_RATE = 0.05;
		final double COST_PER_MINUTE_CALLS = 0.20;
		final double COST_PER_TEXT_OUT = 0.10;
		final double SYSTEM_ACCESS_FEE = 6.95;
		final double MONTHLY_FEE = 15;
		final double EMERGENCY_FEE = 0.50;

		double callCost = 0;
		double textCost = 0;
		double gst = 0;
		double totalBeforeTax = 0;
		double totalAfterTax = 0;
		double cellnetUsage = 0;
		
		// The usage code of the current line is stored in this variable
		String usageCode;

		// fields for incoming and outgoing calls
		String dateOfCall;
		String dayOfWeekOfCall;
		String hourOfCall;
		String minuteOfCall;
		int lengthOfCall;

		// fields for incoming and outgoing texts
		String dateOfText;
		String dayOfWeekOfText;
		String hourOfText;
		String minuteOfText;
		
		// path of the data file
		String fileName;
		
		File dataFile;
		Scanner fileRead;
		
		Scanner keyboard = new Scanner(System.in);

		System.out.printf("Enter the data filename: ");
		fileName = keyboard.nextLine();
		
		// initialize the streams for reading the files
		dataFile = new File(fileName);
		fileRead = new Scanner(dataFile);

		// Read in the the first 8 lines that contain information about the account
		accountNumber = fileRead.nextLine();
		invoiceNumber = fileRead.nextLine();
		invoiceDate = fileRead.nextLine();
		accountHoldersName = fileRead.nextLine();
		accountAddress = fileRead.nextLine();
		city = fileRead.nextLine();
		province = fileRead.nextLine();
		postalCode = fileRead.nextLine();

		while (fileRead.hasNext()) {

			usageCode = fileRead.next();

			switch (usageCode) {
			case "O":
				dateOfCall = fileRead.next();
				dayOfWeekOfCall = fileRead.next();
				hourOfCall = fileRead.next();
				minuteOfCall = fileRead.next();
				outgoingCallsLength += Double.parseDouble(fileRead.next());
				break;
			case "I":
				dateOfCall = fileRead.next();
				dayOfWeekOfCall = fileRead.next();
				hourOfCall = fileRead.next();
				minuteOfCall = fileRead.next();
				incomingCallsLength += Double.parseDouble(fileRead.next());
				break;
			case "T":
				dateOfText = fileRead.next();
				dayOfWeekOfText = fileRead.next();
				hourOfText = fileRead.next();
				minuteOfText = fileRead.next();
				outgoingTexts += 1;
				break;
			case "X":
				dateOfText = fileRead.next();
				dayOfWeekOfText = fileRead.next();
				hourOfText = fileRead.next();
				minuteOfText = fileRead.next();
				incomingTexts += 1;
				break;
			default:
				// if the usage code is not known, read the line and move on to
				// the next line
				fileRead.nextLine();
			}
		}

		fileRead.close();
		
		// total length of all calls is the sum of all outgoing and incoming call lengths
		totalCallsLength = outgoingCallsLength + incomingCallsLength;
		
		/**
		 *	if the total length of all calls is less than or equal to 50, call cost is 0
		 *	else call cost is (total length of all calls - 50) x cost per minute
		 */
		if (totalCallsLength <= 50) {
			callCost = 0;
		} else {
			callCost = (totalCallsLength - 50) * COST_PER_MINUTE_CALLS;
			callsMinutesOver = totalCallsLength - 50;
		}

		if (outgoingTexts <= 20) {
			textCost = 0;
		} else {
			textCost = (outgoingTexts - 20) * COST_PER_TEXT_OUT;
			outgoingTextsOver = outgoingTexts - 20;
		}

		cellnetUsage = callCost + textCost;

		totalBeforeTax = callCost + textCost + SYSTEM_ACCESS_FEE + MONTHLY_FEE
				+ EMERGENCY_FEE;
		gst = GST_RATE * totalBeforeTax;
		totalAfterTax = totalBeforeTax + gst;

		// close the input stream
		keyboard.close();

		// Print the header of the summary
		System.out.printf("Cellnet Account Summary: %s\n", invoiceDate);
		System.out.printf("Account Number: %s\n", accountNumber);
		System.out.printf("Invoice Number: %s\n", invoiceNumber);

		// Print out the summary calculated from the data file
		System.out.printf("\n\n");
		System.out.printf("%s\n", accountHoldersName);
		System.out.printf("%s\n", accountAddress);
		System.out.printf("%s, %s\n", city, province);
		System.out.printf("%s\n", postalCode);
		System.out.printf("Regular charges\n");
		System.out.printf("%30s%11s\n", "Description", "Cost");
		System.out.printf("%30s%11.2f\n", "Cellnet usage (see below)", cellnetUsage);
		System.out.printf("%30s%11.2f\n", "Monthly Fee", MONTHLY_FEE);
		System.out.printf("%30s%11.2f\n", "System Access Fee", SYSTEM_ACCESS_FEE);
		System.out.printf("%30s%11.2f\n", "9-1-1 Emergency Access Fee", EMERGENCY_FEE);
		System.out.printf("%30s%11.2f\n", "Total Before Tax", totalBeforeTax);
		System.out.printf("%30s%11.2f\n", "GST", gst);
		System.out.printf("%30s%11.2f\n", "Total After Tax", totalAfterTax);

		System.out.printf("Cellnet Usage charges\n");
		System.out.printf("%30s%20s%8s\n", "Description", "Minutes", "Cost");
		System.out.printf("%30s%20d%8.2f\n", "Regular Minutes included", CALLS_MINS_INCLUDED, 0.0);
		System.out.printf("%30s%20d%8.2f\n", "Minutes over plan", (int) callsMinutesOver, callCost);
		System.out.printf("%30s%20d%8.2f\n", "Text Received", incomingTexts, 0.0);
		System.out.printf("%30s%20d%8.2f\n", "Text sent - included", OUT_TEXTS_INCLUDED, 0.0);
		System.out.printf("%30s%20d%8.2f\n", "Texts send - over", outgoingTextsOver, textCost);
		System.out.printf("Cellnet usage summary ending %s\n", invoiceDate);
	}
}