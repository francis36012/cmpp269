package com.fagyapong.cmpp269.assignment4.oo;

/**
 * This class is for creating Car objects in the parking lot. 
 * The constructor takes 6 arguments, plate, credit card number,
 * expiration date of credit card(month, year), credit card security pin (ccv), and
 * the amount being charged for an instance of car.
 *
 * @author Francis Agyapong 
 * @version December, 2014
 */
public class Car {
	
	/** Licence plate */
    private String plate;
    
    /** Credit card number */
    private String ccNumber;

    /** Number representing expiry month of the credit card */
    private int ccMonth;
    
    /** Number representing expiry year of the credit card */
    private int ccYear;
    
    /** Security code on the back of the card */
    private int ccv;
    
    /** The amount to charge the credit card for parking in the lot */
    private double charge;

    /**
     * Creates a new instance of Car. 
     * 
     * @param _plate The plate of the instance of Car being created
     * @param _ccNumber The credit card associated with the the instance of Car being created
     * @param _ccMonth The expiry month of the associated credit card
     * @param _ccYear The expiry year of the associated credit card
     * @param _ccv The security code of the associated credit card
     * @param _charge The amount being charged on the credit card.
     */
    public Car (String _plate, String _ccNumber, int _ccMonth, int _ccYear, int _ccv, double _charge) {
    	this.plate = _plate;
    	this.ccNumber = _ccNumber;
    	this.ccMonth = _ccMonth;
    	this.ccYear = _ccYear;
    	this.ccv = _ccv;
    	this.charge = _charge;
    }

    /**
     * Return the plate associated with the instance of Car
     * @return Plate of the Car instance
     */
    public String getPlate () {
    	return this.plate;
    }

    /**
     * Returns the credit card number associated with instance of Car
     * @return Credit card number of the Car instance
     */
    public String getCcNumber() {
    	return this.ccNumber;
    }

    /**
     * Returns the expiry month of the card associated with the instance of Car
     * @return Number representing the expiry month of the card associated with the Car instance
     */
    public int getCcMonth() {
    	return this.ccMonth;
    }

    /**
     * Returns the expiry year of the card associated with the instance of Car
     * @return Number representing the expiry year of the card associated with the Car instance
     */
    public int getCcYear() {
    	return this.ccYear;
    }

    /**
     * Returns the security code of the credit card associated with instance of Car
     * @return The ccv number of the credit card
     */
    public int getCcv() {
    	return this.ccv;
    }

    /**
     * Returns the amount charged to the credit card for a Car instance
     * @return The amount Charged to the credit card
     */
    public double getCharge() {
    	return this.charge;
    }
}