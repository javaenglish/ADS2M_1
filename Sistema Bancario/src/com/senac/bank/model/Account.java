package com.senac.bank.model;

import com.senac.bank.exception.NotEnoughBalanceException;

public class Account {
	
	private double balance;
	private int numAccount;
	private int numVerif;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance( double balance ) {
		this.balance = balance;
	}
	
	public int getNumAccount() {
		return numAccount;
	}

	public void setNumAccount(int numAccount) {
		this.numAccount = numAccount;
	}

	public int getNumVerif() {
		return numVerif;
	}

	public void setNumVerif(int numVerif) {
		this.numVerif = numVerif;
	}

	//action for depositing
	public void deposit( double value ){
		setBalance( getBalance() + value );
	}
	
	//cashes out if balance is bigger than value to be cashed, Exception is thrown
	public void cashOut (double value) throws NotEnoughBalanceException{
		
		if (  getBalance() < value )
			throw new NotEnoughBalanceException();
		
			setBalance( getBalance() - value );
	}

}
