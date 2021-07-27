package PerfectShuffle;

import java.util.ArrayList;

public class PerfectShuffle {
    public static void main(String[] args) {

        ArrayList<Card> originalDeck = populateDeck();
        ArrayList<Card> newDeck = new ArrayList<>(originalDeck);
        int shuffleCount = 0;
        do {
            newDeck = shuffle(newDeck);
            shuffleCount++;
            newDeck.forEach(System.out::print);
            System.out.println();
        } while (!newDeck.equals(originalDeck));

        originalDeck.forEach(System.out::print);
        System.out.println();
        System.out.println("Shuffle count: " + shuffleCount);
    }

    public static ArrayList<Card> shuffle(ArrayList<Card> deck) {
        ArrayList<Card> split1 = new ArrayList<>(deck.subList(0, (deck.size() / 2)));
        ArrayList<Card> split2 = new ArrayList<>(deck.subList((deck.size() / 2), deck.size()));
        ArrayList<Card> newDeck = new ArrayList<>();
        for (int i = 0; i < split1.size(); i++) {
            newDeck.add(split1.get(i));
            newDeck.add(split2.get(i));
        }
        return newDeck;
    }

    public static ArrayList<Card> populateDeck() {
        ArrayList<Card> deck = new ArrayList<>();
        for (int s = 0; s < Card.SUITS.length; s++) {
            for (int r = 0; r < Card.RANKS.length; r++) {
                deck.add(new Card(r, s));
            }
        }
        return deck;
    }
}

