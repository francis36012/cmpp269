package com.fagyapong.cmpp269.beforemidterm;

import java.io.*; // We are using a File object so we need java.io.*
import java.util.Scanner;

public class Grades {

	public static void main(String[] args) throws IOException {
		String courseHighest = "", course = "";
		double highestGrade = 0, grade;

		File f = new File("c:/temp/grades.txt");
		Scanner in = new Scanner(f);

		while (in.hasNext()) {
			course = in.next();// read in next grade from file
			grade = in.nextDouble();

			if (grade > highestGrade) {
				courseHighest = course;
				highestGrade = grade;
			}
		}
		in.close();
		System.out.printf("Highest grade was in %s grade was: %.1f",
				courseHighest, highestGrade);
	}
}
