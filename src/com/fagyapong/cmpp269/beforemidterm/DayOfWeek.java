package com.fagyapong.cmpp269.beforemidterm;

import java.util.Scanner;

public class DayOfWeek {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String dayString;
		char day; // hold one character

		System.out.print("Enter the day of week: ");
		dayString = in.next();
		// convert it to lower case
		dayString = dayString.toLowerCase();
		switch (dayString) {
		case "monday":
		case "wednesday":
			System.out.println("Go to work");
			System.out.println("Go home");
			break;

		case "tuesday":
		case "thursday":
			System.out.println("Go to work");
			System.out.println("Go home");
			System.out.println("Go swimming");
			break;

		case "friday":
			System.out.println("Go to work");
			System.out.println("Go home");
			System.out.println("Go to the movies");
			break;

		default:
			System.out.println("Relax");
		}
		in.close();
	}
}
