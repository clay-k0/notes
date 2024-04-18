/**
 * 
 */
package PlayingCards;

/**
 * @author zeil
 *
 */
public class Card implements Comparable<Card> {
    public enum Rank {
        Two(2),
        Three(3),
        Four(4),
        Five(5),
        Six(6),
        Seven(7),
        Eight(8),
        Nine(9),
        Ten(10),
        Jack(11),
        Queen(12),
        King(13),
        Ace(14);

        private final int value;

        Rank(int v) {
            value = v;
        }

        public int getValue() {
            return value;
        }

    }

    public enum Suit {
        Clubs, Diamonds, Hearts, Spades
    };

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public String toString() {
        String r = "" + rank.getValue();
        if (rank.getValue() > 10) {
            r = rank.toString().substring(0, 1);
        }
        return r + suit.toString().substring(0, 1);
    }

    /**
     * Used for ordering cards - c1 comes before c2 if c1 has a lower suit or,
     * if they have the same suit, if c1 has lower rank.
     * 
     * @param aCard a playing card
     * @return -1 if this card comes before aCard, 0 if they are equal, 1 if
     *         aCard comes before this card
     */
    public int compareTo(Card aCard) {
        if (suit.ordinal() < aCard.suit.ordinal())
            return -1;
        if (suit.ordinal() > aCard.suit.ordinal())
            return 1;
        else // same suit
        if (rank.ordinal() < aCard.rank.ordinal())
            return -1;
        else if (rank.ordinal() > aCard.rank.ordinal())
            return 1;
        else // ranks are also equal
            return 0;
    }

    public boolean equals(Object cardObj) {
        if (cardObj == null || !(cardObj instanceof Card))
            return false;
        Card card = (Card) cardObj;
        return suit == card.suit && rank == card.rank;
    }

    private Suit suit;
    private Rank rank;

}
