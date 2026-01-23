package ASSIGNMENT;

import java.util.ArrayList;
import java.util.Random;

public class REMOVEANELEMNET {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(100) + 1);
        }
        System.out.println("Original list:" + numbers);
        numbers.remove(3);
        System.out.println("Afer removing index 3:" + numbers);
    }
}
