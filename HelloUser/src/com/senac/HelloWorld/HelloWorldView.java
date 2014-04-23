package com.senac.HelloWorld;

import static java.lang.System.out;

import java.util.Scanner;

public class HelloWorldView 
{
	public void printMessage(String message)
	{
		out.print(message);
	}
	
	public String digitaDados(){
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		String digitaDados = entrada.nextLine();
		return digitaDados;
	}
}
