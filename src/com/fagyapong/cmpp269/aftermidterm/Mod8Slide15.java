package com.fagyapong.cmpp269.aftermidterm;

import java.util.Scanner;

public class Mod8Slide15 {
	public static void main(String[] args) {
		// use local variable
		double a, b, c;
		Scanner k = new Scanner(System.in);
		System.out.print("Enter A: ");
		a = k.nextDouble();
		System.out.print("Enter B: ");
		b = k.nextDouble();
		// function call passing a and b
		c = add(a, b);
		System.out.println("Sum is " + c);
		c = subtract(a, b);
		System.out.println("A - B = " + subtract(a, b));
		c = increment(a);
		System.out.println("A incremented is " + c);
		c = decrement(b);
		System.out.println("B decremented is " + c);
		
		k.close();
	}

	public static double add(double a, double b) {
		double sum; // local to add()
		sum = a + b;
		return sum;
	}
	public static double subtract(double a, double b) {
		double difference;
		difference =  a - b;
		return difference;
	}
	public static double increment(double a) {
		double inc = a + 1;
		return inc;
	}
	public static double decrement(double a) {
		double dec = a - 1;
		return dec;
	}
}