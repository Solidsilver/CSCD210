/* 
Golf Slang

    This program was created by Luke Mattfeld
for CSCD 210 at Eastern Washington University.
October, 2017

*/

import java.util.Scanner;

public class GolfSlang {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int holeNumber;
        int holePar;
        int holeStrokes;
        int strokesFromPar;
        double random = Math.random();

        System.out.print("Enter the hole number: ");
        holeNumber = kb.nextInt();
        System.out.print("Enter the par for the hole: ");
        holePar = kb.nextInt();
        System.out.print("Enter the number of strokes: ");
        holeStrokes = kb.nextInt();

        strokesFromPar = holeStrokes - holePar;

        System.out.print("On hole #" + holeNumber + ", a par " + holePar + ", you shot ");

        // Slang for strokes-from-par
        if (strokesFromPar == 0 ) {
            if (random >= 0 && random < 0.3) {
                System.out.print("an Even Par");
            } else if (random >= 0.3 && random < 0.6) {
                System.out.print("an Even");
            } else {
                System.out.print("a Par");
            }
        } else if (strokesFromPar > 0 && strokesFromPar <= 3) {
            System.out.print("a ");
            if (strokesFromPar == 2) {
                System.out.print("Double ");
            }
            if (strokesFromPar == 3) {
                System.out.print("Triple ");
            }
            System.out.print("Bogey");
        } else if (strokesFromPar >= 4) {
            System.out.print(strokesFromPar + " Over Par");
        } else if (strokesFromPar == -1) {
            System.out.print("a Birdie");
        } else if (strokesFromPar == -2) {
            System.out.print("an Eagle");
        } else if (strokesFromPar == -3) {
            System.out.print("an Albatross");
        } else if (strokesFromPar == -4) {
            System.out.print("a Condor");
        } else if (strokesFromPar == -5) {
            System.out.print("an Ostrich");
        } else if (strokesFromPar < -5) {
            System.out.print(Math.abs(strokesFromPar) + " Under Par");
        }

        // Slang for specific hole strokes
        if (holeStrokes == 1) {
            if (random >= 0 && random < 0.5) {
                System.out.print(", with a Hole in One");
            } else {
                System.out.print(", with an Ace");
            }
        } else if (holeStrokes == 4) {
            System.out.print(", with a Sailboat");
        } else if (holeStrokes == 8) {
            if (random >= 0 && random < 0.3) {
                System.out.print(", with a Snowman");
            } else if (random >= 0.3 && random < 0.6){
                System.out.print(", with a Frosty");
            } else {
                System.out.print(", with Dog Balls");
            }
        } else if (holeStrokes == 10) {
            System.out.print(", with a Bo Derek");
        }

        // Double par?
        if (holeStrokes == (2 * holePar)) {
            System.out.print(": a Beagle");
        }

        System.out.println(".");

    }
}