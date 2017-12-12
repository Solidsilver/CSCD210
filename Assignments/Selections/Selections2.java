// This program was created by Luke Mattfeld
//  for CSCD 210 at Eastern Washington University.
//  October, 2017

import java.util.Scanner;

public class Selections2 {
    public static void main(String[] args) {
        String name;
        int weight;

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = kb.nextLine();

        System.out.print("Enter your weight: ");
        weight = kb.nextInt();

        System.out.print("\n" + name + ", ");      // Since this is printed no matter the option, Just print it before.

        if (weight > 200) {
            System.out.println("time to think about a diet");
        } else if (weight < 100) {
            System.out.println("time to hit the buffet");
        } else {
            System.out.println("nothing to see here, carry on");
        }

    }
}