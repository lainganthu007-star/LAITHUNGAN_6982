package ASSIGNMENT;

import java.util.ArrayList;

public class FindtheLargestandSmallestElement {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(25);
        numbers.add(3);
        numbers.add(18);

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

        System.out.println("List: " + numbers);
        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
    }
}
