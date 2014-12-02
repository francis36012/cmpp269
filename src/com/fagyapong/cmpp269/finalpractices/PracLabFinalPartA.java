/**
 * Purpose: Read a cellphone bills file and print out bills that are
 * above the threshold amount.
 * 
 * Input: The threshold amount.
 * 
 * Processing: Read every entry in the file and compare it with the threshold
 * amount, if the current entry is above the threshold amount, print it.
 * 
 * Output: Print the entries that are above the threshold amount.
 * 
 * @author Francis Agyapong
 * @date December, 2014
 */
package com.fagyapong.cmpp269.finalpractices;

import java.util.*;
import java.io.*;

public class PracLabFinalPartA {
    
    public static void main(String[] args) throws IOException {
		
		final int MAX_PHONES = 20;
		int numberOfPhones = 0;
		
		String[] phones = new String[MAX_PHONES];
		double[] bills = new double[MAX_PHONES];
		String filename = "";
		double billThreshold = 0;
		
        Scanner keyboard = new Scanner(System.in);
        
        System.out.printf("Enter the filename: ");
        filename = keyboard.nextLine();
        
        File billsFile = new File(filename);
        FileReader fr = new FileReader(billsFile);
        Scanner fileRead = new Scanner(fr);
        
        System.out.printf("Cell bill threshold: ");
        billThreshold = keyboard.nextDouble();
        
        while (fileRead.hasNext() && (numberOfPhones < 20)) {
			phones[numberOfPhones] = fileRead.next();
			bills[numberOfPhones] = Double.parseDouble(fileRead.next());
			numberOfPhones++;
        }
        
        System.out.printf("All cell phones bills at or above the threshold amount.\n");
        System.out.printf("%15s %10s\n", "Number", "Amount");
        for (int i = 0; i < numberOfPhones; i++) {
			if (bills[i] >= billThreshold) {
				System.out.printf("%15s %10.2f\n", phones[i], bills[i]);
			}
		}
        fileRead.close();
        keyboard.close();
    }
}