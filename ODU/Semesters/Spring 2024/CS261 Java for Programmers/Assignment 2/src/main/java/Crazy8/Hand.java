/**
 * 
 */
package Crazy8;

import PlayingCards.Card;

/**
 * @author zeil
 *
 */
public class Hand {
    private Card[] cards;
    private int numCards;

    public Hand() {
        numCards = 0;
        cards = new Card[52];
    }

    public int size() {
        return numCards;
    }

    /**
     * Add a card to a hand. Cards are kept sorted in order by suit, then rank.
     * 
     * @param c
     */
    public void add(Card cardToInsert) {
        int toBeMoved = numCards - 1;
        while (toBeMoved >= 0 && cards[toBeMoved].compareTo(cardToInsert) > 0) {
            cards[toBeMoved + 1] = cards[toBeMoved];
            toBeMoved--;
        }
        cards[toBeMoved + 1] = cardToInsert;
        numCards++;
    }

    /**
     * Get the ith card from the hand. See add(...) above, for explanation of
     * ordering.
     * 
     * @param i
     * @return card in ith position
     */
    public Card get(int i) {
        if (i >= 0 && i < numCards) {
            return cards[i];
        }
        return null;
    }

    /**
     * Remove the ith card from the hand.
     * 
     * @param i
     */
    public void remove(int i) {
        if (i >= 0 && i < numCards) {
            for (int j = i; j < numCards - 1; j++) {
                cards[j] = cards[j + 1];
            }
            numCards--;
        }
    }

    public String toString() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < numCards; ++i) {
            if (i > 0)
                buf.append(' ');
            buf.append(cards[i].toString());
        }
        return buf.toString();
    }

    public void clear() {
        numCards = 0;
    }

    public int score() {
        int s = 0;
        for (int i = 0; i < numCards; ++i) {
            Card c = cards[i];
            int rank = c.getRank().getValue();
            if (rank == 8)
                s += 50;
            else if (rank == 14)
                s += 1;
            else if (rank >= 10)
                s += 10;
            else
                s += rank;
        }
        return s;
    }

}
