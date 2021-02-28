package com.meritamerica.assignment1;


public class SavingsAccount{
	
	/* Instance Variables */
	
	private double savingsAccBalance = 0;
	private double savingsInterestRate = 0.01;
	private double savingsAccFutureValue;
	
	
	
	// This method will set the opening balance of the Savings Account.
	public SavingsAccount(double openingBalance){
		savingsAccBalance = openingBalance;	
	}
	
	// This method will return the Savings Account balance
	public double getBalance() {
		return savingsAccBalance;	
	}
	
	// This method will return the Checking Account balance
	public double getInterestRate() {
		return savingsInterestRate;
	}
	
	// This method will withdraw money and update the balance
	public boolean withdraw(double amount) {
		if (savingsAccBalance <= 0 && amount > savingsAccBalance ) {
			System.out.println("Insufficient Funds");
			return false;
		} else {
			savingsAccBalance = savingsAccBalance - amount;
			System.out.println("Your New Account Balance is" + savingsAccBalance);
			return true;
		}
	}
	
	// This method will deposit money and update the balance
	public boolean deposit(double amount) {
		if(amount > 0) {
			savingsAccBalance = savingsAccBalance + amount;
			System.out.println("Your new account balance is" + savingsAccBalance);
			return true;
		} else {
			System.out.println("System Error");
			return false;
		}
	}
	
	// This method will calculate the future value of the account in x years
	public double futureValue(int years) {
		savingsAccFutureValue = savingsAccBalance * 
				(1 + Math.pow(savingsInterestRate, years));
		System.out.println("In " + years + " years, the future value of the accout will be " +
				savingsAccFutureValue);
		
		return savingsAccFutureValue;	
	}
	
	@Override
	public String toString() {
		String savingsInfo = "Savings Account Balance: $" + getBalance() + 
				"\nSavings Account Interest Rate: " + getInterestRate() +
				"\nSavings Account Balance in 3 years: $" + futureValue(3);
		return savingsInfo;
	}	
}