package com.fagyapong.cmpp269.beforemidterm;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		double temp1;
		double temp2;
		double tempBig;

		System.out.print("Enter Temperature A: ");
		temp1 = k.nextDouble();

		System.out.print("Enter Temperature B: ");
		temp2 = k.nextDouble();

		if (temp1 > temp2) {
			tempBig = temp1;
		} else {
			tempBig = temp2;
		}

		System.out.println("The biggest temperature was " + tempBig);
		k.close();
	}
}
