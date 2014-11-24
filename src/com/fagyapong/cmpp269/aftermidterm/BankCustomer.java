package com.fagyapong.cmpp269.aftermidterm;

import java.text.*;

public class BankCustomer {

    private String name;
    private int chequeAcctNum;
    private double chequeBal;
    private int savingAcctNum;
    private double savingBal;

    public BankCustomer(String n, int chqAcctNum, double chqBal, int savAcctNum, double savBal) {
        name = n;
        chequeAcctNum = chqAcctNum;
        chequeBal = chqBal;
        savingAcctNum = savAcctNum;
        savingBal = savBal;
    }

    public boolean withdrawChequing(double amount) {
        if (chequeBal - amount < 0) {
            return false;
        }
        chequeBal -= amount;
        return true;
    }

    public boolean withdrawSaving(double amount) {
        if (savingBal - amount < 0) {
            return false;
        }
        savingBal -= amount;
        return true;
    }

    public void depositChequing(double amount) {
        chequeBal += amount;
    }

    public void depositSaving(double amount) {
        savingBal += amount;
    }

    public double getBalanceChequing() {
        return chequeBal;
    }

    public double getBalanceSaving() {
        return savingBal;
    }

    public boolean transferToSaving(double amount) {
        if (chequeBal - amount < 0) {
            return false;
        }
        savingBal += amount;
        chequeBal -= amount;
        return true;
    }

    public boolean transferToChequing(double amount) {
        if (savingBal - amount < 0) {
            return false;
        }
        chequeBal += amount;
        savingBal -= amount;
        return true;
    }

    public String toString() {
        DecimalFormat decFormat = new DecimalFormat("#.00");
        String customerObject = "";
        customerObject += "Name: " + name + "\n";
        customerObject += "Cheque Acct #: " + chequeAcctNum + "\n";
        customerObject += "\tBalance = $" + decFormat.format(chequeBal) + "\n";
        customerObject += "Saving Acct #: " + savingAcctNum + "\n";
        customerObject += "\tBalance = $" + decFormat.format(savingBal) + "\n";

        return customerObject;
    }
}