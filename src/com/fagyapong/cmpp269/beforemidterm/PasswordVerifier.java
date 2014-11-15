package com.fagyapong.cmpp269.beforemidterm;

/**
 * Purpose: Password Verifier
 * 
 * @author Francis Agyapong 
 * @version October 2014
 */
import java.util.Scanner;

public class PasswordVerifier {

	public static void main(String[] args) {

		// k reads from the keyboard
		Scanner k = new Scanner(System.in);

		String userInput;
		boolean validPassword = false;
		boolean validLength;

		boolean hasDigit = false;
		boolean hasLetter = false;

		System.out.printf("Enter the password: ");
		userInput = k.next();

		// if password is less than six, it is invalid
		validLength = (userInput.length() < 6) ? false : true;

		// only check for digits and letters if the length of the password is
		// valid
		if (validLength) {

			// index at which we at in the string
			int index = 0;

			while ((!(hasDigit && hasLetter)) && (index < userInput.length())) {

				// only check once to see if there are digits
				if (!hasDigit) {
					hasDigit = (Character.isDigit(userInput.charAt(index))) ? true
							: false;
				}

				// only check once to see if there are letters
				if (!hasLetter) {
					hasLetter = (Character.isLetter(userInput.charAt(index))) ? true
							: false;
				}

				validPassword = (hasDigit && hasLetter) ? true : false;
				index += 1;
			}
		}

		if (validPassword) {
			System.out.printf("Valid Password\n");
		} else {
			System.out.printf("Invalid Password\n");

		}
		k.close();
	}
}
