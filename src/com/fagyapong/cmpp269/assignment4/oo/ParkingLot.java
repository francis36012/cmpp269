package com.fagyapong.cmpp269.assignment4.oo;

import java.io.*;
import java.text.*;
import java.util.*;

/**
 * Contains an <code>ArrayList</code> of Cars parked within the <code>parkingLot</code>
 * The class contains methods for adding cars, getting the number of cars registerd,
 * finding cars using plates, printing plates and charge summary to files and
 * sorting the lot based on the plates.
 * 
 * @author Francis Agyapong
 * @version December 2014
 */
public class ParkingLot {

	private ArrayList<Car> parkingLot;
	final private static String PLATE_LIST_FILE = "c:/temp/plateList.txt";
	final private static String CC_REPORT_FILE = "c:/temp/dailyCharges.txt";

	/**
	 * Constructor: Creates an <code>ArrayList</code> of cars called
	 * <code>parkingLot</code>
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public ParkingLot() throws IOException, ClassNotFoundException {
		this.parkingLot = new ArrayList<Car>();
	}

	/**
	 * Returns the number of Cars in the parking lot
	 * @return the number of cars in the parkingLot
	 */
	public int numCars() {
		return parkingLot.size();
	}

	/**
	 * Adds a <code>Car</code> to the parking lot
	 * @param newCar The car being added to the parking lot
	 * @return void
	 */
	public void addCar(Car newCar) {
		parkingLot.add(newCar);
	}

	/**
	 * Looks through the parking Lot to see if there is a car with same 'plate'.
	 * If so, it returns true, otherwise it returns false.
	 * 
	 * @param plate the plate we looking for in the parking lot
	 * @return True if the plate is found or false if otherwise
	 */
	public boolean findCar(String plate) {

		boolean isCarFound = false;
		
		// transverse the list looking for the plate
		int index = 0;
		while (!isCarFound && index < parkingLot.size()) {
            for (Car car : parkingLot) {
                if ((car.getPlate()).equals(plate)) {
                    isCarFound = true;
                    return isCarFound;
                }
            }
            index++;
		}
		
		// return pointer to Car object or null if not found
		return isCarFound;
	}

	/**
	 * Creates the daily charges report to the file c:/temp/dailyCharges.txt
	 * The file is output with a time and date stamp, and makes use of
	 * <code>sortParkingLot()</code> before writing to the file.
	 * 
	 * @throws IOException
	 * @return void
	 */
	public void printCharges() throws IOException {
		sortParkingLot();
		Date current = new Date();
		
		// DecimalFormats for formatting the output of the file appropriately
		DecimalFormat currencyFormat = new DecimalFormat("$#0.00");
		DecimalFormat monthYearFormat = new DecimalFormat("#00");
		DecimalFormat ccvFormat = new DecimalFormat("#000");

		double totalCharges = 0;
		
		PrintWriter pw = new PrintWriter(CC_REPORT_FILE);
		pw.printf("Daily parking summary for %s\r\n\r\n", current.toString());
		pw.printf("%15s%20s%8s%5s%8s\r\n", "Plate", "Credit Card", "Expiry", "CCV", "Charge");
		pw.printf("========================================================\r\n");
		for (Car car : parkingLot) {
			pw.printf("%15s%20s%8s%5s%8s\r\n", car.getPlate(), car.getCcNumber(),
					monthYearFormat.format(car.getCcMonth()) + "/" +
					monthYearFormat.format(car.getCcYear()),
					ccvFormat.format(car.getCcv()),
					currencyFormat.format(car.getCharge()));
			
			totalCharges += car.getCharge();
		}
		pw.printf("========================================================\r\n");
		pw.printf("%15s%41s", "Totals", currencyFormat.format(totalCharges));
		pw.flush();
		pw.close();
	}

	/**
	 * Creates a list of all plates that are registered to park in lot with a date
	 * and time stamp. The file is outputted to c:/temp/plateList.txt
	 * This is one of the two methods that make use of the <code>sortParkingLot()</code>
	 * 
	 * @throws IOException
	 * @return void
	 */
	public void plateList() throws IOException {
		sortParkingLot();
		
		Date dateTime = new Date();
		PrintWriter pw = new PrintWriter(PLATE_LIST_FILE);
		pw.printf("Plate List for %s\r\n\r\n", dateTime.toString());
		pw.printf("%15s\r\n", "Plates");
		pw.printf("===============\r\n");
		
		for (Car car : parkingLot) {
			pw.printf("%15s\r\n", car.getPlate());
		}
		pw.flush();
		pw.close();
	}
	
	/**
	 * Sort the cars in the parking lot based on their plates using the
	 * bubble sort algorithm. 
	 * @return void
	 */
	private void sortParkingLot() {
		
		for (int i = 0; i < parkingLot.size(); i++) {
			for (int j = i + 1; j < parkingLot.size(); j++) {
				if ((parkingLot.get(i).getPlate()).compareToIgnoreCase((parkingLot.get(j).getPlate())) > 0) {
					Car tempCar = parkingLot.get(j);
					parkingLot.set(j, parkingLot.get(i));
					parkingLot.set(i, tempCar);
				}
			}
		}
	}
}