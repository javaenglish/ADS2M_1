package com.senac.bank.model;

public class Special extends Account{
	
	private double limit;
	
	public void cashOut(){
		if ( getBalance() >= limit )
			limit -= getBalance();
	}

}
