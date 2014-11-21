package com.fagyapong.cmpp269.assignment4.documentations.ass4_oo;
/**
 * Purpose: 
 * Input:
 *
 * Processing done:
 *
 * Output:
 *
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.io.*;
// Make this class serialable so that it can be stored in a binary file
@SuppressWarnings("unused")
public class Car {
    private String plate;
    private String ccNumber;
    private int ccMonth, ccYear, ccv;
    private double charge;
    // store the entry time into the lot
    // create constructor to create a car object
    public Car (String _plate, String _ccNumber, int _ccMonth, int _ccYear, int _ccv, double _charge) {
        // WRITE CODE HERE
    }

    public String getPlate () {
    	return plate;
    }

    public String getCcNumber() {
    	return ccNumber;
    }

    public int getCcMonth() {
    	return ccMonth;
    }

    public int getCcYear() {
    	return ccYear;
    }

    public int getCcv() {
    	return ccv;
    }

    public double getCharge() {
    	return charge;
    }
}