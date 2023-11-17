package java_homework_week_5;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string)
 * and printout the collection using for each loop.
 */
public class Programme_4_ColoursArray {
    public static void main(String[] args) {
        ArrayList<String> colourList = new ArrayList<>();
        colourList.add("RED");
        colourList.add("BLUE");
        colourList.add("GREEN");
        colourList.add("YELLOW");
        colourList.add("BLACK");
        colourList.add("WHITE");
        colourList.add("ORANGE");
        colourList.add("PURPLE");
        colourList.add("CYAN");

        for (String coloursList : colourList) {
            System.out.print(colourList + ", ");
        }
    }
}
