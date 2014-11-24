package com.fagyapong.cmpp269.finalpractices;

import java.util.*;

public class PracLabFinalPartC {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double value = 0;
		double result = 0;

		String operation = "";

		System.out.printf("Enter a value: ");
		value = Double.parseDouble(keyboard.nextLine());

		System.out.printf("Enter an operation, ++ for increment, "
				+ "-- for decrement, and x3 for triple: ");

		operation = keyboard.nextLine();

		switch (operation) {
		case "++":
			result = increment(value);
			break;
		case "--":
			result = decrement(value);
			break;
		case "x3":
			result = triple(value);
			break;
		default:
			System.out.printf("Invalid operation\n");
		}
		keyboard.close();
		System.out.printf("Result is %.1f\n", result);
	}

	public static double increment(double num) {
		return ++num;
	}

	public static double decrement(double num) {
		return --num;
	}

	public static double triple(double num) {
		return num * 3;
	}
}