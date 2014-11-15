package com.fagyapong.cmpp269.aftermidterm;

import java.util.Scanner;

public class Globals {
	static double a, b, c;

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("Enter A: ");
		a = k.nextDouble();
		System.out.print("Enter B: ");
		b = k.nextDouble();
		// call add function
		add();
		System.out.println("Sum is " + c);
		subtract();
		System.out.println("A - B = " + c);
		multiply();
		System.out.println("A * B = " + c);
		power();
		System.out.println("A ^ B = " + c);
		
		k.close();
	}

	public static void add() {
		c = a + b;
	}
	public static void subtract() {
		c = a - b;
	}
	public static void multiply() {
		c = a * b;
	}
	public static void power() {
		c = Math.pow(a, b);
	}
}
