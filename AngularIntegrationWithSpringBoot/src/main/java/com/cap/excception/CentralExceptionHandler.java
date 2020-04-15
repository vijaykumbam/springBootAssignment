package com.cap.excception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CentralExceptionHandler {
	
	@ExceptionHandler(value =RawMaterialException.class)
	public ResponseEntity<Object> rawMaterialHandler(RawMaterialException exception)
	{
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
	
}
