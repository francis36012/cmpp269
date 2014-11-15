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

public class Mod3Slide6 {
	public static void main(String[] args) {
		System.out.print("Enter the temperature: ");
		double t;
		Scanner k = new Scanner(System.in);
		t = k.nextDouble();

		if (t < -10) {
			System.out.println("Wear a coat");
			System.out.println("Wear a hat");
			System.out.println("Wear gloves");
		}
		System.out.println("Don't worry, you're good");
		k.close();
	}
}
