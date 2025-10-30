package part2;

import java.util.ArrayList;
import java.util.Collections;

public class GroceryList {
    ArrayList<GroceryElement> list = new ArrayList<>();

    public void push(String name) {
        for(GroceryElement e : list) {
            if(e.name.equals(name)) {
                e.count++;
                return;
            }
        }
        list.add(new GroceryElement(name));
    }
    public ArrayList<GroceryElement> getList() {
        Collections.sort(list);
        return list;
    }
}
