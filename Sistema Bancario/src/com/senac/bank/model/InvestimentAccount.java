package com.senac.bank.model;

public class InvestimentAccount extends Account{
	
	private int creationDate;
	
	//action for investing the money according to a specific tax
	public void investiment (double tax){
		tax  =0.68;
		double investiment = tax * getBalance() ; 
	}
}
