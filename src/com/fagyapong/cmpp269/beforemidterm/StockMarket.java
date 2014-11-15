package com.fagyapong.cmpp269.beforemidterm;

public class StockMarket {

	public static void main(String[] args) {

		double tsxPerChange, DJPerChange, SP500PerChange, nasPerChange;
		double tsxValueNew, DJValueNew, SP500ValueNew, nasValueNew;

		String tsx = "S&P/TSX Composite";
		double tsxChange = 103.94, tsxValueOld = 14523;
		tsxValueNew = tsxValueOld + tsxChange;
		tsxPerChange = (tsxChange / tsxValueOld) * 100;

		String DJ = "Dow Jones Industrials";
		double DJChange = -22, DJValueOld = 16534;
		DJValueNew = DJValueOld + DJChange;
		DJPerChange = (DJChange / DJValueOld) * 100;

		String SP500 = "S&P 500";
		double SP500Change = -2.97, SP500ValueOld = 1872.52;
		SP500ValueNew = SP500Change + SP500ValueOld;
		SP500PerChange = (SP500Change / SP500ValueOld) * 100;

		String nas = "NASDAQ Composite";
		double nasChange = -3.50, nasValueOld = 2376.56;
		nasValueNew = nasChange + nasValueOld;
		nasPerChange = (nasChange / nasValueOld) * 100;

		System.out.printf("%35s%10s%10s%10s%10s\n", "Market", "Old Value",
				"New Value", "Change", "% change");
		System.out
				.printf("===========================================================================\n");
		System.out.printf("%35s%10.2f%10.2f%10.2f%10.2f\n", tsx, tsxValueOld,
				tsxValueNew, tsxChange, tsxPerChange);
		System.out.printf("%35s%10.2f%10.2f%10.2f%10.2f\n", DJ, DJValueOld,
				DJValueNew, DJChange, DJPerChange);
		System.out.printf("%35s%10.2f%10.2f%10.2f%10.2f\n", SP500,
				SP500ValueOld, SP500ValueNew, SP500Change, SP500PerChange);
		System.out.printf("%35s%10.2f%10.2f%10.2f%10.2f\n", nas, nasValueOld,
				nasValueNew, nasChange, nasPerChange);
		// write your formulas here to calculate new values
		// and percentage change
		// output your results here!!!
	}
}
