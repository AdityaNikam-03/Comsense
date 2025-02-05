package com.tbc.interfaces.Example3;

public class PayPalPayment implements Payment{
	public void pay(double amount) {
		System.out.println("PayPal Payment Method...!");
	}
	public void refund(double amount) {
		System.out.println("Paypal Refund Method...!");
	}
}
