/* 
Loops #3

    This program was created by Luke Mattfeld
for CSCD 210 at Eastern Washington University.
October, 2017
*/

public class Loops3 {
    public static void main(String[] args) {
        int i = 100;

        do {
            System.out.print(i + " ");
            i -= 11;
        } while (i >= 1);
        System.out.println("\n");

        i = 1;
        do {
            System.out.print(i + " ");
            i++;

        } while (i <= Math.sqrt(144) + 1);
        System.out.println("\n");

        i = 1;
        do {
            System.out.print((i * i) + " ");
            i++;
        } while ((i * i) < 200);
        System.out.println();

    }
}