// Class:	CS500
// Term:	Spring 2024
// Name:	Taylor Bolinger
// Program Number: Assignment 2 Programming 1
// IDE:		IntelliJ

import java.util.Scanner;
public class GuessingGameTaylorBolinger {
    public static void main(String[] args) { //Main method begins

        // Give user instructions for guessing game.
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to the game of Guess It!" +
                "\nI will choose a number between 0 and 9." +
                "\nYou will try to guess that number. If your guess is wrong, " +
                "I will tell you if you guessed too high or too low." +
                "\nYou have 3 tries to guess the number." +
                "\nOK, I am thinking of a number. Try to guess it.");

        // Generate mystery number between 0 and 9 for user to guess.
        int mysteryNumber = (int) (Math.random() * 10);

        //User enters first guess.
        System.out.print("\nYour guess?");
        int guessNumber1 = input.nextInt();

        //Check the first guess.
        if (guessNumber1 == mysteryNumber) {
            System.out.println("That's correct! Congratulations!"); //Game ends.
        } else if (guessNumber1 > mysteryNumber) {
            System.out.println("Too high! \n Your guess?"); //User will move on to second guess.
        } else if (guessNumber1 < mysteryNumber) {
            System.out.println("Too low! \n Your guess?"); //User will move on to second guess.
        }
        // If user does not guess mystery number, user will guess for a second time.
        int guessNumber2 = input.nextInt();

        //Check the second guess.
        if (guessNumber2 == mysteryNumber)
            System.out.println("That's correct! Congratulations!"); //Game ends.
        else if (guessNumber2 > mysteryNumber)
            System.out.println("Too high! \n Your guess?"); //User will move on to third guess.
        else if (guessNumber2 < mysteryNumber)
            System.out.println("Too low! \n Your guess?"); //User will move on to third guess.

        // If user does not guess mystery number, user will guess for a third time.
        int guessNumber3 = input.nextInt();

        //Check the second guess.
        if (guessNumber3 == mysteryNumber)
            System.out.println("That's correct! Congratulations!"); //Game ends.
        else if (guessNumber3 != mysteryNumber)
            System.out.println("Incorrect. The mystery number is " + mysteryNumber + "."); //Game ends.

        //Game concludes.
        System.out.println("Thank you for playing!");
    }}

