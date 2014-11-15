package com.fagyapong.cmpp269.aftermidterm;

public class DecTemperatures {
	
	public static void main(String[] args) {
		double[]  decMax = {-2.8, -8.8, 2.3, 7.9, 4.1, -1.4, 11.3, 10.4, 8.9, 8.1,
							5.8, 5.9, 7.8, 4.9, 5.7, -0.9, -0.4, 7.3, 8.3, 6.5, 9.2,
							3.5, 3, 1.1, 6.5, 5.1, -1.2, -5.1, 2, 5.2, 2.1};
		
		double averageTotal = 0;
		double averageMax = decMax[0];
		double averageHighest = decMax[0];
		int aboveZero = 0;
		
		for (double temp : decMax) {
			averageTotal += temp;
			averageHighest = (temp > averageHighest) ? temp : averageHighest;
			
			aboveZero = (temp > 0) ? aboveZero + 1 : aboveZero;
		}
		averageMax = averageTotal / decMax.length;
		System.out.printf("Average is %.2f\n", averageMax);
		System.out.printf("Highest temperature is %.2f\n", averageHighest);
		System.out.printf("Number of days above freezing = %d\n", aboveZero);
	}
}
