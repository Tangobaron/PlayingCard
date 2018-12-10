package dawson.assignments;

import aaa.PlayingCard;

/**
 * This is the main class of the game
 * @author rapha
 *
 */
public class Game {

	private PlayingCard[] cards = new PlayingCard[52];
	String[] suits = { "Hearts", "Spades", "Clubs", "Diamonds" };

	public static void main(String[] args) {
		
		Game play = new Game();
		play.initialize();
		play.printAllCards(play.cards);
	}

	/**
	 * this method prints all cars
	 * @param arrayOfCards array of all cards of the game
	 */
	public void printAllCards(PlayingCard[] arrayOfCards) {
		for (int i = 0; i < arrayOfCards.length; i++) {
			System.out.println(arrayOfCards[i].print());
		}
	}

	public void initialize() {
		int deckindex = 0;

		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 13; i++) {

				try {
					
					cards[deckindex] = new PlayingCard(suits[j], i);
					
				} catch (Exception e) {
				
					System.out.println("Values must be between 0 and 13, "
							+ "Suits must be between 0 and 4");
				}

				deckindex++;
			}
		}
	}

	public PlayingCard[] getCard() {
		return cards;
	}
	
	public void selectSubset() {
		int playerNumber = 0;
		PlayingCard[] subsetSelecter = new PlayingCard[playerNumber];
	}
}
