package com.fagyapong.cmpp269.aftermidterm;

import java.util.ArrayList;

public class Mod10Slide6 {
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();

		// add some names to the end of the list
		nameList.add("Catherine");
		nameList.add("James");
		nameList.add(0, "Bob");
		System.out.println("NameList after inserts.");
		System.out.println(nameList);
		String x = nameList.get(1);
		System.out.println("Name at position 1: " + x);
		int i = nameList.size();
		System.out.println("List contains: " + i + " elements.");
		nameList.remove(0); // remove name at 0
		System.out.println("Final list: " + nameList);
	}
}