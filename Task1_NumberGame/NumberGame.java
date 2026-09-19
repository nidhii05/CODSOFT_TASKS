import java.util.Scanner;
import java.util.Random;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        char playAgain;

        do {
            int number = random.nextInt(100) + 1;
            int attempts = 0;
            int guess;

            System.out.println("\n===== NUMBER GAME =====");
            System.out.println("Guess a number between 1 and 100");

            while (true) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Correct! You guessed the number.");
                    System.out.println("Number of attempts: " + attempts);
                    score++;
                    break;
                } 
                else if (guess < number) {
                    System.out.println("Too low! Try again.");
                } 
                else {
                    System.out.println("Too high! Try again.");
                }
            }

            System.out.println("Your score: " + score);

            System.out.print("Do you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("\nGame Over!");
        System.out.println("Final Score: " + score);

        sc.close();
    }
}