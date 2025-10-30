package part3;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>(52);
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 13; j++) {
                cards.add(i * 13 + j, new Card(Suit.fromInt(i), j));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if(cards.isEmpty()) {
            return null;
        }
        return cards.removeFirst();
    }
}
