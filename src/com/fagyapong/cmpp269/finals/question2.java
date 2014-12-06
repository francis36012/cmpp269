package com.fagyapong.cmpp269.finals;

import java.util.*;

/**
 * Purpose: Read in a string from the user and reverse words the string
 * 
 * Input: A string from the user through the keyboard.
 * 
 * Processing: The program reverses the words in a  string that the user types in
 * 
 * Output: The reversed version of the string the user typed in
 * 
 * @author Francis Agyapong 
 */
public class question2 {
	
	public static void main(String[] args) {
		
		String userString;
		Scanner keyboard = new Scanner(System.in);

		System.out.printf("Enter the sentence: ");

		userString = keyboard.nextLine();
		userString = reverseWords(userString); 

		System.out.printf(userString);
		
		keyboard.close();
	}
	
	/**
	 * Takes in a string and returns a reversed(words) version of it
	 * @param inputString The string to reverse 
	 * @return The reversed string
	 */
	public static String reverseWords(String inputString) {
	
		String[] words;
		
		// split the sentence into words, using a space as a delimeter
		words = inputString.split(" ");

		String reversed = "";
		for (int i = words.length - 1; i >= 0; i--) {
			
			// donot add a space after the word if it is the last word
			if (i == 0) {
				reversed += words[i]; 
			}
			else {
				reversed += words[i] + " "; 
			}
		}
		return reversed;
	}
}