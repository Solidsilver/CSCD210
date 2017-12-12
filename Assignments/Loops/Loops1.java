/* 
Loops #1

    This program was created by Luke Mattfeld
for CSCD 210 at Eastern Washington University.
October, 2017
*/

public class Loops1 {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");      // print used instead of println so all numbers in the loop are printed on the same line.
        }
        System.out.println("\n");

        for (int i = 10; i <= 20; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        for (int i = 20; i >= 10; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        for (int i = 1; i <= 100; i++) {
            if (i % 11 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();       // Doesn't print a blank line, just ends line from previous output.

    }
}