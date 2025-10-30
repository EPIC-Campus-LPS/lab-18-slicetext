package part3;

import java.util.ArrayList;
import java.util.Collections;

public class Player {
    String name;
    ArrayList<Card> hand;
    int score;

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<>();
        score = 0;
    }

    public void draw(Deck deck) {
        hand.add(deck.drawCard());
    }

    public void drawStartingHand(Deck deck) {
        for(int i = 0; i < 5; i++) {
            draw(deck);
        }
    }

    public Card playCard() {
        Collections.sort(hand);
        return hand.removeFirst();
    }

    public void addPoint() {
        score++;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
