package com.fagyapong.cmpp269.beforemidterm;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		float grade;
		char letter = 'X';

		System.out.print("Enter the grade: ");
		grade = in.nextFloat();

		if (grade >= 90) {
			letter = 'A';
		} else if (grade >= 75) {
			letter = 'B';
		} else if (grade >= 60) {
			letter = 'C';
		} else if (grade >= 50) {
			letter = 'D';
		} else {
			letter = 'F';
		}
		System.out.println("Letter grade is " + letter + "\n");
		in.close();
	}
}