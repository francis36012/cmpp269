package com.fagyapong.cmpp269.aftermidterm;

import java.util.Scanner;

public class Mod8Slide34 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		double grade = 0;
		System.out.print("Enter the grade: ");
		grade = k.nextDouble();
		if (isValidGrade(grade)) {
			System.out.println(grade + " is a valid grade.");
		} else {
			System.out.println(grade + " is out of range.");
		}
		k.close();
	}
	
	public static boolean isValidGrade(double grade) {
		return (grade >= 0 && grade <= 100);
	}
}