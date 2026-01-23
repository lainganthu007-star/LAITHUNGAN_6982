package ASSIGNMENT;

import java.util.ArrayList;

public class CHECKFORANELEMENT {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Seoul");
        cities.add("Tokyo");
        cities.add("Paris");
        cities.add("London");
        cities.add("Bali");
        if (cities.contains("London")) {
            System.out.println("The list contains London.");
        } else {
            System.out.println("The list does not contain London.");
        }
    }
}
