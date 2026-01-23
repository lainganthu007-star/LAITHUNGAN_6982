package ASSIGNMENT;

import java.util.ArrayList;
import java.util.Random;

public class COUNTODDEVENNUMBERS {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 15; i++) {
            numbers.add(rd.nextInt(50) + 1);
        }
        int even = 0, odd = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("List:" + numbers);
        System.out.println("Even numbers:" + even);
        System.out.println("Odd numbers" + odd);
    }
}
