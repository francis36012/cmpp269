package com.fagyapong.cmpp269.beforemidterm;

import java.io.*;

public class SpeedTable {

	public static void main(String[] args) throws IOException {

		double mph, kph;

		PrintWriter out = new PrintWriter("c:/temp/speedtable.txt");

		out.printf("%10s %10s%n", "MPH", "KPH");
		out.printf("%10s %10s%n", "==========", "==========");
		for (mph = 20; mph <= 80; mph += 10) {

			kph = mph * 1.61;
			out.printf("%10.0f %10.0f%n", mph, kph);
		}
		out.close();
	}
}
