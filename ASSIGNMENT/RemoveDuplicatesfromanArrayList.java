package ASSIGNMENT;

import java.util.ArrayList;

public class RemoveDuplicatesfromanArrayList {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Thu Ngan");
        names.add("Kim Ngan");
        names.add("Thao");
        names.add("Truc");
        names.add("Mai");
        names.add("Uyen");

        ArrayList<String> noDuplicates = new ArrayList<>();

        for (String name : names) {
            if (!noDuplicates.contains(name)) {
                noDuplicates.add(name);
            }
        }

        System.out.println("Original list: " + names);
        System.out.println("Without duplicates: " + noDuplicates);
    }
}
