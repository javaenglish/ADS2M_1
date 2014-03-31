package com.senac.bank.model;

import com.senac.bank.exception.NotEnoughBalanceException;

public class Account {
	
	private double balance;
	private int numAccount;
	private int numVerif;
	
	public double getBalance() {
		return balance;
	}

	protected void setBalance( double balance ) {
		this.balance = balance;
	}

	//action for depositing
	public void deposit( double value ){
		setBalance( getBalance() + value );
	}
	
	//cashes out if balance is bigger than value to be cashed, Exception
	public void cashOut (double value) throws NotEnoughBalanceException{
		
		if (  getBalance() < value )
			throw new NotEnoughBalanceException();
		
			setBalance( getBalance() - value );
	}

}
