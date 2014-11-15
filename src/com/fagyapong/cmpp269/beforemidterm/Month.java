package com.fagyapong.cmpp269.beforemidterm;

import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int month = 0;
		do {
			System.out.print("Enter the month #: ");
			month = in.nextInt();
		} while (month < 0 || month > 12);

		System.out.println("Month number is " + month);
		in.close();
	}
}