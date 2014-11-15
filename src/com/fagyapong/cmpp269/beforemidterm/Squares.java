package com.fagyapong.cmpp269.beforemidterm;

public class Squares {
	public static void main(String[] args) {
		int i, sqr;
		System.out.printf("%6s %6s\n", "I", "Sqr");
		System.out.printf("%6s %6s\n", "------", "------");
		for (i = 1; i <= 3; i++) {
			// body of the loop
			sqr = i * i;
			System.out.printf("%6d %6d\n", i, sqr);
		}
	}
}
