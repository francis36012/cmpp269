package com.fagyapong.cmpp269.beforemidterm;

import java.util.Scanner;

public class Temperature1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a temperature: ");
		double t;
		t = in.nextDouble();

		if (t < 10) {
			System.out.println("Wear jeans");
		} else {
			System.out.println("Wear shorts");
		}
		in.close();
	}
}
