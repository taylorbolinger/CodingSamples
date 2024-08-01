// Class:	CS500
// Term:	Spring 2024
// Name:	Taylor Bolinger
// Program Number: Assignment 3 Programming 1
// IDE:		IntelliJ
import java.util.Scanner;
public class InputSumTaylorBolinger {
    public static void main(String[] args) { //Main method begins.
        Scanner scanner = new Scanner(System.in);

        boolean continueProgram = true; //Initialize boolean.

        while (continueProgram) {
            int sum = 0; //If user chooses to retry, the sum will be restored to 0 before user enters new numbers.
            String enteredNumbers = "";
            //Prompt the user to enter a string of positive integers and enter -1 to end the string.
            System.out.println("Enter positive integers (enter -1 to stop):");

            // Program will only accept positive numbers greater than 0.
            int number;
            while ((number = scanner.nextInt()) != -1) {
                if (number > 0) {
                    sum += number; //Program will add the sum of each positive number entered.
                    enteredNumbers += number + " "; //Program will add each positive number to the enteredNumber string.
                }
            }
            // Display the entered numbers and their sum.
            System.out.println("Entered numbers: " + enteredNumbers);
            System.out.println("Sum of the entered numbers: " + sum);


            // Ask user if they want to run the program again.
            System.out.print("Retry? (Y/N): ");
            String input = scanner.next();

            if (input.equals("Y")) {
                continueProgram = true; // User wants to retry, continue to the main loop
            } else {
                continueProgram = false; // User entered anything else, break the main loop and end the program.
            }
        }
    }
}
