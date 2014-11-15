package com.fagyapong.cmpp269.beforemidterm;

import java.util.Scanner;

public class Summation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		int runningSum = 0;

		System.out.printf("Enter a number: ");
		number = input.nextInt();
		while (number != -999) {
			runningSum += number;
			System.out.printf("Enter a number: ");
			number = input.nextInt();
		}
		System.out.printf("The sum is %d\n", runningSum);
		input.close();
	}
}
