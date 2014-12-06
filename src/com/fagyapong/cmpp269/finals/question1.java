package com.fagyapong.cmpp269.finals;

import java.io.*;
import java.util.*;
/**
 * Purspose: Read in a grades file and print the course with lowest grade
 * 
 * Input: The path to the grades file
 * 
 * Processing: The program goes through the file and compares the current grade
 * with another grade stored in a variable, if the current grade is less than the current
 * lowest grade, the current grade becomes the lowest grade. The lowest grade variable is initially
 * set to 100.
 * 
 * Output: The course with the lowest grade is printed with its grade
 * @author Francis Agyapong 
 */
public class question1 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner keyboard = new Scanner(System.in);
		String fileLocation;
		
		System.out.printf("Enter the filename: ");
		fileLocation = keyboard.nextLine();
		
		File gradesFile = new File(fileLocation);
		Scanner fileReader = new Scanner(gradesFile);
		
		String currentCourse = "";
		double currentGrade = 0;
		
		String lowestCourse = "";
		double lowestGrade = 100;
		
		while (fileReader.hasNext()) {
			currentCourse = fileReader.next();
			currentGrade = fileReader.nextDouble();
			
			if (currentGrade < lowestGrade) {
				lowestGrade = currentGrade;
				lowestCourse = currentCourse;
			}
		}
		
		fileReader.close();
		keyboard.close();
		
		System.out.printf("Course with the lowest grade:\n");
		System.out.printf("%s: %.2f\n", lowestCourse, lowestGrade);
	}
}