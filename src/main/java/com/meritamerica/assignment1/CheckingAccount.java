package com.meritamerica.assignment1;

public class CheckingAccount {


	/* Instance Variables */

	double checkingAccountBalance = 0;
	double checkingAccountInterestRate = 0.0001;
	double checkingAccountFutureValue;



	// This method will set from the Account Holder constructor the opening balance

	CheckingAccount(double openingBalance) {
	checkingAccountBalance = openingBalance;
	}


	// This method will return the Checking Account Balance
	double getBalance() {
	return checkingAccountBalance;
	}

	// This method will return the Checking Account Interest Rate
	double getInterestRate() {
	return checkingAccountInterestRate;
	}


	// If they do not have enough money in their account to withdraw that amount
	// return an error, if they do have enough money subtract the amount they
	// are withdrawing from their checking account balance

	boolean withdraw(double amount) {

	if (checkingAccountBalance <= 0 && amount > checkingAccountBalance) {
		
	  System.out.println("Insufficient Funds");
	  
	  return false;
	  
	  } else {
	  checkingAccountBalance = checkingAccountBalance - amount;
	  System.out.println("Your new Account Balance is " + checkingAccountBalance);
	  
	  return true;
	  }

	}



	// You can't deposit negative amount so as long as the deposit amount is 
	// greater than zero everything should be good?

	boolean deposit(double amount) {

		if (amount > 0) {

		checkingAccountBalance = checkingAccountBalance + amount;
		System.out.println("Your new Account Balance is " + checkingAccountBalance);
		return true;
	  
	  
	  
		} else {
	  
	  System.out.println("System Error");
	  	
	  	return false;
	  }
	}


	// This method will determine the future value of the account by taking the amount of years
	// in as a parameter and calculating the future value of the account.

	double futureValue(int years) {

	checkingAccountFutureValue = checkingAccountBalance * (1 + Math.pow(checkingAccountInterestRate, years));

	System.out.println("In " + years + " years, the future value of the accout will be " + checkingAccountFutureValue);
	
	return checkingAccountFutureValue;

	}


	@Override
	public String toString() {
	System.out.println("Checking Account Balance: $" +  checkingAccountBalance);
	System.out.println("Checking Account Interest Rate: " + checkingAccountInterestRate);
	System.out.println("Checking Account Baance in 3 years: $" + checkingAccountFutureValue);
	}




}