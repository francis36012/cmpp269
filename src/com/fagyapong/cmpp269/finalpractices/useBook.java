// A driver program for the Book class
package com.fagyapong.cmpp269.finalpractices;

import java.util.Scanner;

public class useBook {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int p;
		Book b = new Book("Java for Everyone", 500);
		System.out.print("What page have you read to? ");
		p = k.nextInt();
		b.setBookmark(p);
		System.out.println("You are currently on page " + b.getBookmark());
		System.out.println("You are currently " + b.getPercentageComplete()
				+ " % complete");
		k.close();
	}
}