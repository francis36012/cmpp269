package com.fagyapong.cmpp269.assignment4.oo;

import javax.swing.*;
import java.io.*;

/**
 * This class is used to start the application and make the Form visible
 * @author Francis Agyapong
 * @version December, 2014
 */ 
public class ParkAndGoPanelCreate {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		JFrame frame = new ParkAndGoFrame();
		
		// Exit the program when the close button is clicked in the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// make the form visible
		frame.setVisible(true);
	}
}