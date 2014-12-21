package com.fagyapong.cmpp269.finals;

import java.text.*;

class cellPhone {

	private String modelName;
	private double outrightPrice;
	private double oneYearLeasePrice;
	private double twoYearLeasePrice;
	
	/**
	 * Constructor for creating instances of cellPhone 
	 * 
	 * @param _modelName model name of the cellPhone
	 * @param _outrightPrice the outright price
	 * @param _oneYearLeasePrice The price for a one year lease
	 * @param _twoYearLeasePrice The price for a two year lease
	 */
	public cellPhone(String _modelName, double _outrightPrice, double _oneYearLeasePrice, double _twoYearLeasePrice) {
		this.modelName = _modelName;
		this.outrightPrice = _outrightPrice;
		this.oneYearLeasePrice = _oneYearLeasePrice;
		this.twoYearLeasePrice = _twoYearLeasePrice;
	}
	
	/**
	 * Return the name of the model for an instance of cellPhone
	 * @return the modelName for an instance of cellPhone
	 */
	public String getName() {
		return this.modelName;
	}
	
	/**
	 * Returns information about an instance of cellPhone in a string
	 * @return A string that contains information about an instance of cellPhone
	 */
	public String toString() {
		
		// used to format the currency
		DecimalFormat currency = new DecimalFormat("$#0.0");

		String phoneInfo = "[ Pricing for " + this.modelName + "\n" +
						   "  Two year " + currency.format(this.twoYearLeasePrice) + "\n" +
						   "  One year " + currency.format(this.oneYearLeasePrice) + "\n" +
						   "  Outright " + currency.format(this.outrightPrice) + "]\n";

		return phoneInfo;
	}
}