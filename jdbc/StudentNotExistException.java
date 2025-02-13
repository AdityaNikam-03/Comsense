package com.tbc.jdbc;

public class StudentNotExistException extends Exception{
	StudentNotExistException(String msg){
		super(msg);
	}
}
