package com.fagyapong.cmpp269.assignment4.std;

import java.io.*;
import java.util.*;
import java.text.*;

public class Assignment4 {
	static ArrayList<String> plates = new ArrayList<String>();
	static ArrayList<String> ccNumbers = new ArrayList<String>();

	final static String REGISTERED_FILE = "c:/temp/registered.txt";
	final static String CHARGES_FILE = "c:/temp/dailyReport.txt";

	public static void main(String[] args) throws IOException {
		Scanner k = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		int numCars = 0;
		final double FLAT_FEE = 4.00;
		int s = 0;

		s = printMenu(k);
		k.nextLine();
		while (s != 22359) {
			switch (s) {
				case 1:
					// Add a car to the lot
					numCars = addCar(plates, ccNumbers, k);
					System.out.print("Please enter to continue...");
					k.nextLine();

					break;
				case 2:
					// verify plate
					if (verifyPlate(plates, k)) {
						System.out.println("You are registered in the lot");
					}
					else {
						System.out.println("You are NOT registered,");
						System.out.println("please register and pay the $"
								+ FLAT_FEE + " flat fee.");
					}
					System.out.print("Please enter to continue...");
					k.nextLine();
					break;
				case 22351:
					// produce a report of all the plates

					sortList(plates, ccNumbers);
					plateList(plates);
					break;
				case 22352:
					// Produce a summary of charges

					sortList(plates, ccNumbers);
					printCharges(plates, ccNumbers);
					break;
				case 22353:
					// clear out all the cars from the parking lot
					clearCars(plates, ccNumbers);
					break;
				default:

			}
			s = printMenu(k);
			k.nextLine();
		}

	}

	/**
	 * Clears the screen, display the menu, allows the user to enter their
	 * selection and then return the integer value of that selection.
	 */
	static public int printMenu(Scanner k) {
		int s = 0;
		// Clear the screen in BlueJ
		// System.out.print ('\u000C');

		System.out.println();
		System.out.println("Welcome to Park and Go Parking");
		System.out.println("Park from 6 - Midnight for a flat fee of $4.00");
		System.out.println("1. Register your vehicle");
		System.out.println("2. Verify vehicle registration");
		System.out.print("Hello enter a Selection: ");
		s = k.nextInt();
		return s;

	}

	/**
	 * Print a report of license plates of all registered vehicles to the file
	 * registered.txt User enters secret code 22351 to invoke this function.
	 */
	public static void plateList(ArrayList<String> _plates) throws IOException {
		Date now = new Date();
		File registeredPlates = new File(REGISTERED_FILE);
		PrintWriter out = new PrintWriter(registeredPlates);

		out.printf("Plate List for %s\n\n", now);
		out.printf("%15s\n", "Plate");
		out.printf("===============\n");
		for (String plate : _plates) {
			out.printf("%15s\n", plate);
		}

		out.flush();
		out.close();
	}

	/**
	 * Print a report of license plates and credit card numbers that need to be
	 * manually charged for parking on a specific evening to the file
	 * dailyCharges.txt. User enters secret code 22352 to invoke this function
	 *
	 * @param _plates
	 * @param ccNumbers
	 */
	public static void printCharges(ArrayList<String> _plates,
			ArrayList<String> _ccNumbers) throws IOException {

		final double eveningCharge = 4.00;
		double totalCharge = 0;
		DecimalFormat decF = new DecimalFormat("$#0.00");
		Date now = new Date();
		File lotCharges = new File(CHARGES_FILE);
		PrintWriter out = new PrintWriter(lotCharges);

		out.printf("Daily parking summary for %s\n\n", now);
		out.printf("%15s %20s %10s\n", "Plate", "Credit Card", "Charge");
		out.printf("===============================================\n");
		for (int i = 0; i < _plates.size(); i++) {
			out.printf("%15s %20s %10s\n", _plates.get(i), _ccNumbers.get(i),
					decF.format(eveningCharge));
			totalCharge += eveningCharge;
		}
		out.printf("===============================================\n");
		out.printf("%15s %31s\n", "Total charge", decF.format(totalCharge));
		out.flush();
		out.close();
	}

	/**
	 * Prompts the user for their license plate number and credit card number
	 * and places that information at the end of the two arrays. Returns the new
	 * number of cars in the lot (e.g. numCars incremented by one)
	 *
	 * @return The new number of cars in the lot (e.g. numCars incremented by
	 *         one)
	 */
	public static int addCar(ArrayList<String> _plates,
			ArrayList<String> _ccNumbers, Scanner keyboard) {
		String regPlate;
		String cardNumber;

		System.out.println("Register your vehicle");
		System.out.print("Enter your plate number: ");
		regPlate = keyboard.nextLine();
		System.out.print("Enter your Credit Card Number ($4.00 charge): ");
		cardNumber = keyboard.nextLine();

		_plates.add(regPlate);
		_ccNumbers.add(cardNumber);
		System.out.println("Thank you, your plate " + regPlate
				+ " has been added to the lot.");

		return _plates.size();
	}

	/**
	 * Clears out all the elememts in the plates and ccNumbers arrays (set them
	 * to "". It returns 0, which is the number of cars now stored in the
	 * arrays. User enters secret code 22353 to invoke this function
	 *
	 * @return 0, which is the number of cars now stored in the arrays
	 */
	public static int clearCars(ArrayList<String> _plates,
			ArrayList<String> _ccNumbers) {
		_plates.clear();
		_ccNumbers.clear();

		return _plates.size();
	}

	public static boolean verifyPlate(ArrayList<String> _plates,
			Scanner keyboard) {
		System.out.println("Verify your registration");
		System.out.print("Enter your plate number: ");
		String searchPlate = keyboard.nextLine();
		boolean plateFound = false;
		int counter = 0;
		while (!plateFound && counter < _plates.size()) {
			if (_plates.get(counter).equals(searchPlate)) {
				plateFound = true;
			}
			counter++;
		}
		return plateFound;
	}

	public static void sortList(ArrayList<String> _plates,
			ArrayList<String> _ccNumbers) {
		for (int i = 0; i < _plates.size(); i++) {
			for (int j = i + 1; j < _plates.size(); j++) {
				if (_plates.get(i).compareToIgnoreCase(_plates.get(j)) > 0) {
					String plateTemp = _plates.get(i);
					_plates.set(i, _plates.get(j));
					_plates.set(j, plateTemp);

					String ccNumTemp = _ccNumbers.get(i);
					_ccNumbers.set(i, _ccNumbers.get(j));
					_ccNumbers.set(j, ccNumTemp);
				}
			}
		}
	}
}