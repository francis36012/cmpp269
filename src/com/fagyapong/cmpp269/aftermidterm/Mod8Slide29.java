package com.fagyapong.cmpp269.aftermidterm;

import java.util.Scanner;

public class Mod8Slide29 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String t, s;
		System.out.print("Enter a String: ");
		t = in.nextLine();
		s = lettersOnly(t);
		System.out.println("Letters only");
		System.out.println(s);

		in.close();
	}
	
	public static String lettersOnly(String t) {
		String temp = "";
		
		for (int i = 0; i < t.length(); i++) {
			if (Character.isLetter(t.charAt(i))) {
				temp += t.charAt(i);
			}
		}
		return temp;
	}
}