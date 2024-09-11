package com.student.rest.exception;

public class StudentNotFound extends RuntimeException{
	public StudentNotFound(String msg){
		super(msg);
	}
}
