package com.fagyapong.cmpp269.finals;

public class question3HB {
	public static void main(String[] args) {
		
		// put your code here
		double[] temp = { 6.1, 5.3, 12.2, 11.54 };

		double average = calculateAverage(temp);
		System.out.print("The average is " + average);
	}

	public static double calculateAverage(double[] values) {

		int arrayLength = values.length;
		double currentTotal = 0;
		double average = 0;

		for (double currValue : values) {
			currentTotal += currValue;
		}
		average = currentTotal / arrayLength;
		return average;
	}
}