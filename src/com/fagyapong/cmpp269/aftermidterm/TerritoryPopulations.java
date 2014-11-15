package com.fagyapong.cmpp269.aftermidterm;

public class TerritoryPopulations {

	public static void main(String[] args) {

		String[] territoryName = { "Northwest Territories", "Yukon", "Nunavut" };
		int[] territoryPop = { 42514, 31530, 31152 };
		int total = 0;

		System.out.printf("%-22s%10s\n", "Territory", "Population");
		System.out.printf("================================\n");
		for (int i = 0; i < territoryName.length; i++) {
			System.out.printf("%-22s%10d\n", territoryName[i], territoryPop[i]);
			total += territoryPop[i];
		}
		System.out.printf("================================\n");
		System.out.printf("%-22s%10d", "Total", total);
	}
}