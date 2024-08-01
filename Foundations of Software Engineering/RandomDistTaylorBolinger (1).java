// Class:	CS500
// Term:	Spring 2024
// Name:	Taylor Bolinger
// Program Number: Assignment 4 Programming 1
// IDE:		IntelliJ
import java.util.Scanner;
public class RandomDistTaylorBolinger {

    // Create a method that will generate a random integer between 0 and 9
    public static int getRandomInteger() {
        return (int) (Math.random() * 10);
    }
    // Create a method that will print the distribution of the random numbers
    public static void printDistribution(int[] countArray, int n) {
        for (int i = 0; i < countArray.length; i++) {
            // Determine the percentage of occurrences and print out the count
            double percentage = (double) countArray[i] / n * 100;
            double roundedPercentage = Math.round(percentage * 100.0) / 100.0;
            System.out.print("Count of " + i + " is " + countArray[i] + ", " + roundedPercentage + "% of " + n + "\n");
        }
    }
    // Main method begins
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create variable for making a choice to retry
        char retry = 'Y';

        // Loop until the user decides to quit
        while (retry == 'Y') {
            // Prompt the user to enter the number of times of generation
            System.out.print("Enter number n (how many times of generation): ");
            int n = scanner.nextInt();

            // Create an array that will count the occurrences of each random number
            int[] countArray = new int[10];

            // Generate random integers and count all occurrences
            for (int i = 0; i < n; i++) {
                int randomInt = getRandomInteger();
                countArray[randomInt]++;
            }

            // Print the distribution
            printDistribution(countArray, n);

            // Ask the user if they want to retry
            System.out.print("Retry? (Y/N): ");
            retry = scanner.next().charAt(0);
        }
    }
}

