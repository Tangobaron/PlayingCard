package aaa;

public class PlayingCard {

	private String suit;
	private int value;

	// gets the value of the playing card
	public int getValue() {

		return value;

	}

	// gets the name of the suit
	public String getSuit() {
		return suit;
	}

	// Constructor of the class
	public PlayingCard(String suit, int value) throws Exception {
			
		this.value = value;
		if (value < 0 || value > 13)
			System.out.println("Error: you cannot have more than 13 as a value");
			
		this.suit = suit;
		
	}

	public String print() {
		return (value + 1) + " of " + (suit);
	}
}