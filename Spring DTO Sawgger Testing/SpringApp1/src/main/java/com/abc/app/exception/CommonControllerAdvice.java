package com.abc.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonControllerAdvice 
{
	
	
	
	public CommonControllerAdvice() {
		System.err.println("Common controller advice constructor");
	}
	@ExceptionHandler
	public ResponseEntity<ExceptionResponse> doSomeThings(NullPointerException e)
	{
		ExceptionResponse resp = new ExceptionResponse(e.getMessage(), "App Internal");
		return new ResponseEntity<ExceptionResponse>(resp, HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler
	public ResponseEntity<ExceptionResponse> doSomeThings2(InvalidCardException e)
	{
		ExceptionResponse resp = new ExceptionResponse(e.getMsg(), e.getSrc());
		return new ResponseEntity<ExceptionResponse>(resp, HttpStatus.BAD_REQUEST);
	}
	
	
	

}
