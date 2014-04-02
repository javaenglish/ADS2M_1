package com.senac.bank.model;

public class InvestmentAccount extends Account{
	
	private int creationDate;
	private double tax;
	
	//constructor method for the investment account
	public InvestmentAccount() {
		super();
		
	}

	//action for investing the money according to a specific tax
	public void dividend (double tax)	{
			setBalance( ( (getBalance() / 100 ) * tax) + getBalance() );
		}
		
}
