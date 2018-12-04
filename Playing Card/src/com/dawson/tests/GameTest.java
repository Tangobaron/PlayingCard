package com.dawson.tests;

import aaa.PlayingCard;
import dawson.assignments.Game;

public class GameTest {
	//	PlayingCard[] cards = new PlayingCard[52];
	//	String[] suits = { "Hearts", "Spades", "Clubs", "Diamonds" };
	
	public static void main(String[] args) {

		GameTest start = new GameTest();
		start.testCardsInitialization();
		
	}

	public boolean testCardsInitialization() {
		
		Game game = new Game();
		
		game.initialize();
		
		PlayingCard[] local = game.getCard();
		int deckCount = 0;
		for(int i = 0; i < game.getCard().length; ++i) {
			deckCount += local[i].getValue();
		}
		
		if(deckCount != 312) {
			System.out.println("ERROR" + deckCount);
			return false;
		} else {
			System.out.println("True");
			return true;
		}
			
	}
}
