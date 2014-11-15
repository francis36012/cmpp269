package com.fagyapong.cmpp269.aftermidterm;

import java.util.*;

public class GroceryList {
	
	public static void main(String[] args) {
		
		String[] list = new String[100];
		
		Scanner keyboard = new Scanner(System.in);
		
		String item = "";
		int counter = 0;
		
		System.out.printf("Enter item (end to quit): ");
		item = keyboard.nextLine();
		
		while (counter < 100 && !(item.equalsIgnoreCase("end"))) {
			list[counter] = item;
			counter++;
			System.out.printf("Enter item (end to quit): ");
			item = keyboard.nextLine();
		}
		
		keyboard.close();
		System.out.printf("%d items input\n", counter);
		System.out.printf("Here is the list in reverse order\n");
		
		for (int i = counter - 1; i >= 0; i--) {
			System.out.printf("%s\n", list[i]);
		}
	}
}