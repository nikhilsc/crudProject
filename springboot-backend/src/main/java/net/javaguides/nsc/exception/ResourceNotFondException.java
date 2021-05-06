package net.javaguides.nsc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFondException extends RuntimeException{

	//RuntimeException which internally implements serializable interface
	private static final long serialVersionUID = 1L;
	
	ResourceNotFondException(String message){
		super(message);
	}
	

}
