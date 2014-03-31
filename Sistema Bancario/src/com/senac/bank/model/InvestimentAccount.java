package com.senac.bank.model;

public class InvestimentAccount extends Account{
	
	private int creationDate;
	private double tax;
	
	//constructor method
	public InvestimentAccount(int creationDate, double tax) {
		super();
		this.creationDate = creationDate;
		this.tax = tax;
	}

	//action for investing the money according to a specific tax
	public double investiment (double tax){
			
		double invest = (tax * getBalance()) ;
		
		return invest;
	}
}
