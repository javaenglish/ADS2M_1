package com.senac.bank.model;

public class InvestimentAccount extends Account{
	
	private int creationDate;
	
	public void debit (double tax){
		tax = getBalance() * 0.43; 
	}
}
