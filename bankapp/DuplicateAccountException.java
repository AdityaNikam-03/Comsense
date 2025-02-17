package com.tbc.jdbcBanking;

public class DuplicateAccountException extends Exception{
	DuplicateAccountException(String msg){
		super(msg);
	}
}
