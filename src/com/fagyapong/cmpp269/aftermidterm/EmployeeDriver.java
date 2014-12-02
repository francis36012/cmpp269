package com.fagyapong.cmpp269.aftermidterm;

import java.util.*;

public class EmployeeDriver {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday",
				"Friday", "Saturday", "Sunday"};
		
		String name;
		double rate;
		double hours;
		System.out.printf("ABC Payroll System\n");
		System.out.printf("Enter Name: ");
		name = keyboard.nextLine();
		
		System.out.printf("Rate of Pay: ");
		rate = keyboard.nextDouble();
		
		Employee e = new Employee(name, 0, rate);
		
		for (int i = 0; i < 7; i++) {
			System.out.printf("Hours for " + daysOfWeek[i] + ": ");
			hours = keyboard.nextDouble();
			e.addHours(hours);
		}
		System.out.println(e);
		
		keyboard.close();
	}
}