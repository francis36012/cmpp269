package com.fagyapong.cmpp269.beforemidterm;

import java.util.Scanner;

public class testOne {
	public static void main(String[] args) {
		String name; // To hold a name
		int hours; // Hours worked
		double payRate, // Hourly pay rate
		grossPay; // Gross pay

		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your name? ");
		name = keyboard.nextLine();

		System.out.print("How many hours did you work this week? ");
		hours = keyboard.nextInt();

		System.out.print("What is your hourly pay rate? ");
		payRate = keyboard.nextDouble();

		grossPay = payRate * hours;
		System.out.println(name + "'s gross pay is $" + grossPay);

		keyboard.close();
	}
}
