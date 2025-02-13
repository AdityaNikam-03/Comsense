package com.tbc.jdbc.Banking;

public class InsufficientFundException extends Exception{
	InsufficientFundException(String msg){
		super(msg);
	}
}
