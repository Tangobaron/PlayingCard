package dawson.assignments;

import aaa.PlayingCard;

public class Game {

	private PlayingCard[] cards = new PlayingCard[52];
	String[] suits = { "Hearts", "Spades", "Clubs", "Diamonds" };

	public static void main(String[] args) {

		Game play = new Game();
		play.initialize();
		play.printAllCards(play.cards);
	}

	public void printAllCards(PlayingCard[] arrayOfCards) {
		for (int i = 0; i < arrayOfCards.length; i++) {
			System.out.println(arrayOfCards[i].print());
		}
	}

	public void initialize() {
		int deckindex = 0;

		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 13; i++) {

				cards[deckindex] = new PlayingCard(suits[j], i);

				deckindex++;
			}
		}
	}

	public PlayingCard[] getCard() {
		return cards;
	}
}
