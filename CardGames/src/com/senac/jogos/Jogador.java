package com.senac.jogos;

public class Jogador {
	private int score;			
	private boolean skipRound;
	
	public Jogador() {
		score 			= 0;
		skipRound 	= false;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean isSkipRound() {
		return skipRound;
	}

	public void setSkipRound(boolean skipRound) {
		this.skipRound = skipRound;
	}

	public void addPontos(int score2) {
		score += score2;
	}

	public void subtractScore(int penalty) {
		score -= penalty;
	}
}