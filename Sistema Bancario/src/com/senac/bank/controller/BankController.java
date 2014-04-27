package com.senac.bank.controller;

import com.senac.bank.console.Console;
import com.senac.bank.exception.NotEnoughBalanceException;
import com.senac.bank.model.*;

public class BankController {

	Console console = new Console();
	Client client = new Client();
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
	
	//method to create a new client
	public void addClient(String addName, String addAccountNumber) {
		client = new Client();
		client.setName(addName);
		client.setAccount(addAccountNumber);
	}

	//all the actions to be done by the system
	public void options ()	{
		
		do{
		switch ( console.systemOptions() ) {
			
		
			case 1: {
				
			console.addName();
					if (console.addName().length() !=0)
						console.clientAdded();
			
			console.addAccountNumber();
					if(account == regularAccount())
						console.accountTypeOne();
					if(account == specialAccount())
						console.accountTypeTwo();
					if(account == investmentAccount())
						console.accountTypeThree();			
					if (console.addAccountNumber().length() !=0)
						console.accountAdded();
					
			account.setBalance(console.addBalance());
					if (account.getBalance() !=0);
					console.balanceAdded();
		
			}
				break;
		
			case 2:
			
				account.deposit(console.deposit());
			
				break;
			
			case 3: {
			
				console.checkAccount();
					
				try {
					account.cashOut(console.cashOut());
						} catch (NotEnoughBalanceException e) {
							console.printException(e.getMessage());
							} finally {
								console.moneyCashed();
								}
							
			}
			break;
	
			case 4:
			
				investment.dividend(console.addInvestment());
			
			break;
			
			case 0:
				
				console.exit();
				
			break;
			
			default:
				console.printMessage();
			break;
			}
		
		}while (console.systemOptions() !=0 );
	}
}
