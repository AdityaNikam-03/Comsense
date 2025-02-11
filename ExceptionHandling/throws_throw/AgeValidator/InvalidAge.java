package com.tbc.ExceptionHandling.throws_throw.AgeValidator;

public class InvalidAge extends Exception{
	
	InvalidAge(String str){
		super(str);
	}
}
