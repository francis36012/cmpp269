package com.fagyapong.cmpp269.beforemidterm;

import java.util.Scanner;

public class CalculatePi {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// k reads from the keyboard
		Scanner k = new Scanner(System.in);
		long i;
		int sign = 1;
		double pi = 0;
		i = 1;
		while (i < 2000000000L) {
			pi += 4.0 / i;
			i += 2;
			pi -= 4.0 / i;

			i += 2;
		}
		System.out.printf("The value of Pi is %.15f\n", pi);

		k.close();
	}
}
