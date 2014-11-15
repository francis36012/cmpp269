package com.fagyapong.cmpp269.aftermidterm;

import java.util.Scanner;

public class EmployeeHours {

	public static void main(String[] args) {

		final int EMPLOYEES = 3; // Number of employees
		double[] hours = new double[EMPLOYEES]; // Array of hours
		int index;

		double totalHours = 0;
		double averageHours = 0;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the hours worked by " + EMPLOYEES
				+ " employees.");

		// Get the hours for each employee.
		for (index = 0; index < EMPLOYEES; index++) {
			System.out.print("Employee " + (index + 1) + ": ");
			hours[index] = keyboard.nextDouble();
		}
		System.out.println("The hours you entered are:");

		// Display the values entered.
		for (index = 0; index < EMPLOYEES; index++) {
			System.out.println(hours[index]);
		}

		for (double hour : hours) {
			totalHours += hour;
		}

		averageHours = totalHours / EMPLOYEES;
		System.out.printf("Total Hours worked = %d\n", (int) totalHours);
		System.out.printf("Average Hours worked = %d\n", (int) averageHours);
		keyboard.close();
	}
}