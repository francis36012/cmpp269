package com.fagyapong.cmpp269.beforemidterm;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		double weightKg;
		double heightMt;
		double bmi;
		// k reads from the keyboard
		Scanner k = new Scanner(System.in);
		System.out.print("Enter your weight (kilograms): ");
		weightKg = k.nextDouble();

		System.out.print("Enter your height (centimeters): ");
		heightMt = (k.nextDouble()) / 100;

		bmi = (weightKg / (heightMt * heightMt));
		if (bmi >= 18.5) {
			if (bmi <= 25) {
				System.out.printf("Your BMI is %.2f\n", bmi);
				System.out.println("You are at an optimal weight");
			} else {
				System.out.printf("Your BMI is %.2f\n", bmi);
				System.out.println("You are overweight (above the optimal)");
			}
		} else {
			System.out.printf("Your BMI is %.2f\n", bmi);
			System.out.println("You underweight (below the optimal)");
		}
		k.close();
	}
}
