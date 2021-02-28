package com.meritamerica.assignment1;

public class CheckingAccount {


	/* Instance Variables */

	private double checkingAccountBalance = 0;
	private double checkingAccountInterestRate = 0.0001;
	private double checkingAccountFutureValue;



	// This method will set the opening balance of the Checking Account
	public CheckingAccount(double openingBalance) {
		checkingAccountBalance = openingBalance;
	}

	// This method will return the Checking Account Balance
	public double getBalance() {
		return checkingAccountBalance;
	}

	// This method will return the Checking Account Interest Rate
	public double getInterestRate() {
		return checkingAccountInterestRate;
	}

	// This method will withdraw money and update the balance
	public boolean withdraw(double amount) {
		if (checkingAccountBalance <= 0 && amount > checkingAccountBalance) {
			System.out.println("Insufficient Funds");
			return false; 
		} else {
			checkingAccountBalance = checkingAccountBalance - amount;
			System.out.println("Your new Account Balance is: $" + checkingAccountBalance);
			return true;
	  }
	}

	// This method will deposit money and update the balance
	public boolean deposit(double amount) {
		if (amount > 0) {
			checkingAccountBalance = checkingAccountBalance + amount;
			System.out.println("Your new Account Balance is: $" + checkingAccountBalance);
			return true;
		} else {
			System.out.println("System Error");
			return false;
		}
	}

	// This method will calculate the future value of the account in x years
	public double futureValue(int years) {
		checkingAccountFutureValue = checkingAccountBalance * 
				(1 + Math.pow(checkingAccountInterestRate, years));
		System.out.println("In " + years + " years, the future value of the accout will be " 
				+ checkingAccountFutureValue);
		
		return checkingAccountFutureValue;
	}

	@Override
	public String toString() {
		String checkingInfo = "\nChecking Account Balance: $" +  getBalance() + 
				"\nChecking Account Interest Rate: " + getInterestRate() +
				"\nChecking Account Baance in 3 years: $" + futureValue(3);
		return checkingInfo;
	}
}