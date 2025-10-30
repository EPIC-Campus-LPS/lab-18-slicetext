package part2;

public class GroceryElement implements Comparable<GroceryElement> {
    public String name;
    public int count;

    public GroceryElement(String name) {
        this.name  = name;
        count = 1;
    }

    @Override
    public int compareTo(GroceryElement other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " x" + count;
    }
}
