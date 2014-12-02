package com.fagyapong.cmpp269.aftermidterm;

class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle() {
		length = 0;
		width = 0;
	}
	
	public Rectangle(double len, double width) {
		this.length = len;
		this.width = width;
	}

	public Rectangle(double side) {
		this.length = side;
		this.width = side;
	}

	// method implementations
	public void setLength(double newLength) {
		this.length = newLength;
	}
	
	public void setWidth(double newWidth) {
		this.width = newWidth;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getArea() {
		double area = this.length * this.width;
		return area;
	}
	
	public String toString() {
		String object = "[ " + this.width + " x " + this.length + " ]\n" +
						"Area = " + this.getArea();
		return object;
	}
}