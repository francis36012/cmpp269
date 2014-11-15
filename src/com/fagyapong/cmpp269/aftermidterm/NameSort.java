package com.fagyapong.cmpp269.aftermidterm;

import java.util.Scanner;

public class NameSort {
	public static void main(String[] args) {
		
		String[] names = new String[10];
		String input = "";
		int numberOfNames = 0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Enter a name (end to quit): ");
		input = keyboard.next();
		
		while (!(input.equalsIgnoreCase("end"))) {
			names[numberOfNames] = input;
			numberOfNames++;
			System.out.printf("Enter a name (end to quit): ");
			input = keyboard.next();
		}
		
		if (numberOfNames == 1) {
			System.out.printf("Nothing to sort\n");
			System.out.printf("%s\n", names[0]);
		}
		else {
			for (int i = 0; i < numberOfNames; i++) {
				for (int j = i + 1; j < numberOfNames; j++) {
					if (names[i].compareToIgnoreCase(names[j]) > 0) {
						String temp = names[j];
						names[j] = names[i];
						names[i] = temp;
					}
				}
			}
			System.out.printf("Here is the sorted list...\n");
			for (int i = 0; i < numberOfNames; i++) {
				System.out.printf("%s\n", names[i]);
			}
		}
		keyboard.close();
	}
}