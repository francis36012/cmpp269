package com.fagyapong.cmpp269.beforemidterm;

import java.util.Scanner;

public class Initials {

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);
		String theString;
		int i;
		char firstInitial, lastInitial;
		System.out.print("Enter the name: ");
		theString = k.nextLine();
		firstInitial = theString.charAt(0);
		i = 1;

		while (theString.charAt(i) != ' ') {
			i++;
		}

		// Advanced to start of last name
		i++;
		lastInitial = theString.charAt(i);

		// without the "" it prints the Unicode value of the chars
		System.out.println(firstInitial + "" + lastInitial);

		k.close();
	}
}
