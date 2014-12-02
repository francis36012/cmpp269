package com.fagyapong.cmpp269.aftermidterm;

public class RectangleDriver {
	
	public static void main(String[] args) {
		
		Rectangle kitchen = new Rectangle(14, 11);
		Rectangle den = new Rectangle(10, 8);
		Rectangle bathroom = new Rectangle(8, 5);

		double totalArea = 0;
		
		totalArea = (kitchen.getArea() + den.getArea() + bathroom.getArea());
		
		System.out.printf("Apartment Square Footage Report\n");
		System.out.println("Kitchen: " + kitchen);
		System.out.println("Den: " + den);
		System.out.println("Bathroom: " + bathroom);
		
		System.out.printf("Total area is %.0f sq ft\n", totalArea);
	}
}