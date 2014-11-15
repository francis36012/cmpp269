package com.fagyapong.cmpp269.beforemidterm;

import java.util.Scanner;

public class GroceryList {

	public static void main(String[] args) {

		// k reads from the keyboard
		Scanner k = new Scanner(System.in);

		int numberOfItems = 0;
		String item;

		System.out.printf("Enter item (end) to quit: ");
		item = k.nextLine();

		while (!(item.equalsIgnoreCase("end"))) {
			numberOfItems += 1;
			System.out.printf("Enter item (end) to quit: ");
			item = k.nextLine();
		}

		System.out.printf("%d items on the grocery list.", numberOfItems);
		k.close();
	}
}
