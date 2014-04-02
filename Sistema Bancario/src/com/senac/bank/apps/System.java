package com.senac.bank.apps;

import com.senac.bank.controller.BankController;

public class System {

	public static void main(String[] args) {
	
		BankController masterController = new BankController();
		
		while (true)
		masterController.Options();
		}
	}
