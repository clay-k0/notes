package PlayingCards;

import java.util.Random;

public class Deck {

    private int numCards;
    private Card[] cards;

    /**
     * Create a new deck of 52 cards, one of each suit and rank
     * in the order clubs, diamonds, hearts, spades, starting
     * within each suit with the 2 and then ascending in rank to
     * the ace.
     * 
     * E.g.:
     * Deck d = new Deck();
     * Card c1 = d.draw(); // produces 2 of clubs
     * Card c2 = d.draw(); // produces 3 of clubs
     */
    public Deck() {
        numCards = 52;
        cards = new Card[numCards];
        int cardIndex = 0;
        for (int i = Card.Suit.values().length - 1; i >= 0; --i) {
            for (int j = Card.Rank.values().length - 1; j >= 0; --j) {
                cards[cardIndex++] = new Card(Card.Suit.values()[i], Card.Rank.values()[j]);
            }
        }
    }

    /**
     * Remove all cards from a deck.
     * 
     */
    public void clear() {
        numCards = 0;
    }

    /**
     * How many cards are in this deck?
     */
    public int size() {
        return numCards;
    }

    /**
     * Look at the top card on the deck
     */
    public Card topCard() {
        if (numCards > 0) {
            return cards[numCards - 1];
        }
        return null;
    }

    /**
     * Draw a card from the top of the deck
     */
    public Card draw() {
        if (numCards > 0) {
            return cards[--numCards];
        }
        return null;
    }

    /**
     * Add a card to the top of the deck
     */
    public void add(Card c) {
        if (numCards < cards.length) {
            cards[numCards++] = c;
        } else {
            System.err.println("Attempted to add a card to full deck");
        }
    }

    /*
     * Re-arrange the cards in this deck into a random order
     */
    public static Random rand = new Random();

    public void shuffle() {
        for (int i = 1; i < numCards; ++i) {
            int k = rand.nextInt(i + 1);
            Card temp = cards[i];
            cards[i] = cards[k];
            cards[k] = temp;
        }
    }

    public String toString() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < numCards; ++i) {
            if (i > 0)
                buf.append(" ");
            buf.append(cards[numCards - i - 1].toString());
        }
        return buf.toString();
    }

}
