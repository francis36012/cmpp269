package com.fagyapong.cmpp269.beforemidterm;

// Use this code as a starting point
import javax.swing.*;

public class CashierGUI {

	public static void main(String[] args) {
		String in;
		final double GST_RATE = 0.05;
		double gst;
		double amount;
		double amountTendered;
		double change;
		double totalWithGST;

		in = JOptionPane.showInputDialog("Enter amount charged:");
		amount = Double.parseDouble(in);

		gst = GST_RATE * amount;
		totalWithGST = gst + amount;
		JOptionPane.showMessageDialog(null, "Total with GST is $"
				+ totalWithGST);

		in = JOptionPane.showInputDialog("Enter amount tendered: ");
		amountTendered = Double.parseDouble(in);
		change = amountTendered - totalWithGST;

		JOptionPane.showMessageDialog(null, "You change is $" + change);

		// calculate gst
		// calculate total with gst
		// create message dialog and show total with gst
		// create input dialog read in amount tendered into 'in'
		// convert 'in' to a variable called tendered
		// calculate change
		// create message dialog and show change

	}
}