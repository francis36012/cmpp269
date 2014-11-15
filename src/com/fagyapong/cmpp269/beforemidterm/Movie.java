package com.fagyapong.cmpp269.beforemidterm;

import java.util.Scanner;

public class Movie {
	public static void main(String[] args) {
		double amount;

		// k reads from the keyboard
		Scanner k = new Scanner(System.in);

		System.out.print("Enter amount of money left: ");

		amount = k.nextDouble();

		if (amount >= 30) {
			System.out.println("Text Marilyn and go to the movie");
		} else {
			System.out.println("Check what's on TV");
		}
		k.close();
	}
}
