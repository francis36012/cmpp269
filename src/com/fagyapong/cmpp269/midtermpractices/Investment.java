/**
 * @author Francis Agyapong 
 */
package com.fagyapong.cmpp269.midtermpractices;

import java.util.*;

public class Investment {

	public static void main(String[] args) {

		long principalAmount;
		long accountBalance;
		double rateOfReturn;
		long interest;
		int numYears;

		Scanner input = new Scanner(System.in);

		System.out.printf("What is the value of the initial investment? ");

		// convert amount to pennies
		principalAmount = (long) (input.nextDouble() * 100.0);

		System.out.printf("What is the rate of return? ");
		rateOfReturn = input.nextDouble();

		System.out.printf("What is the term of the investment? ");
		numYears = input.nextInt();

		accountBalance = principalAmount;

		System.out.printf("\n%-5s%-9s%-8s\n", "Year", "Interest", "Balance");
		System.out.printf("=====================\n");
		for (int i = 1; i <= numYears; i++) {
			interest = (long) (Math.round(accountBalance
					* (rateOfReturn / 100.0)));
			accountBalance += interest;
			System.out.printf("%-5d%-9.2f%-8.2f\n", i, interest / 100.0,
					accountBalance / 100.0);
		}
		input.close();
	}
}