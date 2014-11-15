package com.fagyapong.cmpp269.beforemidterm;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double score1, score2, score3, average;
		boolean goAgainFlag;

		do {
			System.out.printf("Enter 3 numbers: ");
			score1 = in.nextDouble();
			score2 = in.nextDouble();
			score3 = in.nextDouble();
			average = (score1 + score2 + score3) / 3;
			System.out.printf("The average is = %.1f\n", average);
			System.out.printf("Do you want to go again (true or false)? ");
			goAgainFlag = in.nextBoolean();
		} while (goAgainFlag);

		in.close();
	}
}
