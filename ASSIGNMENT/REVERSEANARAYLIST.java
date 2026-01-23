package ASSIGNMENT;

import java.util.ArrayList;
import java.util.Collections;

public class REVERSEANARAYLIST {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        Collections.reverse(numbers);
        System.out.println("Reverse list:" + numbers);
    }
}
