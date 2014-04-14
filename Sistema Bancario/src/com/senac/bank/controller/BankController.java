package com.senac.bank.controller;

import com.senac.bank.console.Console;
import com.senac.bank.exception.NotEnoughBalanceException;
import com.senac.bank.model.*;

public class BankController {

	Console console = new Console();
	Client client = new Client(null, null);
	Account account = new Account ();
	InvestmentAccount investment = new InvestmentAccount();
	
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
	
	//method to create a new client
	public void addClient()
	{
		client = new Client( console.addName(), createAccount() );
	}
	
	//method to createAccount and set the type of it
	public Account createAccount()
	{
		
		String kindOfAccount = console.addAccountNumber();

			//sets a regular account
			if ( kindOfAccount.startsWith(kindOfAccount, 1))	
				account = regularAccount();
			
			//sets a special account
			if ( kindOfAccount.startsWith(kindOfAccount, 2))
				account = specialAccount();
			
			//sets an investment account
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
			
		return new Account();
	}
	
	//creates an account to invest the money
	private Account investmentAccount() {
		
		return new Account();
	}

	//all the actions to be done by the system
	public void options ()	{
		console.systemOptions();
		
		int opt = 0;
		do{
		switch ( opt ) {
			
		
			case 1: {
				
				addClient();
				client.setName(console.addName());
				client.setAccount(console.addAccountNumber());
				account.setBalance(console.addBalance());
		
			}
				break;
		
			case 2:
			
				account.deposit(console.deposit());
			
				break;
			
			case 3: {
			
				try {
					account.cashOut(console.cashOut());
						} catch (NotEnoughBalanceException e) {
							console.printException(e.getMessage());
						}
			}
			break;
		
			case 4:
			
				investment.dividend(console.addInvestment());
			
			break;
			
			/*default:
				console.printMessage();
			break;*/
			}
		}while (opt !=0);
	}
}
