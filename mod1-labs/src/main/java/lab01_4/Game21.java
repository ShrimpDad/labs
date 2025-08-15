package lab01_4;

import java.util.Random;

public class Game21 {

	static String[] cards = { "Ace Spades", "2 Spades", "3 Spades", "4 Spades", "5 Spades", "6 Spades", "7 Spades",
			"8 Spades", "9 Spades", "10 Spades", "Jack Spades", "Queen Spades", "King Spades", "Ace Hearts", "2 Hearts",
			"3 Hearts", "4 Hearts", "5 Hearts", "6 Hearts", "7 Hearts", "8 Hearts", "9 Hearts", "10 Hearts",
			"Jack Hearts", "Queen Hearts", "King Hearts", "Ace Clubs", "2 Clubs", "3 Clubs", "4 Clubs", "5 Clubs",
			"6 Clubs", "7 Clubs", "8 Clubs", "9 Clubs", "10 Clubs", "Jack Clubs", "Queen Clubs", "King Clubs",
			"Ace Diamonds", "2 Diamonds", "3 Diamonds", "4 Diamonds", "5 Diamonds", "6 Diamonds", "7 Diamonds",
			"8 Diamonds", "9 Diamonds", "10 Diamonds", "Jack Diamonds", "Queen Diamonds", "King Diamonds" };

	public static void main(String[] args) {

		int drawLimit = 5;
		String card = "";
		int cardValue = 0;
		int totalValue = 0;

		for (int i = 1; i <= drawLimit; i++) {
			card = drawCard();
			cardValue = getCardValue(card);
			totalValue += cardValue;
			System.out.println(card + " is worth " + cardValue);

		}

		System.out.println("Total value is: " + totalValue);
	}

	public static int getCardValue(String card) {

		String rank = card.split(" ")[0];

		switch (rank) {
		case "10":
		case "Jack":
		case "Queen":
		case "King":
		case "Ace":
			return 10;
		default:
			return Integer.parseInt(rank);
		}
	}

	public static String drawCard() {
		if (cards.length == 0) {
			return "0 Nocard";
		}

		String removedCard = "";
		Random r = new Random();
		int position = r.nextInt(0, cards.length);

		removedCard = cards[position];

		String[] newDeck = new String[cards.length - 1];
		int pos = 0;
		for (String card : cards) {
			if (card == removedCard) {
				continue;
			}
			newDeck[pos] = card;
			pos++;
		}

		cards = newDeck;

		return removedCard;
	}

}
