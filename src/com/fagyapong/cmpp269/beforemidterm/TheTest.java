package com.fagyapong.cmpp269.beforemidterm;

/**
 * Purpose: 
 * Input:
 *
 * Processing done:
 *
 * Output:
 *
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class TheTest {
	public static void main(String[] args) {
		// k reads from the keyboard
		Scanner k = new Scanner(System.in);
		double x, y;
		System.out.print("Enter a number x: ");
		x = k.nextDouble();
		y = x + 1;
		System.out.println("Incremented value of x is: " + y);
		k.close();
	}
}
