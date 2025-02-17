package com.bankapplogin;

public class DuplicateAccountException extends Exception{
	DuplicateAccountException(String msg){
		super(msg);
	}
}
