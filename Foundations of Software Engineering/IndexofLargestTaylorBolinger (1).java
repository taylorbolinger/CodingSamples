// Class:	CS500
// Term:	Spring 2024
// Name:	Taylor Bolinger
// Program Number: Assignment 4 Programming 1
// IDE:		IntelliJ

import java.util.Scanner;
public class IndexofLargestTaylorBolinger {
    // Create method that will find the index of the largest value
    public static int findIndex(int[] numbers) {
        int maxIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            // Check if current number is greater than largest value
            if (numbers[i] > numbers[maxIndex]) {
                // Update index of largest value if current number is larger than previous largest value
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    // Main method begins
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declare variable that will store user's choice to retry or not
        char choice;

        do {
            System.out.print("Enter 10 Numbers:\t\t");
            // Create array to store user's input
            int[] inputNumbers = new int[10];

            // Read 10 integer values
            for  (int i = 0; i < 10; i++) {
                inputNumbers[i] = scanner.nextInt();
            }

            System.out.print("You entered these values:\t");
            // Loop through user's array
            for (int i = 0; i < inputNumbers.length; i++) {
                int number = inputNumbers[i];
                // Print each number entered by user
                System.out.print(number + " ");
            }
            System.out.println();

            // Find index of largest value in user input
            int largestIndex = findIndex(inputNumbers);
            System.out.println("Index of largest value:\t\t" + largestIndex);

            // Ask user if they would like to retry.
            System.out.print("Retry? (Y/N): ");
            choice = scanner.next().charAt(0);

        } while (Character.toUpperCase(choice) == 'Y');
    }
}
