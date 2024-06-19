package 서민석.practice.cardGame;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck);
        deck.shuffle();
        System.out.println(deck);

    }
}
