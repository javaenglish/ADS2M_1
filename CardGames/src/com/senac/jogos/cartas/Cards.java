package com.senac.jogos.cartas;

public class Cards {
	private String number;
	private char type;
	
	public Cards (String number, char type)
	{
		this.number = number;
		this.type = type;
	}
	
	public String getNumber() {
		return this.number;
	}
	public char getType() {
		return this.type;
	}
}
