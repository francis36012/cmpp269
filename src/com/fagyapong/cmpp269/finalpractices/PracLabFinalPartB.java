/**
 * Purpose: Read in a string and print out the number of numbers and digits
 * in the string.
 * 
 * Input: A string
 * 
 * Processing: Go through the string, and for each character check whether it
 * is a digit or a letter, and increment the number of digits or letters as
 * appropriate
 * 
 *  Output: The number of digits and letters in the input string.
 */
package com.fagyapong.cmpp269.finalpractices;

import java.util.*;

public class PracLabFinalPartB {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String userString = "";
        int numOfDigits = 0;
        int numOfLetters = 0;
        
        System.out.printf("Enter a string: ");
        userString = keyboard.nextLine();
        
        for (int i = 0; i < userString.length(); i++) {
			numOfDigits = (Character.isDigit(userString.charAt(i))) ? numOfDigits + 1 : numOfDigits;
			numOfLetters = (Character.isLetter(userString.charAt(i))) ? numOfLetters + 1 : numOfLetters;
        }
        
        System.out.printf("Number of letters = %d\n", numOfLetters);
        System.out.printf("Number of digits = %d\n", numOfDigits);
        
        keyboard.close();
    }
}