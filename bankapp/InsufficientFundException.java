package com.tbc.jdbcBanking;

public class InsufficientFundException extends Exception{
	InsufficientFundException(String msg){
		super(msg);
	}
}
