package com.reg.login.app.regloginapplication;

public class InvalidPasswordUsedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InvalidPasswordUsedException(String errmessage) {
		super(errmessage);
	}

}
