package dawson.assignments;

import aaa.PlayingCard;

public class Game {

	PlayingCard[] cards = new PlayingCard[52];
	String[] suits = { "Hearts", "Spades", "Clubs", "Diamonds" };

	public static void main(String[] args) {

		Game play = new Game();
		play.initialize();
		play.printAllCards(play.cards);
	}

	public void printAllCards(PlayingCard[] arrayOfCards) {
		for (int i=0; i<arrayOfCards.length ; i++) {
			System.out.println(arrayOfCards[i].print());
		}
	}

	public void initialize() {

		int deckindex = 0;

		for (int j = 0; j<4; j++) {
			for (int i = 0; i<12; i++) {

				cards[deckindex] = new PlayingCard( suits[j], i);

				deckindex++;
			}
		}
		//		for (int i = 0; i<cards.length; i++) {
		//			int suitindex = i%4;
		//			int valueindex = i%13;
		//			cards[i] = new PlayingCard( suits[suitindex], valueindex);
		//			System.out.println(cards[i].print());
		////			System.out.println(suitindex +" "+ valueindex);
		//		}
	}

}
