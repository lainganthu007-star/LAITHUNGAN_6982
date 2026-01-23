package ASSIGNMENT;

import java.util.ArrayList;

public class ITERATETHOUGH {

    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(10.5);
        prices.add(20.0);
        prices.add(7.25);
        prices.add(99.99);
        for (int i = 0; i < prices.size(); i++) {
            System.out.println("Price:" + prices.get(i));
        }
    }
}
