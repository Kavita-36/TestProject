package com.reg.login.app.regloginapplication;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class UserAccExceptionController extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(UserAlreadyExistsException.class)
	public ResponseEntity<String> handleUserAlreadyExistsException(UserAlreadyExistsException ex){
		String errorMessage=ex.getMessage();
		return new ResponseEntity<String>(errorMessage,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler(InvalidUsernameUsedException.class)
	public ResponseEntity<String> handleInvalidUsernameUsedException(InvalidUsernameUsedException ex){
		String errorMessage=ex.getMessage();
		return new ResponseEntity<String>(errorMessage,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler(InvalidPasswordUsedException.class)
	public ResponseEntity<String> handleInvalidPasswordUsedException(InvalidPasswordUsedException ex){
		String errorMessage=ex.getMessage();
		return new ResponseEntity<String>(errorMessage,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
