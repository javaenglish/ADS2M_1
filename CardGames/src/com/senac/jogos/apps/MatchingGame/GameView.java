package com.senac.jogos.apps.MatchingGame;

import java.util.Scanner;

import static java.lang.System.out;

public class GameView {

	private Scanner entry = new Scanner(System.in);
	
	public String getInput()
	{
		return entry.nextLine();
	}
	
	public void printLine(String message)
	{
		System.out.println( message );
	}
	
	public void drawCards(String number, char type) {
		out.println(String.format("Carta: %s%c",
				                  number,
				                  type));
	}
	
	public void showScore(int score) {
		out.println(String.format("Pontos do jogador: %d", score));
	}
	
	//imprime a tabela da pontuacao final para quatro jogadores.
	//informando o vencedor, os pontos do vencedor,
	//e os potos dos outros jogadores.
	public void printRank(int pontos1, int pontos2, int pontos3, int pontos4, int vencedor, int pontosVencedor)
	{
		out.printf("### Resultado ###%n"
				+ "Vencedor %d - %d Pontos%n"
				+ "-----------%n"
				+ "Jogador 1 %d Pontos%n"
				+ "Jogador 2 %d Pontos%n"
				+ "Jogador 3 %d Pontos%n"
				+ "Jogador 4 %d Pontos", vencedor, pontosVencedor
									, pontos1
									, pontos2
									, pontos3
									, pontos4);
	}
	
	//imprime a tabela da pontuacao final para tres jogadores.
	//informando o vencedor, os pontos do vencedor,
	//e os potos dos outros jogadores.
	public void printRank(int pontos1, int pontos2, int pontos3, int vencedor, int pontosVencedor)
	{
		out.printf("### Resultado ###%n"
				+ "Vencedor %d - %d Pontos%n"
				+ "-----------%n"
				+ "Jogador 1 %d Pontos%n"
				+ "Jogador 2 %d Pontos%n"
				+ "Jogador 3 %d Pontos%n"
									, vencedor, pontosVencedor
									, pontos1
									, pontos2
									, pontos3);
	}
	
	//imprime a table da pontuacao final para dois jogadores.
	//informando o vencedor, os pontos do vencedor, 
	//e os pontos dos outros jogadores.
	public void printRank(int pontos1, int pontos2, int vencedor, int pontosVencedor)
	{
		out.printf("### Resultado ###%n"
				+ "Vencedor %d - %d Pontos%n"
				+ "-----------%n"
				+ "Jogador 1 %d Pontos%n"
				+ "Jogador 2 %d Pontos%n"
									, vencedor, pontosVencedor
									, pontos1
									, pontos2);
	}
	
	//imprime a tabela de pontua��o final para um jogador.
	//informando que � o vencedor e os seus pontos.
	public void printRank(int pontos)
	{
		out.printf("### Resultado ###%n"
				+ "Vencedor %d - %d Pontos"
				+ "-----------%n"
				+ "Jogador 1 %d Pontos", pontos
									, pontos
									, pontos);
	}

	//m�todo n�o implementado corretamente
	public void showCard (String number, char type) {
			out.printf(number, type);	
	}
}
