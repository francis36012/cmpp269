package com.fagyapong.cmpp269.aftermidterm;

public class Arrays {
	
	public static void main(String[] args) {
		float[] numbers = {75, 78, 66, 95};
		
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		
		for (int i = 0; ;) {
			if (i > numbers.length)
				break;
			System.out.println(numbers[i]);
			i++;
		}
		System.out.println("--------------------------------------");
		for (float n : numbers) {
			System.out.println(n);
		}
	}
}
