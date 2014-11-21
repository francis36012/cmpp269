package com.fagyapong.cmpp269.aftermidterm;

import java.util.ArrayList;
import java.util.Scanner;

public class Mod10Slide13 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		ArrayList<String> groceryList = new ArrayList<String>();
		String item;
		
		System.out.print("Enter grocery item 'quit' to quit: ");
		item = keyboard.nextLine();
		while (!(item.equalsIgnoreCase("quit"))) {
			groceryList.add(item);
			System.out.print("Next item: ");
			item = keyboard.nextLine();
		}
		System.out.println("Here is the grocery list");
		System.out.println(groceryList);
		
		keyboard.close();
	}
}
