package com.fagyapong.cmpp269.beforemidterm;

import java.util.Scanner;

public class InitialsExtractor {

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);
		String theString;

		char firstInitial, lastInitial;
		System.out.print("Enter the name: ");
		theString = k.nextLine();
		firstInitial = theString.charAt(0);

		lastInitial = theString.charAt(theString.indexOf(" ") + 1);

		System.out.println(firstInitial + "." + lastInitial + ".");
		k.close();
	}
}