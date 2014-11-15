package com.fagyapong.cmpp269.beforemidterm;

import java.util.Scanner;

public class LargestName {

	public static void main(String[] args) {
		String name, lname;
		Scanner k = new Scanner(System.in);
		lname = "";
		System.out.print("Enter a name: ");
		name = k.nextLine();
		while (name.compareTo("end") != 0) {
			if (name.compareTo(lname) > 0) {
				// remember 'name' as the largest name
				lname = name;
			}

			System.out.print("Enter a name: ");
			name = k.nextLine();

		}
		System.out.println("The largest name: " + lname);
		k.close();
	}
}