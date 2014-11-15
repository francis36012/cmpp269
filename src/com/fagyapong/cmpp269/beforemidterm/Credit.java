package com.fagyapong.cmpp269.beforemidterm;

import java.util.Scanner;

public class Credit {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		boolean isEmployed = false, isRecentGrad = false;

		System.out.print("Are you a graduate (true or false): ");
		isRecentGrad = in.nextBoolean();
		System.out.print("Are you employed (true or false): ");
		isEmployed = in.nextBoolean();

		if (isEmployed) {
			if (isRecentGrad) {
				System.out
						.println("You are approved with a special interest rate");
			} else {
				System.out.println("You are approved for the normal rate");
			}
		} else {
			System.out.println("You are NOT approved");
		}
		in.close();
	}
}