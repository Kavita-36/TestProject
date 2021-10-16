package com.reg.login.app.regloginapplication;

public class UserAlreadyExistsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public UserAlreadyExistsException(String errmessage) {
		super(errmessage);
	}
	
	

}
