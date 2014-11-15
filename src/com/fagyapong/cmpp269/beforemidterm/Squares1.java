package com.fagyapong.cmpp269.beforemidterm;

import java.io.*;

public class Squares1 {

	public static void main(String[] args) throws IOException {

		PrintWriter out = new PrintWriter("c:/temp/squares.txt");

		int i;
		out.printf("%10s %10s%n", "Number", "Square");

		for (i = 1; i <= 10; i++) {
			// when using printf must use \r and \n, println works ok though
			out.printf("%10d %10d%n", i, i * i);
		}
		out.close();
	}
}