package com.fagyapong.cmpp269.aftermidterm;

public class AverageTemperature {
	
	public static void main(String[] args) {
		
		float[] numbers = {24, 26, 38, 28};
		float total = 0;
		float average = 0;
		
		for (float n : numbers) {
			System.out.printf("%.0f\n", n);
			total += n;
		}
		average = total / numbers.length;
		System.out.printf("Average is %.2f\n",  average);
	}
}
