package com.fagyapong.cmpp269.assignment4.documentations.ass4_oo;

import javax.swing.JFrame;
import java.io.*;

/**
 * Assignment #4 Pay and Go Parking
 */
public class ParkAndGoPanelCreate {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		JFrame frame = new ParkAndGoFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}