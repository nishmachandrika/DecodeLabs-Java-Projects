import java.util.Random;
import java.util.Scanner;

public class DecodeLabs_Java_P1
{
    public static void main(String[] args)
    {
        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Random object
        Random rand = new Random();

        // Generate random number between 1 and 100
        int number = rand.nextInt(100) + 1;

        // Variables
        int guess;
        int attempts = 0;

        // Maximum attempts
        int maxAttempts = 10;

        // Heading
        System.out.println("=================================");
        System.out.println("     NUMBER GUESSING GAME");
        System.out.println("=================================");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have only " + maxAttempts + " attempts.");

        // Loop with limited attempts
        while(attempts < maxAttempts)
        {
            System.out.print("\nEnter your guess: ");

            // Validate input
            if(sc.hasNextInt())
            {
                guess = sc.nextInt();

                // Count attempts
                attempts++;

                System.out.println("Attempt Number: " + attempts);

                // Conditions
                if(guess > number)
                {
                    System.out.println("Too High!");
                }
                else if(guess < number)
                {
                    System.out.println("Too Low!");
                }
                else
                {
                    System.out.println("Correct Number!");
                    System.out.println("You guessed the number in " + attempts + " attempts.");

                    // Score calculation
                    int score = 100 - (attempts * 10);

                    if(score < 0)
                    {
                        score = 0;
                    }

                    System.out.println("Your Score: " + score);

                    System.out.println("Game Over!");
                    sc.close();
                    return;
                }

                // Attempts left
                System.out.println("Attempts Left: " + (maxAttempts - attempts));
            }
            else
            {
                System.out.println("Invalid Input! Enter numbers only.");
                sc.next();
            }
        }

        // If attempts finished
        System.out.println("\nYou Lost!");
        System.out.println("The Correct Number was: " + number);
        System.out.println("Better Luck Next Time!");

        // Close scanner
        sc.close();
    }
}