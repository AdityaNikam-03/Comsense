package com.tbc.jdbc.Banking;

public class DuplicateAccountException extends Exception{
	DuplicateAccountException(String msg){
		super(msg);
	}
}
