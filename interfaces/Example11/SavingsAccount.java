package com.tbc.interfaces.Example11;

public class SavingsAccount extends BankAccount implements InterestBearing{

	SavingsAccount(){
		super();
	}
	
	public void calculateInterest() {
		System.out.println("Interest on Balance is : "+(this.getBalance()*0.08+"\n"));
	}
}
