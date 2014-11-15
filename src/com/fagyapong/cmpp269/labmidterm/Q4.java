package com.fagyapong.cmpp269.labmidterm;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		int userOption;
		double total = 0;
		double currentUserInput;

		Scanner keyboard = new Scanner(System.in);

		do {
			System.out.println("1. Addition\t2. Substraction\t3. Exit");
			System.out.print("Enter menu option: ");
			userOption = keyboard.nextInt();

			switch (userOption) {
			case 1:
				System.out.print("Enter the value to add to the total: ");
				currentUserInput = keyboard.nextDouble();
				total += currentUserInput;
				System.out.printf("Subtotal: %.2f\n", total);
				break;

			case 2:
				System.out
						.print("Enter the value to subtract from the total: ");
				currentUserInput = keyboard.nextDouble();
				total -= currentUserInput;
				System.out.printf("Subtotal: %.2f\n", total);
				break;

			// Added 3 to the cases to prevent the error message from printing
			// if the option is 3
			case 3:
				break;

			default:
				System.out.println("Error: Invalid option");
			}
		} while (userOption != 3);

		// close input stream
		keyboard.close();
		System.out.printf("The final total is %.2f", total);
	}
}
