package com.tbc.interfaces.Example3;

public class Main {

	public static void main(String[] args) {
		Payment p=new CreditCardPayment();
		p.pay(10);
		p.refund(10);
		p=new PayPalPayment();
		p.pay(10);
		p.refund(10);
	}

}
