package com.fagyapong.cmpp269.aftermidterm;

import java.util.*;

public class ATM {
    
    public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int selection = 0;
		double amount = 0;
		
		String customerName;
		int chqAcctNum;
		double chqAcctBal;
		int savAcctNum;
		double savAcctBal;
		
		System.out.printf("Enter Customer Name: ");
		customerName = keyboard.nextLine();
		
		System.out.printf("Enter Chq Acct Num: ");
		chqAcctNum = Integer.parseInt(keyboard.nextLine());
		System.out.printf("Enter Chq Acct Balance: ");
		chqAcctBal = Double.parseDouble(keyboard.nextLine());
		
		System.out.printf("Enter Saving Acct Num: ");
		savAcctNum = Integer.parseInt(keyboard.nextLine());
		System.out.printf("Enter Saving Acct Balance: ");
		savAcctBal = Double.parseDouble(keyboard.nextLine());
		
		BankCustomer b = new BankCustomer(customerName, chqAcctNum, chqAcctBal, savAcctNum, savAcctBal);
		System.out.printf("Current status: %s", b);
		
		printMenu();
		System.out.printf("Enter Selection: ");
		selection = keyboard.nextInt();
		
		while (selection != 7) {
			switch (selection) {
				case 1:
					System.out.printf("Amount to withdraw: ");
					amount = keyboard.nextDouble();
					withdraw(b, 1, amount);
					break;
				case 2:
					System.out.printf("Amount to chequing: ");
					amount = keyboard.nextDouble();
					deposit(b, 1, amount);
					break;
				case 3:
					System.out.printf("Amount to withdraw: ");
					amount = keyboard.nextDouble();
					withdraw(b, 2, amount);
					break;
				case 4:
					System.out.printf("Amount to Savings: ");
					amount = keyboard.nextDouble();
					deposit(b, 2, amount);
					break;
				case 5:
					System.out.printf("Amount to transfer from savings to chequing: ");
					amount = keyboard.nextDouble();
					transfer(b, 2, amount);
					break;
				case 6:
					System.out.printf("Amount to transfer from chequing to saving: ");
					amount = keyboard.nextDouble();
					transfer(b, 1, amount);
					break;
			}
			printMenu();
			System.out.printf("Enter Selection: ");
			selection = keyboard.nextInt();
		}
		System.out.printf("Final Balances\n");
		System.out.printf("%s\n", b.toString());
		keyboard.close();
    }
    
    public static void printMenu() {
		System.out.printf("1. Withdraw from Chequing\n" +
						  "2. Deposit to Chequing\n" +
						  "3. Withdraw from Saving\n" +
						  "4. Deposit to Saving\n" +
						  "5. Transfer from Saving to Chequing\n" +
						  "6. Transfer from Chequing to Saving\n" +
						  "7. Exit\n");
    }
    
    /**
     * @param customer The customer to withdraw from
     * @param accountType 1 for chequing account, 2 for saving account
     * @param amount amount to withdraw
     */
    public static void withdraw(BankCustomer customer, int accountType, double amount) {
    	switch (accountType) {
    		case 1:
    			if (customer.withdrawChequing(amount)) {
    				System.out.printf("%s\n", customer);
    			}
    			else {
    				System.out.printf("Insufficient Funds in Chequing!\n");
    				System.out.printf("%s\n", customer);
    			}
    			break;
    		case 2:
    			if (customer.withdrawSaving(amount)) {
    				System.out.printf("%s\n", customer);
    			}
    			else {
    				System.out.printf("Insufficient Funds in Savings!\n");
    				System.out.printf("%s\n", customer);
    			}
    			break;
    	}
    }
    
    /**
     * @param customer The customer to deposit to
     * @param accountType 1 for chequing account, 2 for saving account
     * @param amount Amount to deposit
     */
    public static void deposit(BankCustomer customer, int accountType, double amount) {
    	switch (accountType) {
    		case 1:
    			customer.depositChequing(amount);
    			System.out.printf("%s\n", customer);
    			break;
    		case 2:
    			customer.depositSaving(amount);
    			System.out.printf("%s\n", customer);
    			break;
    	}
    }
    
    /**
     * @param customer The customer who is performing transaction
     * @param sourceAcctType Where the transfer is coming from, 1 for chequing, 2 for saving
     * @param amount Amount to transfer
     */
    public static void transfer(BankCustomer customer, int sourceAcctType, double amount) {
    	
    	switch (sourceAcctType) {
    		case 1:
    			if (customer.transferToSaving(amount)) {
    				System.out.printf("%s\n", customer);
    			}
    			else {
    				System.out.printf("Insufficient funds in chequing to transfer\n");
    				System.out.printf("%s\n", customer);
    			}
    			break;
    		case 2:
    			if (customer.transferToChequing(amount)) {
    				System.out.printf("%s\n", customer);
    			}
    			else {
    				System.out.printf("Insufficient funds in savings to transfer.\n");
    				System.out.printf("%s\n", customer);
    			}
    			break;
    	}
    }
}