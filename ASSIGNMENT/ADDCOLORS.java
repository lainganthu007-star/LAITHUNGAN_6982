package ASSIGNMENT;

import java.util.ArrayList;

public class ADDCOLORS {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("white");
        colors.add("Black");
        colors.add("brow");
        colors.set(1, "Yellow");
        System.out.println("Updated color list");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
