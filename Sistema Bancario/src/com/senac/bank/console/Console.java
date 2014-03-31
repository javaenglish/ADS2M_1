package com.senac.bank.console;

import java.util.Scanner;

public class Console {
	
	Scanner entry = new Scanner (System.in);
	
	//action for registering client
	public String addName()	{
		System.out.println( "Please type the client's name: " );
		return entry.nextLine();
	}
	
	//action for adding first time balance
	public double addBalance()	{
		System.out.println( "Please add account balance: " );
		return entry.nextDouble();
	}
	
	//action to create account
	public String addAccountNumber()	{
		System.out.println( "Please, type the account number: " );
		return entry.nextLine();
	}
	
	//adding limit to an existing account
	public double addLimit()	{
		System.out.println( "Please insert account limit: " );
		return entry.nextDouble();
	}
	
	public double deposit (){
		System.out.println("How much would you like to deposit?");
		return entry.nextDouble();
		
	}
	public void systemOptions()	{
		System.out.println( "Options"
				+ "\n1 - Insert a Client"
				+ "\n2 - Deposit"
				+ "\n3 - Cash Out"
				+ "\n4 - Investment"
				+ "\n0 - Exit" );
	}
}
