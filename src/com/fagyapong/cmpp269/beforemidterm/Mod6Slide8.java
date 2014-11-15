package com.fagyapong.cmpp269.beforemidterm;

public class Mod6Slide8 {
	public static void main(String[] args) {
		String x = "Fab4.";
		int i = 0;
		for (i = 0; i < x.length(); i++) {
			char c = x.charAt(i);
			if (Character.isDigit(c)) {
				System.out.println("Character at position " + i
						+ " is a digit c = " + c);
			} else if (Character.isLetter(c)) {
				System.out.println("Character at position " + i
						+ " is a letter c = " + c);
			} else {
				System.out.println("Character at position " + i
						+ " is unknown c = " + c);
			}
		}
	}
}
