package com.fagyapong.cmpp269.labmidterm;

import java.util.Scanner;

public class Q2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String employeeName;
		double hoursWorked;
		double hourlyWage = 10;
		double plansSold;
		double salary, totalSalary;

		// Initialize to prevent compiler errors
		double commission = 0;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("What is the employee's name: ");
		employeeName = keyboard.nextLine();

		System.out.print("How many hours worked? ");
		hoursWorked = keyboard.nextDouble();

		System.out.print("Enter the total value of monthly plans sold today: ");
		plansSold = keyboard.nextDouble();

		salary = hoursWorked * hourlyWage;

		if (plansSold >= 1000) {
			commission = (1.5 / 100) * 1000;
			commission += (1.75 / 100) * (plansSold - 1000);
		} else {
			commission = (1.5 / 100) * plansSold;
		}

		totalSalary = salary + commission;

		System.out.println("Hourly Salary = $" + salary);
		System.out.println("Monthly Commision = $" + commission);
		System.out.println("Total = $" + totalSalary);

		// close input stream
		keyboard.close();
	}
}
