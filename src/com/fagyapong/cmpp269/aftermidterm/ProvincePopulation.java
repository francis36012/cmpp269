package com.fagyapong.cmpp269.aftermidterm;

import java.io.*;
import java.util.*;

public class ProvincePopulation {
	
	public static void main(String[] args) throws IOException {
		
		File dataFile = new File("c:/temp/provincedata.txt");
		FileReader fr = new FileReader(dataFile);
		Scanner reader = new Scanner(fr);
		
		String[] provinces = new String[10];
		int[] provPop = new int[10];
		int totalProvPop = 0;
		
		for (int i = 0; i < provinces.length; i++) {
			provinces[i] = reader.nextLine();
			provPop[i] = Integer.parseInt(reader.nextLine());
			totalProvPop += provPop[i];
		}
		reader.close();
		
		System.out.printf("%25s%15s\n", "Province", "Population");
		for (int i = 0; i < provinces.length; i++) {
			System.out.printf("%25s%15d\n", provinces[i], provPop[i]);
		}
		System.out.printf("========================================\n");
		System.out.printf("%25s%15d\n", "Total", totalProvPop);
	}
}