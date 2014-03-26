package com.senac.bank.model;

import com.senac.bank.exception.NotEnoughBalanceException;

public class Account {
	
	private double balance;
	private int numAccount;
	private int numVerif;
	
	public double getBalance() {
		return balance;
	}

	private void setBalance( double balance ) {
		this.balance = balance;
	}

	public void deposit( double value ){
		balance +=value;
	}
	
	public void cashOut (double value) throws NotEnoughBalanceException{
		
		if (  getBalance() < value )
			throw new NotEnoughBalanceException();
		
			setBalance( getBalance() - value );
	}

}
