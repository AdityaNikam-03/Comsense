package com.tbc.jdbc.Banking;

public class UserNotFoundException extends Exception{
	UserNotFoundException(String msg){
		super(msg);
	}
}
