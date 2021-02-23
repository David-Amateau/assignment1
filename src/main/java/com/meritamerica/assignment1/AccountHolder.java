package com.meritamerica.assignment1;

/*
 * This class will be used to create objects of type AccountHolder
 * and set and retrieve information about the AccountHolder.
 * It will also create for each Account Holder a Checking Account and
 * a Savings Account object.
 */

public class AccountHolder {
	
	/* 
	 * 		Instance Variables
	 */
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	double checkingAccountOpeningBalance;
	double savingsAccountOpeningBalance;
	
	/*
	 * 		Instance Objects
	 */
	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;
	
	
	/*
	 *  This constructor will be called if no parameters are passed when an
	 *  an AccountHolder is created.
	 */
	
	AccountHolder() {
		
	}
	
	/*
	 * This constructor will be called if all parameters are sent in their
	 * correct order when a new Account Holder is created.
	 */
	AccountHolder(String firstName, String middleName, String lastName, String ssn, 
			double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
		this.checkingAccount = new CheckingAccount(checkingAccountOpeningBalance);
		this.savingsAccount = new SavingsAccount(savingsAccountOpeningBalance);
	}
	
	// This method will return the Account Holder's First Name
	String getFirstName() {
		return firstName;
	}
	
	// This method will set the Account Holder's First Name
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// This method will return the Account Holder's Middle Name
	String getMiddleName() {
		return middleName;
	}
	
	// This method will set the Account Holder's Middle Name
	void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	// This method will return the Account Holder's Last Name
	String getLastName() {
		return lastName;
	}
	
	// This method will set the Account Holder's Last Name
	void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// This method will return the Account Holder's SSN
	String getSSN() {
		return ssn;
	}
	
	// This method will set the Account Holder's SSN
	void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	// This method will return the Account Holder's Checking Account
	CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}
	
	// This method will return the Account Holder's Savings Account
	SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}
	
	
	// This method will print out all the information of an Account Holder
	// All the Print Statements need quite a bit of work
	String toString() {
		System.out.println("Name: " + firstName + middleName + lastName);
		System.out.println("SSN: " + ssn);
		System.out.println("Checking Account Balance: $" + this.getBalance());
		System.out.println("Checking Account Interest Rate: " + this.getInterestRate());
		System.out.println("Checking Account Balance in 3 years: $" + this.futureValue(3));
		System.out.println("Savings Account Balance: $" + this.getBalance());
		System.out.println("Savings Account Interest Rate: " + );
		System.out.println("Savings Account Balance in 3 years: %" + );
	}
}