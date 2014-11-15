/**
 * Write a program to ask the user to enter a name for a province. If the
 * province name is found print out the population of that province otherwise
 * print an error message stating that province doesn’t exist.
 */
package com.fagyapong.cmpp269.aftermidterm;

import java.io.*;
import java.util.*;

public class ProvinceSearch {
	
	public static void main(String[] args) throws IOException {
		
		File inFile = new File("c:/temp/provincedata.txt");
		FileReader fr = new FileReader(inFile);
		Scanner reader = new Scanner(fr);
		Scanner keyboard = new Scanner(System.in);
		
		String[] provinceNames = new String[10];
		int[] provincePops = new int[10];
		
		String userQuery;
		
		// store the index in which we find the query
		int response = 0;
		
		boolean queryFound = false;
		
		// read  data into the arrays
		int counter = 0;
		System.out.printf("Loading province data...\n");
		System.out.printf("Done.\n");

		while (reader.hasNext()) {
			provinceNames[counter] = reader.nextLine();
			provincePops[counter] = Integer.parseInt(reader.nextLine());
			counter++;
		}
		System.out.printf("Enter the province to find: ");
		userQuery = keyboard.nextLine();

		// Search through the arrays to see if the query exists in the file
		for (int i = 0; i < provinceNames.length; i++) {
			if (provinceNames[i].equalsIgnoreCase(userQuery)) {
				queryFound = true;
				response = i;
				break;
			}
		}
		
		if (queryFound) {
			System.out.printf("The population of %s is %d\n", provinceNames[response], provincePops[response]);
		}
		else {
			System.out.printf("Province name %s not found!\n", userQuery);
		}
		reader.close();
		keyboard.close();
	}
}