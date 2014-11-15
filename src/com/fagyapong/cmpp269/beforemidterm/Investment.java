package com.fagyapong.cmpp269.beforemidterm;

import java.util.Scanner;

public class Investment {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double amount;
		int years;
		double interestRate = 0;

		System.out.print("Enter amount: ");
		amount = in.nextDouble();

		System.out.print("Enter the term in years: ");
		years = in.nextInt();

		interestRate = (amount >= 10000 || years >= 5) ? 0.025 : 0.015;
		System.out.println("Amount:        $" + amount);
		System.out.println("Term:          " + years + " years");
		System.out.println("Interest Rate: " + interestRate * 100 + "%");
		in.close();
	}
}
