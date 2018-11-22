package com.dawson.tests;

import aaa.PlayingCard;
import dawson.assignments.Game;

public class GameTest {
	
	PlayingCard[] cards = new PlayingCard[52];
	String[] suits = { "Hearts", "Spades", "Clubs", "Diamonds" };
	
	public static void main(String[] args) {

	}

	public boolean testCardsInitialization(Class<Game> Game) {

		Game tester = new Game();

		Game initializer = new Game();
		initializer.initialize();
		
		int deckCount = 0;
		
		

		
		
		return false; 
	}
}
