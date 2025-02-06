package com.tbc.QuizApplication;

public class Question {
	String question;
	String[] options;
	int answer;
	
	Question(String question,String[] options,int ans){
		this.question=question;
		this.options=options;
		this.answer=ans;
	}
}
