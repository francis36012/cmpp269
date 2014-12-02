package com.fagyapong.cmpp269.assignment4.oo;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.io.*;

/**
 * This class is used to setup and layout the components in the
 * form. Methods have been implemented to handle events coming
 * from the buttons in the form. Also, there is a method that
 * performs verification on the data coming from the form. 
 * 
 * @author Francis Agyapong
 * @version December, 2014
 */
@SuppressWarnings("serial")
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
	private JTextField ccDateYearField;
	private JTextField ccDateMonthField;
	private JLabel ccvLabel;
	private JTextField ccvField;

	private JPanel platePanel = new JPanel();
	private JPanel ccNumberPanel = new JPanel();
	private JPanel datePanel = new JPanel();
	private JPanel messageLabelPanel = new JPanel();
	private JPanel buttonsPanel = new JPanel();
	private JTextField messageLabel;

	// Domain Objects
	private ParkingLot p;
	private static final double DAILY_CHARGE = 4.00;
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 250;

	// show the number of cars in the parking lot
	int numCars = 0;

	// constructor, Setup all the fields in the frame
	public ParkAndGoFrame() throws IOException, ClassNotFoundException {

		// ParkingLot object creation
		p = new ParkingLot();

		// Use instance variables for components
		plateLabel = new JLabel("Plate", SwingConstants.CENTER);
		plateField = new JTextField(10);
		ccLabel = new JLabel("Credit Card", SwingConstants.CENTER);
		ccNumberField = new JTextField(15);
		ccDateLabel = new JLabel("Expiry MM/YY");
		ccDateYearField = new JTextField(2);
		ccDateMonthField = new JTextField(2);
		ccvLabel = new JLabel("CCV");
		ccvField = new JTextField(3);
		messageLabel = new JTextField(20);
		messageLabel.setEditable(false);
		messageLabel.setHorizontalAlignment(JTextField.CENTER); // center text
		
		//use grid layout for the main component in the frame
		setLayout(new GridLayout(5, 1, 5, 5));

		// Use helper methods
		createButtons();
		createPanel();

		// Call the method to get the number of cars registered and put it in numcars
		messageLabel.setText(numCars + " cars are currently in the parking lot.");

		setSize(FRAME_WIDTH, FRAME_HEIGHT);

		addWindowListener(new WindowAdapter() {
			/**
			 * Handles the window closing event, calls the methods
			 * for writing the plates and charges files.
			 */
			public void windowClosing(WindowEvent e) {
				try {
					p.plateList();
					p.printCharges();
				}
				catch (IOException x) {
					// output failed System.out.println
					System.out.printf("Report output of the parking Lot file failed.\n");
				}
				System.exit(0);
			}
		});
	}

	/**
	 *  Create the three buttons and adds an action listener
	 *  to handle events from them
	 *  @return void
	 */
	private void createButtons() {
		registerButton = new JButton("Register");
		registerButton.addActionListener(new listeners());

		searchButton = new JButton("Search");
		searchButton.addActionListener(new listeners());

		// Clear Button
		clearButton = new JButton("Clear");
		clearButton.addActionListener(new listeners());
	}

	/**
	 * Creates and places all components on their respective panels
	 * @return void
	 */
	private void createPanel() {
		platePanel.setLayout(new GridLayout(1, 2));
		ccNumberPanel.setLayout(new GridLayout(1, 2));
		datePanel.setLayout(new FlowLayout());
		messageLabelPanel.setLayout(new GridLayout(1,1));
		buttonsPanel.setLayout(new FlowLayout());
		
		platePanel.add(plateLabel);
		platePanel.add(plateField);

		ccNumberPanel.add(ccLabel);
		ccNumberPanel.add(ccNumberField);
		
		datePanel.add(ccDateLabel);
		datePanel.add(ccDateMonthField);
		datePanel.add(ccDateYearField);
		datePanel.add(ccvLabel);
		datePanel.add(ccvField);

		messageLabelPanel.add(messageLabel);
		
		buttonsPanel.add(registerButton);
		buttonsPanel.add(searchButton);
		buttonsPanel.add(clearButton);
		
		add(platePanel);
		add(ccNumberPanel);
		add(datePanel);
		add(messageLabelPanel);
		add(buttonsPanel);
	}

	/**
	 *  Clears all the fields on the form
	 *  @return void
	 */
	private void clearFields() {
		plateField.setText("");
		ccNumberField.setText("");
		ccDateYearField.setText("");
		ccDateMonthField.setText("");
		ccvField.setText("");
	}
	
	/**
	 * Validates the credit card number, expiry date and the ccv number of the card.
	 * 
	 * @param number Credit Card number
	 * @param expMonth The month the card expires
	 * @param expYear The year the card expires
	 * @param ccv The ccv number of the card
	 * @return <code>true</code> if the credit card is valid and <code>false</code> if it isn't
	 */
	private boolean validateCCInfo(String number, int expMonth, int expYear, int ccv) {
		boolean validCCNumber = true;
		boolean validExpDate = false;
		boolean validCcv = false;
		boolean result;
	
		int counter = 0;
		while (counter < number.length() || !validCCNumber) {
			validCCNumber = (Character.isDigit(number.charAt(counter)));
			
			counter++;
			// return to the calling method with false immediately if the card number is not valid
			if (!validCCNumber) return false;
		}
		
		// add 2000 to the 2 digit year so that we get a year within 2000 and 2099
		expYear += 2000;

		Calendar today = Calendar.getInstance();

		if (expYear >= today.get(Calendar.YEAR)) {
			if (expYear == today.get(Calendar.YEAR)) {
				validExpDate = (expMonth > today.get(Calendar.MONTH) + 1);
			}
			else {
				validExpDate = true;
			}
		}
		
		// return false immediately if the credit has expired
		if (!validExpDate) return false;
		
		validCcv = (ccv >= 1 && ccv <= 999);
		if (!validCcv) return false;
			
		result = (validCCNumber && validExpDate && validCcv);
		return result;
	}
	
	/**
	 * Listener class for the buttons.
	 * This class contains the event handlers for the buttons in the
	 * form. The <code>getSource()</code> method is used to determine
	 * which button an event came from. 
	 */
	class listeners implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			Object eventSource = event.getSource();

			// if the event came from the register button, execute the code block below.
			if (eventSource == registerButton) {
				// extract data from text fields
				String plate, ccNumber;
				int ccDateYear, ccDateMonth, ccv;

				plate = plateField.getText();

				if (plate.length() == 0) {
					// no plate, error
					messageLabel.setText("Plate can not be blank!");
					
					// set focus on plate field
					plateField.requestFocusInWindow();
				}
				else {
					ccNumber = ccNumberField.getText();

					if (ccNumber.length() != 12) {
						// cc wrong length, error
						messageLabel.setText("Card should be 12 digits, NO DASHES!");
					}
					else {
						// error check Month, Year and ccv
						int currentItem = 1; // Month
						try {
							// Extract String and convert to integer
							ccDateMonth = Integer.parseInt(ccDateMonthField.getText());

							currentItem = 2; // Year

							// Extract String and convert to integer
							ccDateYear = Integer.parseInt(ccDateYearField.getText());

							currentItem = 3; // ccv
							ccv = Integer.parseInt(ccvField.getText());

							if (p.findCar(plate)) {
								messageLabel.setText("Plate is already Registered");
							}
							else if (validateCCInfo(ccNumber, ccDateMonth, ccDateYear, ccv)) {
								
								Car car = new Car(plate, ccNumber, ccDateMonth, ccDateYear, ccv, DAILY_CHARGE);
								p.addCar(car);
								numCars = p.numCars();

								messageLabel.setText(plate + " registered!");
								clearFields();
								
								// put focus back on plate field
								plateField.requestFocusInWindow();
							}
							else {
								clearFields();
								messageLabel.setText("Credit card declined");
							}

						}
						catch (NumberFormatException e) {
							if (currentItem == 1) {
								// conversion of Month failed
								messageLabel.setText("Month must be 2 digits");

								// Clear out bad value
								ccDateMonthField.setText("");
								ccDateMonth = 0;

								// Put focus back on this field
								ccDateMonthField.requestFocusInWindow();
							}
							else if (currentItem == 2) {
								messageLabel.setText("Year must be 2 digits");
								
								// Clear out bad value
								ccDateYearField.setText("");
								ccDateYear = 0;
								
								// Put focus back on this field
								ccDateYearField.requestFocusInWindow();
							}
							else if (currentItem == 3) {
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
			if (eventSource == searchButton) {

				String plate;
				plate = plateField.getText();
				if (!(p.findCar(plate))) {
					// plate not plate
					messageLabel.setText("Plate " + plate + " is NOT registered.");
				}
				else {
					// plate registered
					messageLabel.setText("Plate " + plate + " IS registered.");
				}
				// put focus back on plate field
				plateField.requestFocusInWindow();
			}

			if (eventSource == clearButton) {
				// clear fields
				clearFields();
				// output the number of cars in the lot 
				messageLabel.setText(p.numCars() + " car(s) in the lot");
				// put focus back on plate field
				plateField.requestFocusInWindow();
			}
		}
	}
}