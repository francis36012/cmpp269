package com.fagyapong.cmpp269.beforemidterm;

public class DistanceConverter {

	public static void main(String[] args) {

		System.out.printf("%-8s %-8s\n", " MPH", " KPH");
		System.out.printf("======== ========\n");
		for (int i = 20; i <= 80; i += 10) {
			System.out.printf("%8d %8.0f\n", i, i * 1.61);
		}
	}
}
