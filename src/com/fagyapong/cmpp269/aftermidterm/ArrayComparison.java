package com.fagyapong.cmpp269.aftermidterm;

import java.util.*;

public class ArrayComparison {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int aLength;
		int bLength;
		
		boolean sameArray = false;
		boolean sameLength = false;
		
		System.out.printf("How many elements for A? ");
		aLength = keyboard.nextInt();
		System.out.printf("How many elements for B? ");
		bLength = keyboard.nextInt();
		
		int[] aArray = new int[aLength];
		int[] bArray = new int[bLength];
		
		System.out.println("Enter the elements for Array A");
		for (int i = 0; i < aLength; i++) {
			System.out.printf("Enter element: ");
			aArray[i] = keyboard.nextInt();
		}
		
		System.out.println("Enter the elements for Array B");
		for (int i = 0; i < bLength; i++) {
			System.out.printf("Enter element: ");
			bArray[i] = keyboard.nextInt();
		}
		
		sameLength = (aLength != bLength) ? false : true;
		
		if (sameLength) {
			for (int i = 0; i < aLength; i++) {
				sameArray = aArray[i] == bArray[i];
				if (!sameArray) {
					break;
				}
			}
		}
		
		if (sameArray) {
			System.out.println("The arrays are the same");
		}
		else {
			System.out.println("The arrays are different");
		}
		
		keyboard.close();
	}
}