package com.fagyapong.cmpp269.beforemidterm;

import java.util.Scanner;

public class PatternMatcher {

	public static void main(String[] args) {

		// k reads from the keyboard
		Scanner k = new Scanner(System.in);
		// put your code here

		String pattern;
		String userString;
		int matches = 0;

		System.out.printf("What do you want the file to contain? ");
		pattern = k.nextLine();

		System.out.printf("Enter the filename \"end\" to quit: ");
		userString = k.nextLine();

		while (!(userString.equalsIgnoreCase("end"))) {

			if ((userString.toLowerCase()).contains(pattern.toLowerCase())) {
				matches += 1;
				System.out.printf("%s matches.\n", userString);
			} else {
				System.out.printf("%s does NOT match.\n", userString);
			}

			System.out.printf("Enter the filename \"end\" to quit: ");
			userString = k.nextLine();
		}

		System.out.printf("Total number of matches = %d\n", matches);
		k.close();
	}
}
