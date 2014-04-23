package com.senac.bank.apps;

import com.senac.bank.controller.BankController;

public class System {

	public static void main(String[] args) {
	
		//creates the controller to run the application
		BankController masterController = new BankController();
		
		//shows the option for the user
		masterController.options();
		
		}
	}
