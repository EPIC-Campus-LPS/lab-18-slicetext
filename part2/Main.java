package part2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GroceryList list = new GroceryList();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while(running){
            String line = scanner.nextLine();
            if(line.equals("STOP")) {
                running = false;
            } else {
                list.push(line);
            }
        }

        for(GroceryElement e : list.getList()) {
            System.out.println(e);
        }
    }
}
