package com.fagyapong.cmpp269.aftermidterm;

import java.util.Scanner;

public class Mod8Slide23 {
	public static void main(String[] args) {
		double[] grades = { 50, 60, 70, 80, 90, 100 };
		double amount;
		Scanner in = new Scanner(System.in);
		System.out.println("The grades array before the increase.");
		print(grades);
		System.out.print("Enter the percentage increase: ");
		amount = in.nextDouble();
		increase(grades, amount);
		System.out.println("Grades after");
		print(grades);
		int c;
		c = numAPlus(grades);
		System.out.println("Number of A+ = " + c);
		
		in.close();
	}
	
	public static void increase(double[] grades, double amount) {
		
		for (int i = 0; i < grades.length; i++) {
			double extraPerc = (amount / 100.0) * grades[i];
			grades[i] = (grades[i] + extraPerc > 100.0) ? 100 : grades[i] + extraPerc;
		}
	}
	
	public static int numAPlus(double[] grades) {
		int result = 0;
		
		for (double grade : grades) {
			result = (grade >= 90) ? result + 1 : result;
		}
		return result;
	}
	
	public static void print(double[] grades) {
		for (int i = 0; i < grades.length; i++) {
			System.out.printf("array[%d] = %.2f\n", i, grades[i]);
		}
	}
}