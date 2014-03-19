package com.senac.jogos.cartas;

public class Deck {
	
	private Cards[] cards;
	public int numCards;
	
	public Deck() {
		char[] types = {'C','O','P','E'};
		String[] numbers = {"A" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "J" ," Q" , "K"};
		
		cards = new Cards[52];
		numCards = 0;
		
		for (char naipe: types ) {
			for (int i = 0 ; i < numbers.length ; i++) {
				cards[numCards] = new Cards(numbers[i], naipe);
				numCards++;
			}
		}
	}
	
	public Cards drawCard() {
		Cards card = null;
		
		int index = (int)(Math.random() * numCards);
		card = cards[index];
		numCards--;
		cards[index] = cards[numCards];
		
		return card;
	}

	public boolean isEmpty() {
		return numCards == 0;
	}
}
