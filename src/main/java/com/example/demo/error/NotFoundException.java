package com.example.demo.error;

import org.springframework.http.HttpStatus;

public class NotFoundException extends RuntimeException {
	
	public NotFoundException(String message) {
		 super(message);
	}
	
	
	  public HttpStatus getStatusCode() {
		 return HttpStatus.NOT_FOUND;
		 
	}

}
