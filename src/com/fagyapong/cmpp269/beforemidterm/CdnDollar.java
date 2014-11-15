package com.fagyapong.cmpp269.beforemidterm;

public class CdnDollar {

	public static void main(String[] args) {

		double yesterday, today, change;
		yesterday = 0.9242;
		today = 0.9175;
		change = today - yesterday;

		System.out.printf("%10s%10s\n", "Date", "Rate");
		System.out.printf("%20s\n", "===================");

		System.out.printf("%10s%10.4f\n", "Yesterday", yesterday);
		System.out.printf("%10s%10.4f\n", "Today", today);

		System.out.printf("%10s%10.4f\n", "Change", change);
	}
}
