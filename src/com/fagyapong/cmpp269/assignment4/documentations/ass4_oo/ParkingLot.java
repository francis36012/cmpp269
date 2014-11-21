package com.fagyapong.cmpp269.assignment4.documentations.ass4_oo;
/**
 /**
 * Purpose: 
 * Input:
 *
 * Processing done:
 *
 * Output:
 *
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.io.*;
import java.util.*;

// make this class Serializable and its dependent classes (Car)
@SuppressWarnings("unused")
public class ParkingLot {
	private ArrayList<Car> parkingLot;
	private static String plateListFile = "c:/temp/plateList.txt";
	private static String ccReport = "c:/temp/ccReport.txt";
	private static double charge = 4.00;
	private Car x;

	// Constructor
	public ParkingLot() throws IOException, ClassNotFoundException {
		parkingLot = new ArrayList<Car>();
	}

	// returns the number of cars in the parkingLot
	public int numCars() {
		return parkingLot.size();
	}

	// Add a car to the parking lot
	public void addCar(Car newCar) {
		parkingLot.add(newCar);
	}

	// return the Car info from a plate, return null if not found
	public Car findCar(String plate) {
		Car result;
		result = null;

		boolean isCarFound = false;
		int index = 0;
		while (!isCarFound && index < parkingLot.size()) {
            for (Car car : parkingLot) {
                if ((car.getPlate()).equals(plate)) {
                    result = car; 
                    isCarFound = true;
                }
            }
            index++;
		}
		
		// transverse the list looking for the plate
		// LOOP TO TRANSVERSE THE ARRAYLIST
		// return pointer to Car object or null if not found
		return result;
	}

	// create the daily charges report
	public void printCharges() throws IOException {
		// WRITE CODE HERE
	}

	// create the list of plates registered in the parking lot
	public void plateList() throws IOException {
		// WRITE CODE HERE
	}

}