package com.senac.bank.model;

import com.senac.bank.exception.NotEnoughBalanceException;

public class Special extends Account{
	
	public double limit;
	
	
	public Special(double limit) {
		super();
		this.limit = limit;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

	//cashes out while balance is bigger than limit;
	public void cashOut ( double value ) throws NotEnoughBalanceException
	{
		if ( value > getLimit() )
			throw new NotEnoughBalanceException();

		setBalance( getBalance() - value );
	}

}