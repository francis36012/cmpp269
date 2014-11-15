package com.fagyapong.cmpp269.beforemidterm;

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner i = new Scanner(System.in);
		float a = 0, b = 0;
		float c = 0;

		System.out.println("Enter a:");
		a = i.nextFloat();
		System.out.println("Enter b:");
		b = i.nextFloat();
		String name;
		System.out.print("Enter your name: ");
		name = i.nextLine();
		c = a + b;
		System.out.println("Your name is " + name);
		System.out.println("The sum of a and b is " + c);
	}
}