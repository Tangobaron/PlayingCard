package aaa;

public class PlayingCard {

	private String suit;
	private int value;

	//gets the value of the playing card
	public int getValue() {
		return value;
	}

	//gets the name of the suit
	public String getSuit() {
		return suit;
	}

	//Constructor of the class
	public PlayingCard(String suit, int value) {
		this.value = value;
		this.suit = suit;
	}

	public String print() {
		return (value+1) +" of "+ (suit);
	}
}