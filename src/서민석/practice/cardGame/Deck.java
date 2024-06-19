package 서민석.practice.cardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;
    private static final  String[] SUITS = {"♠", "♥", "\u2666", "♣"};
    private static final String[] RANKS = {"1","2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};

    public Deck() {
        cards = new ArrayList<>();
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card).append("\n");
        }
        return sb.toString();
    }
}