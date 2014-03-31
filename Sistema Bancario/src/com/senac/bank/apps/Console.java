package com.senac.bank.apps;

import java.util.Scanner;

import com.senac.bank.model.*;

public class Console {

	public static void main(String[] args) {
		
	Scanner entry = new Scanner(System.in);
	
	int op;
	System.out.println("What would you like to do?" +
			"\n 1- Cash out" +
			"\n 2- Deposit" +
			"\n 3- Invest" +
			"\n 0- Exit");
	op = entry.nextInt();
	
	switch ( op ) 	{ 
		case 1: 
			System.out.println("How much would you like to cash?");
			double cashOutValue = entry.nextDouble();
			
		break;
		
		case 2:
			System.out.println("How much would you like to deposit?");
			int depositValue = entry.nextInt();
		break;
		
		case 3:
			System.out.println("How much would you like to invest?");
			double investiment = entry.nextDouble();
		break;
		
		case 0:
			System.out.println("Thanks for using our services");
		break;
		
		default:
			System.out.println("Wrong option, please press '1', '2' or '3'");
		break;
		}
	}
}
