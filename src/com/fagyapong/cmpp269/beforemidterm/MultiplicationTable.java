/**
 * Print the multiplication table from (1 x 1) to (12 x 12)
 */
package com.fagyapong.cmpp269.beforemidterm;

public class MultiplicationTable {

	public static void main(String[] args) {

		int i, j;
		System.out.printf(
				"   |%4d|%4d|%4d|%4d|%4d|%4d|%4d|%4d|%4d|%4d|%4d|%4d|\n", 1, 2,
				3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		System.out
				.printf("----------------------------------------------------------------\n");
		for (i = 1; i <= 12; i++) {
			System.out.printf("%3d", i);
			for (j = 1; j <= 12; j++) {
				System.out.printf("|%4d", i * j);
			}
			System.out.printf("|\n");
		}
	}
}