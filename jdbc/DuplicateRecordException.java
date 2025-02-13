package com.tbc.jdbc;

public class DuplicateRecordException extends Exception{
	DuplicateRecordException(String msg){
		super(msg);
	}
}
