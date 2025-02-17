package com.bankapplogin;

public class InsufficientFundException extends Exception{
	InsufficientFundException(String msg){
		super(msg);
	}
}
