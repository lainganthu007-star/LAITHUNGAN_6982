package ASSIGNMENT;

import java.util.ArrayList;
import java.util.Random;

public class FindtheMaximumandMinimum {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(100) + 1); // 1 -> 100
        }

        int max = numbers.get(0);
        int min = numbers.get(0);

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Random numbers: " + numbers);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
