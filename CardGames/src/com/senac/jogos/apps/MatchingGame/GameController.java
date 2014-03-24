package com.senac.jogos.apps.MatchingGame;

import com.senac.jogos.Jogador;
import com.senac.jogos.cartas.Deck;
import com.senac.jogos.cartas.Cards;
import com.senac.jogos.rules.MatchingGame;

public class GameController {

	private MatchingGame game;
	private Deck baralho;
	private Jogador[] player;
	private GameView view;
	
	public GameController() 
	{
		view 	= new GameView();
		baralho = new Deck();
		game 	= new MatchingGame(baralho.drawCard());
		player = new Jogador[ quantidadeJogadores() ];
		
		for (int i = 0 ; i < player.length ; i++)
			player[i] = new Jogador();
	}

	public Jogador[] getJogador()
	{
		return player;
	}

	/*realiza uma jogada informando se uma das opções foi escolhida
	se nenhuma opção tenha sido escolhida retorna FALSE, 
	caso contrario retorna TRUE.*/
	public boolean realizaJogada(int numeroJogador) 
	{
		String op = "play";
		
		if ( op.equalsIgnoreCase("play") ) 								//opção de jogada "jogar".
		{																	
			
			Cards comprada = baralho.drawCard();							//compra uma carta par ao usuário.
			
			view.showCard( comprada.getNumber(), comprada.getType() );	//mostra a carta comprada pelo jogador.
			
			int score = game.matchCards( comprada );						//calcula o valor de pontos recebidos pela jogada.
			player[numeroJogador].addPontos( score );						//adiciona esses valores a pontuação do usuário.
			game.setMesa( comprada );										//coloca a carta comprada pelo usuário na mesa.
			player[ numeroJogador ].setSkipRound(false);
			
			return true;
		}
		
		if ( op.equalsIgnoreCase("skip") 									//opção de jogada "passar". Jogador nao pode passar a rodada
				&& !player[ numeroJogador ].isSkipRound() )				
		{																	//duas vezes seguidas.
			player[ numeroJogador ].subtractScore( 1 );					//dubtrai um ponto dos pontos do jogador.
			view.printLine( "You skipped this turn..." );						//informa que o usuário passou uma rodada.
			player[ numeroJogador ].setSkipRound(true);
			
			return true;
		}
		
		else
			return false;
		}

	//informa se o baralho esta vazio.
	//valor TRUE se o paralho não tem cartas. Valor FALSE caso contrario.
	public boolean isOver() {
		return baralho.isEmpty();		
	}

	//informa o estado do jogador.
	//o número do jogador, os seus pontos atuais e a carta comprada.
	public void showStatus(int numeroJogador) {
		view.printLine( "" );
		view.printLine( "Jogador número " + (numeroJogador + 1) );
		view.showScore(player[numeroJogador].getScore());
		view.showCard( game.getMesa().getNumber() , game.getMesa().getType() );
	}
	
	//recebe a quantidade de jogadores participantes da partida.
	//mínimo 1 e máximo 4.
	private int quantidadeJogadores()
	{
		view.printLine( "Digite a quantidade de jogadores: 1 a 4" );
		
		int quantidade = Integer.parseInt( view.getInput() );
		
		return quantidade;
	}
	
	//informa qual o jogador com maior pontos.
	//retorna o jogador vencedor do jogo.
	public int calculaVencedor()
	{
		int maior 	 = -110;
		int vencedor = 0;
		
		for (int i = 0 ; i < player.length ; i++)
		{
			if ( player[i].getScore() > maior )
			{
				maior = player[i].getScore();
				vencedor = i;
			}
		}
		
		System.out.println(vencedor);
		
		return vencedor;
	}
	
	public void showResult(int quantidadeJogadores)
	{
		switch ( quantidadeJogadores )
		{
		case 1 : view.printRank(player[0].getScore()); 	
		break;	//chama o metodo para imprimir o resultado para 1 jogador.
				
				
		case 2 : view.printRank(player[0].getScore()			//chama o metodo para imprimir o resultado para 2 jogadores.
				, player[1].getScore()
				, (calculaVencedor() + 1)
				, player[ calculaVencedor() ].getScore());
		break;
				
		case 3 : view.printRank(player[0].getScore()			//chama o metodo para imprimir o resultado para 3 jogadores.
				, player[1].getScore()
				, player[2].getScore()
				, (calculaVencedor() + 1)
				, player[ calculaVencedor() ].getScore()); 
		break;
				
		case 4 : view.printRank(player[0].getScore()			//chama o metodo para imprimir o resultado para 4 jogadores.
				, player[1].getScore()
				, player[2].getScore()
				, player[3].getScore()
				, (calculaVencedor() + 1)
				, player[ calculaVencedor() ].getScore()); 
		break;
		
		default : System.out.println("opção inválida"); 
		break;
		
		}
	}
	
	public boolean drawTwoCards(int numeroJogador) 
	{
		String op = "play";
		
		if ( op.equalsIgnoreCase("play") ) 								
		{																	
			
			Cards comprada1 = baralho.drawCard();							
			Cards comprada2 = baralho.drawCard();
			
			view.showCard( comprada1.getNumber(), comprada1.getType() );	
			view.showCard( comprada2.getNumber(), comprada2.getType() );	
			
			int score = game.matchCards( comprada1, comprada2 );						
			player[numeroJogador].addPontos( score );						
			
			game.setMesa( comprada2 );										
			
			player[ numeroJogador ].setSkipRound(false);
			
			return true;
		}
		
		if ( op.equalsIgnoreCase("skip") 									
				&& !player[ numeroJogador ].isSkipRound() )				
		{																	
			player[ numeroJogador ].subtractScore( 1 );					
			view.printLine( "You skipped this round" );						
			player[ numeroJogador ].setSkipRound(true);
			
			return true;
		}
		else
			return false;
	}
	
}
