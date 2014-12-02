package com.fagyapong.cmpp269.aftermidterm;

import java.text.*;

class Employee {
	
	String name;
	double hours;
	double rate;
	
	public Employee(String n, double h, double r) {
		this.name = n;
		this.hours = h;
		this.rate = r;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getHours() {
		return this.hours;
	}
	
	public double getRate() {
		return this.rate;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setHours(double newHours) {
		this.hours = newHours;
	}
	
	public void setRate(double newRate) {
		this.rate = newRate;
	}
	
	public void addHours(double addHours) {
		this.hours += addHours;
	}
	
	public double calcGross() {
		double gross = this.hours * this.rate;
		return gross;
	}
	
	public String toString() {
		
		DecimalFormat decF = new DecimalFormat("$#0.00");
		String r =  "Name: " + name + "\n" +
			        "Hours: " + hours + " Rate = " + decF.format(rate) + " " +
			        "Gross Pay = " + decF.format(this.calcGross())+ "\n";
		
		return r;
	}
}