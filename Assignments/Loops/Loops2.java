/* 
Loops #2

    This program was created by Luke Mattfeld
for CSCD 210 at Eastern Washington University.
October, 2017
*/

public class Loops2 {
    public static void main(String[] args) {
        int i = 0;

        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");

        i = 10;
        while (i <= 20) {
            System.out.print(i + " ");
            i += 3;
        }
        System.out.println("\n");

        i = 20;
        while (i >= 10) {
            System.out.print(i + " ");
            i -= 2;
        }
        System.out.println("\n");

        i = 1;
        while (i <= 100) {
            if (i % 11 == 0) {
            System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();

    }
}