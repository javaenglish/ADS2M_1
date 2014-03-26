package com.senac.bank.exception;

public class NotEnoughBalanceException extends Exception{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 2648699802348137033L;

	public NotEnoughBalanceException(){
		super("It seems there not to be enough balance in your account");
	}

}
