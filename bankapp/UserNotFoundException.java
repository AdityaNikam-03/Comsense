package com.tbc.jdbcBanking;

public class UserNotFoundException extends Exception{
	UserNotFoundException(String msg){
		super(msg);
	}
}
