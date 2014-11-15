package com.fagyapong.cmpp269.beforemidterm;

import java.util.Scanner;

public class PetFood {

	public static void main(String[] args) {

		double pricePerKgA = 0.15;
		double pricePerKgB = 0.10;
		double pricePerKgC = 0.08;

		double price = 0;
		double weight;

		String grade;

		Scanner k = new Scanner(System.in);
		// put your code here

		System.out
				.println("Our pet food is available in three grades: A, B, and C");

		System.out.print("Enter the food grade: ");
		grade = k.next();

		System.out.print("Enter weight (kg): ");
		weight = k.nextDouble();

		switch (grade.toLowerCase()) {
		case "a":
			price = weight * pricePerKgA;
			break;
		case "b":
			price = weight * pricePerKgB;
			break;
		case "c":
			price = weight * pricePerKgC;
			break;
		default:
			System.out.println("Invalid pet food grade");
			price = 0;
		}

		System.out.printf("The price of %.1fkg grade %s pet food is: $%.2f",
				weight, grade, price);
		k.close();
	}
}