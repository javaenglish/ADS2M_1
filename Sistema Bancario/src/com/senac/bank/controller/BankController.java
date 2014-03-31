package com.senac.bank.controller;

import com.senac.bank.console.Console;
import com.senac.bank.exception.NotEnoughBalanceException;
import com.senac.bank.model.*;

public class BankController {

	private Console console;
	private Client client;
	
	//constructor
	public BankController() {
		console  = new Console();
	}


	//important actions to be done by the system
	public void Options ()	{
		console.systemOptions();
		
		int opt = 0;
		
		switch ( opt ) {
		case 1:
			System.out.println("");
		}
	}
	
}