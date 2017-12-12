import java.util.Scanner;

public class FiveNumbers {
    public static void main(String[] args) {
        int numIn;
        int sum;
        double average;

        Scanner kb = new Scanner(System.in);

        System.out.println("Input 5 numbers: ");
        sum = 0;
        for (int i = 0; i < 5; i++) {
            numIn = kb.nextInt();
            sum += numIn;
        }

        average = sum / 5;
        System.out.println("The sum of 5 no is: " + sum);
        System.out.println("The Average is: " + average);

    }

}