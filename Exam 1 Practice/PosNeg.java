import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
        int number;
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = kb.nextInt();

        if (number > 0) {
            System.out.println("\n" + number + " is positive");
        } else if (number < 0) {
            System.out.println("\n" + number + " is negative");
        } else {
            System.out.println("\n" + number + " is neither even or odd");
        }
    }
}