package part1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Double> temps = new ArrayList<>();
        File file = new File("src/part1/temperature.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()) {
            temps.add(Double.parseDouble(scanner.nextLine()));
        }
        double max = temps.getFirst();
        double min = temps.getFirst();
        for(double temp : temps) {
            if(temp > max) {
                max = temp;
            }
            if(temp < min) {
                min = temp;
            }
        }
        System.out.println("Max temp: " + max);
        System.out.println("Min temp: " + min);

        int total_spots = 10;
        for(int i = 0; i < temps.size(); i++) {
            if(i > (total_spots - 1)) {
                total_spots *= 2;
            }
        }
        System.out.println("Total Spots: " + total_spots);
    }
}
