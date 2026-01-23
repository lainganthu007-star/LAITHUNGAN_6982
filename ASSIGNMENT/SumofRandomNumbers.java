package ASSIGNMENT;

import java.util.ArrayList;
import java.util.Random;

public class SumofRandomNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        int sum = 0;

        // Generate 10 random numbers from 1 to 100
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(100) + 1;
            numbers.add(num);
            sum += num;
        }

        System.out.println("Random numbers: " + numbers);
        System.out.println("Sum of all elements: " + sum);
    }
}
