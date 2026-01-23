package ASSIGNMENT;

import java.util.ArrayList;

public class COPYANARRAYLIST {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Watermelon");
        fruits.add("Mango");
        fruits.add("Strawberry");
        fruits.add("Lime");
        ArrayList<String> copyFruits = new ArrayList<>(fruits);
        System.out.println("Original list:" + fruits);
        System.out.println("Copied list:" + copyFruits);
    }
}
