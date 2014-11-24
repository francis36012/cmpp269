package com.fagyapong.cmpp269.aftermidterm;

public class BankCustomerDriver {

	public static void main(String[] args) {

		// Create a bankcustomer called a
		BankCustomer a = new BankCustomer("Sara Jones", 1, 1000.0, 2, 500.0);

		double savings = 0;
		double chequing = 0;

		// Test withdrawChequing $10000.00 from checking
		if (a.withdrawChequing(10000.0)) {
			System.out.println("$10,000 withdraw from Chequing OK!");
		} else {
			System.out.println("$10,000 withdraw from chequing failed");
		}

		// test withdrawCheque $10.00
		a.withdrawChequing(10.00);

		// test DepositChequing at $100
		a.depositChequing(100.00);

		// Test transferToSaving
		a.transferToSaving(500.00);

		// check savings
		a.depositSaving(100.00);
		a.withdrawSaving(400.00);
		a.transferToChequing(10.0);

		// test getBalanceChequing balance should be 1000 - 10 + 100 - 500 + 10 = $600
		// test getBalanceSaving, balance should be 500 + 500 (transfer) + 100 - 400 - 10 =$690
		chequing = a.getBalanceChequing();
		System.out.printf("Balance in chequing is $%.2f\n", chequing);
		savings = a.getBalanceSaving();
		System.out.printf("Balance in saving is $%.2f\n", savings);

		// print final balances
		System.out.println("Test of toString()");
		System.out.println(a);
	}
}