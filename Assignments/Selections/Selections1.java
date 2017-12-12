// This program was created by Luke Mattfeld
//  for CSCD 210 at Eastern Washington University.
//  October, 2017

import java.util.Scanner;

public class Selections1 {
    public static void main(String[] args) {
        String name;
        int age;

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = kb.nextLine();

        System.out.print("Enter your age: ");
        age = kb.nextInt();

        if (age > 40) {
            System.out.println("\n" + name + " you are very old! ");
        }


    }
}