package com.senac.PraticaOOP;

public class Aplicacao {

	public static void main(String[] args) {
		Controller controlador = new Controller();
		
		//generates fifty contacts
		for ( int i = 0 ; i < 50 ; i++)
		{
			controlador.listarContato(controlador.gerarContatoAleatorio());
			System.out.println("");
		}
		
	}
	
}
