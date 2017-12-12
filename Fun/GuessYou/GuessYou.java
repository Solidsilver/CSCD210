import java.util.Scanner; // Import scanner class for keyboard input

public class GuessYou {

    public static void main(String[] args) {
        //Initialize variables
        int guess = 50;         //Initial guess is half of the range of possible numbers.
        int guesTries = 1;      //Keeps track of guess attempts.
        int numberFound = 0;
        int lastGuess = 0;
        int cache;              // used to temporarily store guess variable, so calculations will work.
        String input;           // create string to hold user input lol

        // Create kb input Scanner, and begin interaction
        Scanner kb = new Scanner(System.in);
        System.out.println("Pick a number from 1 and 100, and I will guess it");
        System.out.println("(Possible responses: higher, lower, or yes)");

        // Begin guessing loop
        while (numberFound < 1) {                                   // Repeat guessing until numberFound is set to 1 when number is found
            System.out.println("Is your number " + guess + "?");
            input = kb.nextLine();                                  // Set keyboard input to input String

            if (input.equals("higher")) {   // Do this if input is "higher"
                if (lastGuess == 0) {       // This if is only for the first guess, since lastGuess starts as 0
                    cache = guess;
                    guess = Math.abs(guess - 100) / 2 + guess;
                    lastGuess = cache;
                    guesTries++;                                            // Keep track of how many guesses are made
                } else if (Math.abs(guess - lastGuess) / 2 == 0) {
                    cache = guess;                                          // Cache is used to hold the value of guess while
                    guess = guess + Math.abs(guess - lastGuess) / 2 + 1;    // new guess is being calculated.
                    lastGuess = cache;                                      // Then after old lastGuess was used for new guess, lastGuess is set to last guess
                    guesTries++;
                } else {
                    cache = guess;
                    guess = guess + Math.abs(guess - lastGuess) / 2;
                    lastGuess = cache;
                    guesTries++;
                }
            } else if (input.equals("lower")) {                             // Do this if user input is "lower"
                if (Math.abs(guess - lastGuess) / 2 == 0) {
                    cache = guess;
                    guess = guess - Math.abs(guess - lastGuess) / 2 - 1;
                    lastGuess = cache;
                    guesTries++;
                } else {
                    cache = guess;
                    guess = guess - Math.abs(guess - lastGuess) / 2;
                    lastGuess = cache;
                    guesTries++;
                }
            } else if (input.equals("yes")) {                               // Run when guess is correct
                if (guesTries == 1) {
                    System.out.println();                                   // Print two new lines for visual clarity.
                    System.out.println();
                    System.out.println("Your number was " + guess
                                        + ", which I guessed in 1 move. Thanks for playing");
                }
                else {
                    System.out.println();                                   // Print two new lines for visual clarity.
                    System.out.println();
                    System.out.println("Your number was " + guess
                                        + ", which I guessed in " + guesTries
                                        + " moves. Thanks for playing");
                }
                numberFound = 1;                                            // Stop while loop
            } else {
                System.out.println("Input not Understood. Please try again.");
            }
        
        }

        kb.close();                                                         // Closes Scanner object to prevent resource leak

    }
}