package com.senac.jogos.apps.MatchingGame;

import com.senac.jogos.Jogador;
import com.senac.jogos.cartas.Deck;
import com.senac.jogos.cartas.Cards;
import com.senac.jogos.rules.MatchingGame;

public class GameController {

	private MatchingGame game;
	private Deck baralho;
	private Jogador[] jogador;
	private GameView view;
	
	public GameController() 
	{
		view 	= new GameView();
		baralho = new Deck();
		game 	= new MatchingGame(baralho.drawCard());
		jogador = new Jogador[ quantidadeJogadores() ];
		
		for (int i = 0 ; i < jogador.length ; i++)
			jogador[i] = new Jogador();
	}

	public Jogador[] getJogador()
	{
		return jogador;
	}

	/*realiza uma jogada informando se uma das opções foi escolhida
	se nenhuma opção tenha sido escolhida retorna FALSE, 
	caso contrario retorna TRUE.*/
	public boolean realizaJogada(int numeroJogador) 
	{
		String op = "jogar";
		
		if ( op.equalsIgnoreCase("jogar") ) 								//opção de jogada "jogar".
		{																	
			
			Cards comprada = baralho.drawCard();							//compra uma carta par ao usuário.
			
			view.mostraCarta( comprada.getNumber(), comprada.getType() );	//mostra a carta comprada pelo jogador.
			
			int score = game.matchCards( comprada );						//calcula o valor de pontos recebidos pela jogada.
			jogador[numeroJogador].addPontos( score );						//adiciona esses valores a pontuação do usuário.
			game.setMesa( comprada );										//coloca a carta comprada pelo usuário na mesa.
			jogador[ numeroJogador ].setSkipRound(false);
			
			return true;
		}
		
		if ( op.equalsIgnoreCase("skip") 									//opção de jogada "passar". Jogador nao pode passar a rodada
				&& !jogador[ numeroJogador ].isSkipRound() )				
		{																	//duas vezes seguidas.
			jogador[ numeroJogador ].subtractScore( 1 );					//dubtrai um ponto dos pontos do jogador.
			view.printLine( "Você passou a vez..." );						//informa que o usuário passou uma rodada.
			jogador[ numeroJogador ].setSkipRound(true);
			
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
		view.showScore(jogador[numeroJogador].getScore());
		view.mostraCarta( game.getMesa().getNumber() , game.getMesa().getType() );
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
		
		for (int i = 0 ; i < jogador.length ; i++)
		{
			if ( jogador[i].getScore() > maior )
			{
				maior = jogador[i].getScore();
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
		case 1 : view.imprimeRank(jogador[0].getScore()); 	break;	//chama o metodo para imprimir o resultado para 1 jogador.
				
				
		case 2 : view.imprimeRank(jogador[0].getScore()			//chama o metodo para imprimir o resultado para 2 jogadores.
				, jogador[1].getScore()
				, (calculaVencedor() + 1)
				, jogador[ calculaVencedor() ].getScore()); break;
				
		case 3 : view.imprimeRank(jogador[0].getScore()			//chama o metodo para imprimir o resultado para 3 jogadores.
				, jogador[1].getScore()
				, jogador[2].getScore()
				, (calculaVencedor() + 1)
				, jogador[ calculaVencedor() ].getScore()); break;
				
		case 4 : view.imprimeRank(jogador[0].getScore()			//chama o metodo para imprimir o resultado para 4 jogadores.
				, jogador[1].getScore()
				, jogador[2].getScore()
				, jogador[3].getScore()
				, (calculaVencedor() + 1)
				, jogador[ calculaVencedor() ].getScore()); break;
		default : System.out.println("opção inválida"); break;
		}
	}
	
	public boolean realizaJogadaDuasCartas(int numeroJogador) 
	{
		String op = "jogar";
		
		if ( op.equalsIgnoreCase("jogar") ) 								
		{																	
			
			Cards comprada1 = baralho.drawCard();							
			Cards comprada2 = baralho.drawCard();
			
			view.mostraCarta( comprada1.getNumber(), comprada1.getType() );	
			view.mostraCarta( comprada2.getNumber(), comprada2.getType() );	
			
			int score = game.matchCards( comprada1, comprada2 );						
			jogador[numeroJogador].addPontos( score );						
			
			game.setMesa( comprada2 );										
			
			jogador[ numeroJogador ].setSkipRound(false);
			
			return true;
		}
		
		if ( op.equalsIgnoreCase("skip") 									
				&& !jogador[ numeroJogador ].isSkipRound() )				
		{																	
			jogador[ numeroJogador ].subtractScore( 1 );					
			view.printLine( "You skipped this round" );						
			jogador[ numeroJogador ].setSkipRound(true);
			
			return true;
		}
		else
			return false;
	}
	
}
