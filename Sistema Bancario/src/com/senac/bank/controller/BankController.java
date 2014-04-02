package com.senac.bank.controller;

import com.senac.bank.console.Console;
import com.senac.bank.exception.NotEnoughBalanceException;
import com.senac.bank.model.*;

public class BankController {

	Console console = new Console();
	Client client = new Client(null, null);
	Account account = new Account ();
	
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
		
		String kindOfAccount = console.addAccountNumber();

			if ( kindOfAccount.startsWith(kindOfAccount, 1))	
				account = regularAccount();
			
			if ( kindOfAccount.startsWith(kindOfAccount, 2))
				account = specialAccount();
			
			if ( kindOfAccount.startsWith(kindOfAccount, 3))
				account = investmentAccount();
			
		return account;
	
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
			
		break;
		
		case 4:
			
		break;
		}
	}
	
}