package com.fagyapong.cmpp269.aftermidterm;
public class Mod8Slide20 {
	public static void main(String[] args) {
		double[] a = { 10, 10, 5 };
		double[] b = { 20, 30, 10 };
		double[] c = new double[3];
		System.out.println("Array a");
		print(a);
		System.out.println("Array b");
		print(b);
		add(a, b, c);
		System.out.println("Array c");
		print(c);
	}

	public static void print(double[] x) {
		int i = 0;
		for (i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
	public static void add(double[] x, double[] y, double[] z) {
		
		for (int i = 0; i < x.length; i++) {
			z[i] = x[i] + y[i];
		}
	}
}