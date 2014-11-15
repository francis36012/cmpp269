package com.fagyapong.cmpp269.midtermpractices;

import java.util.*;

public class Temperatures {

	public static void main(String[] args) {

		String cityName;
		String date;

		double maxTemp;
		double minTemp;
		double aveTemp;
		double tempDiff;

		Scanner input = new Scanner(System.in);

		System.out.printf("Enter City Name: ");
		cityName = input.nextLine();

		System.out.printf("Enter Date: ");
		date = input.nextLine();

		System.out.printf("Min temp: ");
		minTemp = input.nextDouble();

		System.out.printf("Max temp: ");
		maxTemp = input.nextDouble();

		aveTemp = (minTemp + maxTemp) / 2;
		tempDiff = maxTemp - minTemp;

		System.out.printf("\nTemperature statistics for %s\n", cityName);
		System.out.printf("For: %s\n", date);
		System.out.printf("Min: %.1f\n", minTemp);
		System.out.printf("Max: %.1f\n", maxTemp);
		System.out.printf("Difference: %.1f\n", tempDiff);
		System.out.printf("Average: %.1f\n", aveTemp);

		input.close();
	}
}