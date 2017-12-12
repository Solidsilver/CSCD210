import java.util.Scanner;

public class GuessingGame {

   public static String compare(int guess, double chosen) {
         if (guess == chosen) {
            return "found";
         } else if (guess > chosen) {
            return "lower";
         } else {
            return "higher";
         }
      }
      

   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);      
      int count;
      int found;
      int runAgain = 1;
      int guess;
      double chosen;

      while (runAgain == 1 ) {
            count = 1;
            found = 0;
            System.out.println("I will pick a number from 1 to 100");
            chosen = Math.floor(Math.random() * 100 + 1);
      
            while (found < 1) {
                  System.out.print("Guess my number: ");
                  guess = kb.nextInt();
                  // System.out.println(chosen); //Debug Info
                  // System.out.println(compare(guess, chosen));  //Debug info
      
                  if (compare(guess, chosen).equals("found")) {
                        System.out.println();
                        System.out.println();
                        System.out.println("You Won");
                        System.out.println("It took you " + count + " guesses");
                        found = 1;
                  } else if (compare(guess, chosen).equals("lower")) {
                        System.out.println("Guess Lower");
                        count++;
                  } else if (compare(guess, chosen).equals("higher")) {
                        System.out.println("Guess Higher");
                        count++;
                  } else {
                        System.out.println("Error!`");
                  }
            }

            System.out.print("Would you like to play again? (yes - 1 | no - 0): ");
            runAgain = kb.nextInt();
            if (runAgain == 1) {
                  System.out.println();
                  System.out.println();
                  System.out.println();
                  System.out.println();
            } else kb.close();
      }

      
   }
}