package com.tbc.ExceptionHandling.Banking;

public class InvalidAmountException extends Exception{

	public InvalidAmountException(String message) {
		super(message);
	}
	
}