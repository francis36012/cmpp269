package com.fagyapong.cmpp269.beforemidterm;

public class Raise {
	public static void main(String[] args) {
		float salary = 11.50F;
		int raiseInCents = 50;
		double newSalary;
		newSalary = salary + (raiseInCents / 100.0);
		System.out.println("New Salary is $" + newSalary);
	}
}
