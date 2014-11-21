package com.fagyapong.cmpp269.aftermidterm;

import java.util.*;

public class Mod10Slide26 {
	
	static ArrayList<String> callQueue= new ArrayList<String>();
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int option;
		String userInput = "";
		
		printMenu();
		System.out.printf("Enter your option: ");
		option = Integer.parseInt(keyboard.nextLine());
		
		while (option != 4) {
			switch (option) {
				case 1:
					System.out.printf("Enter callback #: ");
					userInput = keyboard.nextLine();
					addNumber(callQueue, userInput);
					break;
				case 2:
					System.out.printf("Next phone number to call: %s\n", getNextNumber(callQueue));
					break;
				case 3:
					printQueue(callQueue);
					break;
				default:
					System.out.printf("Invalid option\n");
			}
			printMenu();
			System.out.printf("Enter your option: ");
			option = Integer.parseInt(keyboard.nextLine());
		}
		keyboard.close();
	}
	
	public static void addNumber(ArrayList<String> queue, String number) {
		queue.add(number);
	}
	
	public static void printQueue(ArrayList<String> callQueue) {
		int position = 0;
		System.out.printf("Callback list\n\n");
		System.out.printf("%8s %12s\n", "Position", "Number");
		
		for (String number : callQueue) {
			System.out.printf("%-8d %12s\n", position + 1, number);
			position++;
		}
		System.out.printf("\n");
	}
	
	public static String getNextNumber(ArrayList<String> callQueue) {
		String nextInQueue = callQueue.get(0);
		callQueue.remove(0);
		return nextInQueue;
	}
	
	public static void printMenu() {
		System.out.printf("Call Center System\n\n");
		System.out.printf("1) Add a number\n");
		System.out.printf("2) Retrieve next number\n");
		System.out.printf("3) Show all numbers waiting for callback\n");
		System.out.printf("4) Exit\n");
	}
}