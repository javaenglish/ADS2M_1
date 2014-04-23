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
	
	
	//method to handle the operation of deposit
	public double deposit (){
		System.out.println( "How much would you like to deposit?" );
		return entry.nextDouble();
		
	}
	
	public String checkAccount(){
		System.out.println("Please inform your account:");
		return entry.next();
	}
	//handles the action to take money out
	public double cashOut (){
		System.out.println( "How much would you like to cash?" );
		return entry.nextDouble();
	}
	
	//possible investments are managed by this method
	public double addInvestment(){
		System.out.println( "Please, add the tax to calculate your investment");
		return entry.nextDouble();
	}
	
	//treats exception if balance is not sufficient to cash out
	public void printException( String message ){
		System.out.println( message );
	}
	
	public void exit(){
		System.out.println("Thanks for using our services");
	}
	
	public void printMessage(){
		System.out.println( "not a valid option" );
	}
	//creates an interactive menu for the user of the system
	public int systemOptions()	{
			
		System.out.println( "Options"
				+ "\n1 - Insert a Client"
				+ "\n2 - Deposit"
				+ "\n3 - Cash Out"
				+ "\n4 - Investment"
				+ "\n0 - Exit" );
		return entry.nextInt();		
	}

	public void addClient(String addName, String addAccountNumber) {
		
	}

}
