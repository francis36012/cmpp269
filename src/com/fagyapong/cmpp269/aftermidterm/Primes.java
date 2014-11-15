package com.fagyapong.cmpp269.aftermidterm;

public class Primes {
	public static void main(String[] args) {
		
		long currentNumber = 1;
		int primeCounter = 0;
		
		for (int i = 1; i <= Long.MAX_VALUE; i++) {
			currentNumber = i;
			if ((currentNumber % 2) == 0) {
				primeCounter++;
				System.out.printf("Prime %d\t%d\n", primeCounter, currentNumber);
			}
		}
	}
	
	
}
