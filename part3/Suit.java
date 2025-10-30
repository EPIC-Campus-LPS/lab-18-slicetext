package part3;

public enum Suit {
    Hearts("Hearts"),
    Diamonds("Diamonds"),
    Clubs("Clubs"),
    Spades("Spades");

    private final String name;

    private Suit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Suit fromInt(int index) {
        switch (index) {
            case 0:
                return Suit.Hearts;
            case 1:
                return Suit.Diamonds;
            case 2:
                return Suit.Clubs;
            case 3:
                return Suit.Spades;
        }
        throw new IndexOutOfBoundsException("Invalid index for suit " + index);
    }
}
