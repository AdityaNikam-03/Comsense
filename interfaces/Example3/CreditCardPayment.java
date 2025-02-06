package com.tbc.interfaces.Example3;

public class CreditCardPayment implements Payment{
	private double amount;
	public void pay(double amount) {
		System.out.println("Credit Card Payment Method...!");
	}
	public void refund(double amount) {
		System.out.println("Credit Card Refund Method...!");
	}
}
