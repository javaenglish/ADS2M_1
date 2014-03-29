package com.senac.bank.model;

public class Special extends Account{
	
	private double limit;
	
	
	public Special(double limit) {
		super();
		this.limit = limit;
	}

	//cashes while balance is bigger than limit;
	public void cashOut(){
		if ( getBalance() <= limit )
			limit -= getBalance();
		
		if ( getBalance() <limit )
			System.out.println("Not enough cash for this transaction");
	}

}