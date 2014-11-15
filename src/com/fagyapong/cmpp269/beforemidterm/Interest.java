package com.fagyapong.cmpp269.beforemidterm;

public class Interest {

	public static void main(String[] args) {

		double intA = Math.round(0.453 * 100.0) / 100.0;
		double intB = Math.round(0.344 * 100.0) / 100.0;
		double intC = Math.round(0.614 * 100.0) / 100.0;

		System.out.printf("%10s %10.2f\n", "Account A", intA);
		System.out.printf("%10s %10.2f\n", "Account B", intB);
		System.out.printf("%10s %10.2f\n", "Account C", intC);
		double intTotal = intA + intB + intC;
		System.out.printf("%10s %10.2f\n", "Total", intTotal);
	}
}
