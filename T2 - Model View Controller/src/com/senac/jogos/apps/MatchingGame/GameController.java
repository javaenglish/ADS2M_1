package com.senac.jogos.apps.MatchingGame;

import com.senac.jogos.Jogador;
import com.senac.jogos.cartas.Baralho;
import com.senac.jogos.cartas.Carta;
import com.senac.jogos.rules.MatchingGame;

public class GameController {

	private MatchingGame game;
	private Baralho baralho;
	private Jogador[] jogador;
	private GameView view;
	
	public GameController() 
	{
		view 	= new GameView();
		baralho = new Baralho();
		game 	= new MatchingGame(baralho.drawCarta());
		jogador = new Jogador[ quantidadeJogadores() ];
		
		for (int i = 0 ; i < jogador.length ; i++)
			jogador[i] = new Jogador();
		
	}

	public Jogador[] getJogador()
	{
		return jogador;
	}

	//realiza uma joganda informando se uma das op��es foi escolhida
	//se nenhuma op��o tenha sido escolhida retorna FALSE, 
	//caso contrario retorna TRUE.
	public boolean realizaJogada(int numeroJogador) 
	{
		String op = "jogar";
		
		if ( op.equalsIgnoreCase("jogar") ) 								//op��o de jogada "jogar".
		{																	
			
			Carta comprada = baralho.drawCarta();							//compra uma carta par ao usu�rio.
			
			view.mostraCarta( comprada.getNumero(), comprada.getNaipe() );	//mostra a carta comprada pelo jogador.
			
			int score = game.matchCards( comprada );						//calcula o valor de pontos recebidos pela jogada.
			jogador[numeroJogador].addPontos( score );						//adiciona esses valores a pontua��o do usu�rio.
			
			game.setMesa( comprada );										//coloca a carta comprada pelo usu�rio na mesa.
			
			jogador[ numeroJogador ].setPassouRodada(false);
			
			return true;
		}
		
		if ( op.equalsIgnoreCase("passar") 									//op��o de jogada "passar". Jogador nao pode passar a rodada
				&& !jogador[ numeroJogador ].isPassouRodada() )				
		{																	//duas vezes seguidas.
			jogador[ numeroJogador ].subtractPontos( 1 );					//dubtrai um ponto dos pontos do jogador.
			
			view.printLine( "Voc� passou a vez..." );						//informa que o usu�rio passou uma rodada.
			
			jogador[ numeroJogador ].setPassouRodada(true);
			
			return true;
		}
		
		else
			return false;
		
	}

	//informa se o baralho esta vazio.
	//valor TRUE se o paralho n�o tem cartas. Valor FALSE caso contrario.
	public boolean isOver() {
		return baralho.isEmpty();		
	}

	//informa o estado do jogador.
	//o n�mero do jogador, os seus pontos atuais e a carta comprada.
	public void showStatus(int numeroJogador) {
		view.printLine( "" );
		view.printLine( "Jogador n�mero " + (numeroJogador + 1) );
		view.mostraPontos(jogador[numeroJogador].getPontos());
		view.mostraCarta( game.getMesa().getNumero() , game.getMesa().getNaipe() );
	}
	
	//recebe a quantidade de jogadores participantes da partida.
	//m�nimo 1 e m�ximo 4.
	private int quantidadeJogadores()
	{
		view.printLine( "Digite a quantidade de jogadores: 1 a 4" );
		
		int quantidade = Integer.parseInt(view.getUserInput());
		
		return quantidade;
	}
	
	//informa qual o jogador com maior pontos.
	//retorna o jogador vencedor do jogo.
	public int calculaVencedor()
	{
		int maior 	 = -110;
		int vencedor = 0;
		
		for (int i = 0 ; i < jogador.length ; i++)
		{
			if ( jogador[i].getPontos() > maior )
			{
				maior = jogador[i].getPontos();
				vencedor = i;
			}
		}
		
		System.out.println(vencedor);
		
		return vencedor;
	}
	
	public void mostraResultado(int quantidadeJogadores)
	{
		switch ( quantidadeJogadores )
		{
		case 1 : view.imprimeRank(jogador[0].getPontos()); 	break;	//chama o metodo para imprimir o resultado para 1 jogador.
				
				
		case 2 : view.imprimeRank(jogador[0].getPontos()			//chama o metodo para imprimir o resultado para 2 jogadores.
				, jogador[1].getPontos()
				, (calculaVencedor() + 1)
				, jogador[ calculaVencedor() ].getPontos()); break;
				
		case 3 : view.imprimeRank(jogador[0].getPontos()			//chama o metodo para imprimir o resultado para 3 jogadores.
				, jogador[1].getPontos()
				, jogador[2].getPontos()
				, (calculaVencedor() + 1)
				, jogador[ calculaVencedor() ].getPontos()); break;
				
		case 4 : view.imprimeRank(jogador[0].getPontos()			//chama o metodo para imprimir o resultado para 4 jogadores.
				, jogador[1].getPontos()
				, jogador[2].getPontos()
				, jogador[3].getPontos()
				, (calculaVencedor() + 1)
				, jogador[ calculaVencedor() ].getPontos()); break;
		}
	}
	
	public boolean realizaJogadaDuasCartas(int numeroJogador) 
	{
		String op = "jogar";
		
		if ( op.equalsIgnoreCase("jogar") ) 								
		{																	
			
			Carta comprada1 = baralho.drawCarta();							
			Carta comprada2 = baralho.drawCarta();
			
			view.mostraCarta( comprada1.getNumero(), comprada1.getNaipe() );	
			view.mostraCarta( comprada2.getNumero(), comprada2.getNaipe() );	
			
			int score = game.matchCards( comprada1, comprada2 );						
			jogador[numeroJogador].addPontos( score );						
			
			game.setMesa( comprada2 );										
			
			jogador[ numeroJogador ].setPassouRodada(false);
			
			return true;
		}
		
		if ( op.equalsIgnoreCase("passar") 									
				&& !jogador[ numeroJogador ].isPassouRodada() )				
		{																	
			jogador[ numeroJogador ].subtractPontos( 1 );					
			
			view.printLine( "Voc� passou a vez..." );						
			
			jogador[ numeroJogador ].setPassouRodada(true);
			
			return true;
		}
		
		else
			return false;
		
	}
	
}
