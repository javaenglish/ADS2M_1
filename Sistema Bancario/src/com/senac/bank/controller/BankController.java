package com.senac.bank.controller;

import com.senac.bank.console.Console;
import com.senac.bank.exception.NotEnoughBalanceException;
import com.senac.bank.model.*;

public class BankController {

	private Console console;
	private Client client;
	
	
	public Console getConsole() {
		return console;
	}

	public Client getClient() {
		return client;
	}
	
	//constructor for controller
	public BankController() {
		console  = new Console();
	}

	public void addClient()
	{
		client = new Client( console.addName(), createAccount() );
	}
	
	//method to createAccount and set the type of it
	public Account createAccount()
	{
		Account acc = null;
		String kindOfAccount = console.addAccountNumber();

			if ( kindOfAccount.startsWith(kindOfAccount, 1))	
				acc = regularAccount();
			
			if ( kindOfAccount.startsWith(kindOfAccount, 2))
				acc = specialAccount();
			
			if ( kindOfAccount.startsWith(kindOfAccount, 3))
				acc = investmentAccount();
			
		return acc;
	
	}
	
	//creates a regular account
	private Account regularAccount() {
	
		return new Account ();
	}
	
	//creates special account
	private Account specialAccount() {
			
		return specialAccount();
	}
	
	private Account investmentAccount() {
		
		return investmentAccount();
	}

	//all the actions to be done by the system
	public void Options ()	{
		console.systemOptions();
		
		int opt = 0;
		
		switch ( opt ) {
		case 1:
				
			addClient();
						
		break;
		
		case 2:
			console.deposit();
		break;
			
		case 3:
			try{
				Account account = new Account();
				int value;
				account.cashOut(value);
			} catch ()
		break;
		}
	}
	
}