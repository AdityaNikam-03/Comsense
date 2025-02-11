package com.tbc.ExceptionHandling.Banking;

public class Bank {
	long accno;
	double balance;
	String Name;
	
	public Bank(long accno, double balance, String name) {
		this.accno = accno;
		this.balance = balance;
		Name = name;
	}
	
	void showDetails()
	{
		System.out.println("\n"+"******* User Details *******");
		System.out.println("       Name :"+Name);
		System.out.println("   Account Number :"+accno);
		System.out.println("****************************");
	}
	
	void withdraw(double Amount)
	{
		try {
			if(Amount>this.balance)
			{
				throw new InsufficientFundsException("Your Balance is low.......");
			}
			else {
				this.balance-=Amount;
				System.out.println(Amount+" debited Successfully and balance is : "+this.balance);
			}
		}catch(InsufficientFundsException IFE)
		{
			System.out.println(IFE.getMessage());
		}
	}
	
	void deposit(double Amount)
	{
		try {
			if(Amount< 0)
			{
				throw new InvalidAmountException("Enter Valid Amount");
			}
			else {
				this.balance+=Amount;
				System.out.println(Amount+" credited to your account and balance is : "+this.balance);
			}
		}catch(InvalidAmountException IAE)
		{
			System.out.println(IAE.getMessage());
		}
	}
	
	void showBalance()
	{
		System.out.println("Your Account Balance is : "+this.balance);
	}
}