package com.senac.HelloWorld;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		String user;
		@SuppressWarnings("resource")
		Scanner entry = new Scanner (System.in);
				
		System.out.println("Type your name below");
		user=entry.next();
		
		System.out.println("Hello "+user+"!");
	}

}
