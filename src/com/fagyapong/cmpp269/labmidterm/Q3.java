package com.fagyapong.cmpp269.labmidterm;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		double tempHigh;
		double tempLow;

		double tempFahr;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the lower celsius temperature: ");
		tempLow = keyboard.nextDouble();

		System.out.print("Enter the higher celsius temperature: ");
		tempHigh = keyboard.nextDouble();

		System.out.printf("%7s %10s\n", "Celsius", "Fahrenheit");

		for (int i = (int) tempLow; i <= tempHigh; i += 5) {
			tempFahr = (i * (9.0 / 5.0)) + 32;
			System.out.printf("%7.2f %10.2f\n", (double) i, tempFahr);
		}
		// close input stream
		keyboard.close();
	}
}
