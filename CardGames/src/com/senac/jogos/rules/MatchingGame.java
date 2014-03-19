package com.senac.jogos.rules;

import com.senac.jogos.cartas.Cards;

public class MatchingGame {

	private Cards mesa;
	
	public MatchingGame(Cards inicial) {
		mesa = inicial;
	}

	public void setMesa(Cards mesa)
	{
		this.mesa = mesa;
	}
	
	public Cards getMesa()
	{
		return mesa;
	}
	
	public int matchCards(Cards comprada)
	{
		int score = -2;
		
		if ( mesa.getType() == comprada.getType() )
			score = 1;
		if ( mesa.getNumber().equals( comprada.getNumber() ) )
			score = 4;
		
		return score;
	}
	
	//determina a pontuacao da jogada, 
	//de acordo com a equivalencia de valores da carta
	//determinado pela comparacao das cartas.
	public int matchCards(Cards comprada1, Cards comprada2)
	{
		int score = -3;
		
		//comparacao do naipe de duas cartas
		if ( compararDoisChars( mesa.getType(), comprada1.getType() ) )			
			score = 1;
		if ( compararDoisChars( mesa.getType(), comprada2.getType() ) )
			score = 1;
		if ( compararDoisChars( comprada1.getType(), comprada2.getType() ) )
			score = 1;
		
		//comparacao do numero de duas cartas
		if ( compararDuasStrings( mesa.getNumber(), comprada1.getNumber() ) )
			score = 3;
		if ( compararDuasStrings( mesa.getNumber(), comprada2.getNumber() ) )
			score = 3;
		if ( compararDuasStrings( comprada1.getNumber(), comprada2.getNumber() ) )
			score = 3;
		
		//comparacao de tres cartas
		if ( compararTresChars( mesa.getType(), comprada1.getType(), comprada2.getType() ) )
			score = 6;
		if ( compararTresStrings( mesa.getNumber(), comprada1.getNumber(), comprada2.getNumber() ) )
			score = 8;
		
		return score;
	}
	
	//compara dois chares.
	//retorna TRUE se forem iguais, caso contrario retorna FALSE.
	private boolean compararDoisChars(char char1, char char2)
	{
		if ( char1 == char2)
		
			return true;
		else
			return false;				
	}
	
	//compara duas strings
	//retorna TRUE se forem iguais, caso contrario retorna FALSE.
	private boolean compararDuasStrings(String str1, String str2)
	{
		if ( str1.equals(str2) )
			return true;
		else
			return false;
	}
	
	//compara tres chares
	//retorna TRUE se forem iguais, caso contrario retorna FALSE.
	private boolean compararTresChars(char char1, char char2, char char3)
	{
		if ( char1 == char2 && char2 == char3)
			return true;
		else
			return false;
	}
	
	//compara tres strings
	//retorna TRUE se forem iguais, caso contrario retorna FALSE.
	private boolean compararTresStrings(String str1, String str2, String str3)
	{
		if ( str1.equals(str2) && str2.equals(str3))
			return true;
		else
			return false;
	}
	
	
}
