package com.abc.app.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InvalidCardException extends Exception{

	String msg;
	String src;
	public InvalidCardException(String msg,String src) {
		this.msg = msg;
		this.src = src;
	}
}
