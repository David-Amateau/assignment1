package com.meritamerica.assignment1;
/*SavingsAccount(double openingBalance)
double getBalance()

double getInterestRate()

boolean withdraw(double amount)

boolean deposit(double amount)

double futureValue(int years)

String toString()

Sample output:
Savings Account Balance: $1000
Savings Account Interest Rate: 0.01
Savings Account Balance in 3 years: $1030.03

a savings account has a balance, and an annual interest rate of 1.00%.
It is possible to withdraw and deposit funds into the account which affects its balance. 
It is also possible to determine the future value of the account balance based on the interest calculation given N months.

*/

public class SavingsAccount{
	
	private double savingsAccBalance = 0;
	private double interestRate = 0.01;
	private double savingsAccFutureValue;
	
	
	public SavingsAccount(double openingBalance){
		savingsAccBalance = openingBalance;
		
	}
	
	public double getBalance() {
		return savingsAccBalance;
		
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	
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
	
	public double futureValue(int years) {
		savingsAccFutureValue = savingsAccBalance * (1 + Math.pow(interestRate, years));

		System.out.println("In " + years + " years, the future value of the accout will be " + savingsAccFutureValue);
		
		return savingsAccFutureValue;
		
		
	}
	
	public String toString() {
		return "Savings Account Balance : $" + savingsAccBalance + "Savings Account Interest Rate: " + interestRate +  ;
		
		
	}
	
	
}


