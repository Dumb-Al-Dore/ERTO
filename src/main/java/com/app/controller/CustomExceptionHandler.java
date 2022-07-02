package com.app.controller;

import org.springframework.http.HttpStatus;
//import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CustomExceptionHandler {
	//
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public String exceptionHandler() {
		return "/error";
	}
	
//	@ResponseStatus(value = HttpStatus.UNSUPPORTED_MEDIA_TYPE)
//	@ExceptionHandler(MailException.class)
//	public String exceptionHandler2() {
//		return "/mailjsp";
//	}
	
}
