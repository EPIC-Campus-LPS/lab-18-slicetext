package part3;

public class Main {
    public static void main(String[] args) {
        Player alice = new Player("Alice");
        Player bob = new Player("Bob");
        Deck deck = new Deck();
        deck.shuffle();

        alice.drawStartingHand(deck);
        bob.drawStartingHand(deck);

        int aliceWins = 0, bobWins = 0, ties = 0;

        for(int i = 0; i < 5; i++) {
            Card aliceCard = alice.playCard();
            Card bobCard = bob.playCard();

            // Who wins?
            switch (aliceCard.compareTo(bobCard)) {
                case 1:
                    aliceWins++;
                    System.out.println("Alice won");
                    break;
                case 0:
                    System.out.println("It was a tie");
                    ties++;
                    break;
                case -1:
                    System.out.println("Bob won");
                    bobWins++;
                    break;
            }

            // Draw new cards
            alice.draw(deck);
            bob.draw(deck);
        }

        System.out.println("Alice won " + aliceWins + " times");
        System.out.println("Bob won " + bobWins + " times");
        if(aliceWins > bobWins) {
            System.out.println("Overall, Alice won");
        } else if(aliceWins == bobWins) {
            System.out.println("Overall, they tied");
        } else {
            System.out.println("Overall, Bob won");
        }
    }
}
