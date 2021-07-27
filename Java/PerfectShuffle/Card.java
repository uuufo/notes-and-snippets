package PerfectShuffle;

public class Card {
    public static String[] SUITS = {"♠", "♥", "♦", "♣"};
    public static String[] RANKS = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    private int suit;
    private int rank;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getSuit() {
        return this.suit;
    }

    public int getRank() {
        return this.rank;
    }

    @Override
    public String toString() {
        return RANKS[this.rank] + SUITS[this.suit];
    }
}
