package com.fagyapong.cmpp269.assignment4.documentations.ass4_oo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.WindowEvent; // for exit function
import java.awt.event.WindowAdapter; // for exit function
import java.io.*;

@SuppressWarnings({ "unused", "serial" })
public class ParkAndGoFrame extends JFrame {
	// form objects
	private JButton registerButton;
	private JButton searchButton;
	private JButton clearButton;
	private JLabel plateLabel;
	private JTextField plateField;
	private JLabel ccLabel;
	private JTextField ccNumberField;
	private JLabel ccDateLabel;
	private JTextField ccDateYearField, ccDateMonthField;
	private JLabel ccvLabel;
	private JTextField ccvField;
	private JPanel panel;
	private JTextField messageLabel;

	// Domain Objects
	private ParkingLot p;
	private static final double DAILY_CHARGE = 4.00;
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 300;

	private static final double INTEREST_RATE = 10;
	private static final double INITIAL_BALANCE = 1000;

	// constructor, Setup all the fields in the frame
	public ParkAndGoFrame() throws IOException, ClassNotFoundException {
		// PARKING LOT OBJECT CREATED HER
		p = new ParkingLot();

		// Use instance variables for components
		plateLabel = new JLabel("Plate");
		plateField = new JTextField(10);
		ccLabel = new JLabel("Credit Card");
		ccNumberField = new JTextField(19);
		ccDateLabel = new JLabel("Expiry MM/YY");
		ccDateYearField = new JTextField(2);
		ccDateMonthField = new JTextField(2);
		ccvLabel = new JLabel("CCV");
		ccvField = new JTextField(3);
		messageLabel = new JTextField(20);
		messageLabel.setEditable(false);
		// Use helper methods
		createButtons();
		createPanel();
		// show the number of cars in the parking lot
		int numCars = 0;
		// CALL THE METHOD TO GET THE NUMBER OF CARS REGISTERED AND PUT IT IN
		// numCars
		messageLabel.setText(numCars
				+ " cars are currently in the parking lot.");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		// exit button
		// I think windowAdapter() is a method
		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				// UNCOMMENT THIS CODE ONCE YOU ADD THE CODE TO GENERATE THE
				// REPORTS ABOVE
				/*
				 * try { // generate reports here!!!
				 * 
				 * } catch (IOException x) { // output failed System.out.println
				 * ("Report output of the parking Lot file failed."); }
				 */
				System.exit(0);
			}
		});
	}

	// create the two buttons and adds an action listener to watch for them
	private void createButtons() {
		registerButton = new JButton("Register");
		ActionListener registerlistener = new registerListener();
		registerButton.addActionListener(registerlistener);

		searchButton = new JButton("Search");
		ActionListener searchlistener = new searchListener();
		searchButton.addActionListener(searchlistener);

		// Clear Button
		clearButton = new JButton("Clear");
		ActionListener clearlistener = new clearListener();
		clearButton.addActionListener(clearlistener);

	}

	private void createPanel() {
		panel = new JPanel();

		panel.add(plateLabel);
		panel.add(plateField);
		panel.add(ccLabel);
		panel.add(ccNumberField);
		panel.add(ccDateLabel);
		panel.add(ccDateMonthField);
		panel.add(ccDateYearField);
		panel.add(ccvLabel);
		panel.add(ccvField);
		panel.add(messageLabel);
		// Add buttons last
		panel.add(registerButton);
		panel.add(searchButton);
		panel.add(clearButton);
		add(panel);
	}

	// clear all the fields on the form
	private void clearFields() {
		plateField.setText("");
		ccNumberField.setText("");
		ccDateYearField.setText("");
		ccDateMonthField.setText("");
		ccvField.setText("");
	}

	// register button listener
	class registerListener implements ActionListener {
		// method run when register button is pressed
		public void actionPerformed(ActionEvent event) {

			// extract data from text fields
			String plate, ccNumber;
			int ccDateYear, ccDateMonth, ccv;

			plate = plateField.getText();
			if (plate.length() == 0) {
				// no plate, error
				messageLabel.setText("Plate can not be blank!");
				// set focus on plate field
				plateField.requestFocusInWindow();
			} else {
				ccNumber = ccNumberField.getText();
				if (ccNumber.length() != 12) {
					// cc wrong length, error
					messageLabel
							.setText("Card should be 12 digits, NO DASHES!");
				} else {
					// error check Month, Year and ccv
					int currentItem = 1; // Month
					try {
						// Extract String and convert to integer
						ccDateMonth = Integer.parseInt(ccDateMonthField
								.getText());
						currentItem = 2; // Year
						// Extract String and convert to integer
						ccDateYear = Integer
								.parseInt(ccDateYearField.getText());
						currentItem = 3; // ccv
						ccv = Integer.parseInt(ccvField.getText());
						// Should only be done if no errors
						// CREATE A CAR OBJECT HERE
						// ADD THE CAR OBJECT TO THE PARKING LOT HERE!!!

						messageLabel.setText(plate + " registered!");
						clearFields();
						// put focus back on plate field
						plateField.requestFocusInWindow();

					} catch (NumberFormatException e) {
						if (currentItem == 1) {
							// conversion of Month failed
							messageLabel.setText("Month must be 2 digits");
							// Clear out bad value
							ccDateMonthField.setText("");
							ccDateMonth = 0;
							// Put focus back on this field
							ccDateMonthField.requestFocusInWindow();
						} else if (currentItem == 2) {
							messageLabel.setText("Year must be 2 digits");
							// Clear out bad value
							ccDateYearField.setText("");
							ccDateYear = 0;
							// Put focus back on this field
							ccDateYearField.requestFocusInWindow();
						} else if (currentItem == 3) {
							messageLabel.setText("CCV must be 3 digits");
							// Clear out bad value
							ccvField.setText("");
							ccv = 0;
							// Put focus back on this field
							ccvField.requestFocusInWindow();
						}
					}
				}
			}
		}
	}

	// search button listener
	class searchListener implements ActionListener {
		// method run when search button is pressed
		public void actionPerformed(ActionEvent event) {
			String plate;
			plate = plateField.getText();
			boolean found = false;
			// CALL findCar() HERE TO SEARCH TO SEE IF THE PLATE IS REGISTERED
			if (found) {
				// plate not plate
				messageLabel.setText("Plate " + plate + " is NOT registered.");
			} else {
				// plate registered
				messageLabel.setText("Plate " + plate + " IS registered.");
			}
			// put focus back on plate field
			plateField.requestFocusInWindow();
		}
	}

	// clear button listener
	class clearListener implements ActionListener {
		// method run when search button is pressed
		public void actionPerformed(ActionEvent event) {
			// clear fields
			clearFields();
			// clear out message box
			messageLabel.setText("");
			// put focus back on plate field
			plateField.requestFocusInWindow();

		}
	}
}