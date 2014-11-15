package com.fagyapong.cmpp269.beforemidterm;

import java.io.*;
// For the scanner
import java.util.Scanner;

public class Type {

	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the filename to be displayed: ");
		String filename;
		filename = keyboard.nextLine();
		// Open the file and attach the 'in' Scanner object to it
		File f = new File(filename);
		// Create Scanner object attached to file
		Scanner in = new Scanner(f);
		// while there is more data
		while (in.hasNext()) {
			String str;
			str = in.nextLine();
			System.out.println(str);
		}
		keyboard.close();
		in.close();
	}
}
