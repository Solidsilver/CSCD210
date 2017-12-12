// This program was created by Luke Mattfeld
//  for CSCD 210 at Eastern Washington University.
//  October, 2017

import java.util.Scanner;

public class Selections3 {
    public static void main(String[] args) {
        String color;
        String firstLetter;

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a color: ");
        color = kb.nextLine();
        color = color.toLowerCase();            // Put input into lower case, so both upper and lower case input will be identified
        firstLetter = color.substring(0,1);
        System.out.print("\n" + firstLetter.toUpperCase() + color.substring(1));  //  Print out color name with first letter upper case. This will be done for any input,
                                                                                  // so it can be printed before input is evaluated.

        if (color.equals("blue") || color.equals("red") || color.equals("yellow")) {
            System.out.println(" is a primary color");
        }
        else if (color.equals("purple") || color.equals("orange") || color.equals("green")) {
            System.out.println(" is a secondary color");
        }
        else if (color.equals("brown")) {
            System.out.println(" is a tertiary color");
        } else {
            System.out.println(": I'm not sure how to make this,");
            System.out.println("but it's a lovely color.");
        }

    }
}