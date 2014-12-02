package com.fagyapong.cmpp269.assignment4.std;

import java.io.*;
/**
 * 
 */
import java.util.*;

@SuppressWarnings("unused")
public class Assignment4 {

	static ArrayList<String> plates = new ArrayList<String>();
	static ArrayList<String> ccNumbers = new ArrayList<String>();
	
	final static String PLATE_FILE_LOCATION = "c:/temp/registered.txt";
	final static String CHARGE_FILE_LOCATION = "c:/temp/charges.txt";

	public static void main(String[] args) throws IOException {
		Scanner k = new Scanner(System.in);

		int numCars = 0;
		int s = 0;
		boolean found;

		s = printMenu(k);
		k.nextLine();
		while (s != 22359) {
			switch (s) {
				case 1:
					// Add a car to the lot
					System.out.println("Add a car here!");
					System.out.print("Please enter to continue...");
					k.nextLine();

					break;
				case 2:
					// verify plate
					System.out.println("Verify a plate here!");
					System.out.print("Please enter to continue...");
					k.nextLine();
					break;
				case 22351:
					// produce a report of all the plates
					System.out
							.println("Produce a report of all plates to the file registered.txt here!");
					System.out.print("Please enter to continue...");
					k.nextLine();
					break;
				case 22352:
					// Produce a summary of charges
					System.out
							.println("Write a report of all charges to charges.txt here");
					System.out.print("Please enter to continue...");
					k.nextLine();
					break;
				case 22353:
					// clear out all the cars from the parking lot
					System.out.println("Remove all cars from the list here!");
					System.out.print("Please enter to continue...");
					k.nextLine();
					break;
				default:

			}
			s = printMenu(k);
			k.nextLine();

		}

	}

	static public int printMenu(Scanner k) {
		int s = 0;
		// Clear the screen in BlueJ
		System.out.print('\u000C');

		System.out.println("Welcome to Park and Go Parking");
		System.out.println("Park from 6 - Midnight for a flat fee of $4.00");
		System.out.println("1. Register your vehicle");
		System.out.println("2. Verify vehicle registration");
		System.out.print("Hello enter a Selection: ");
		s = k.nextInt();
		return s;

	}
	
	static public void plateList(ArrayList<String> _plates) throws IOException {
		Date now = new Date();
		File plateFile = new File(PLATE_FILE_LOCATION);
		PrintWriter fileWriter = new PrintWriter(plateFile);
		
		fileWriter.printf("Plate List for %s\n\n", now);
		fileWriter.printf("%15s\n", "Plate");
		fileWriter.printf("===============");
		for (String plate : _plates) {
			fileWriter.printf("%15s\n", plate);
		}
		
		fileWriter.flush();
		fileWriter.close();
	}
	
	static public int addCars(ArrayList<String> _plates, ArrayList<String> _ccNumbers) {
		
		
		int newNum = _plates.size() + 1;
		return newNum;
	}
	
	static public void clearCars() {
		
	}
}
