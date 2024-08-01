// Class:	CS500
// Term:	Spring 2024
// Name:	Taylor Bolinger
// Program Number: Assignment 4 Programming 1
// IDE:		IntelliJ

import java.util.Scanner;
public class DistinctValuesTaylorBolinger {
    // Create a method that will get distinct values and an array to store them
    public static int[] getValues(int[] inputArray) {
        int[] distinctArray = new int[inputArray.length];
        //Create variable to count the number of values
        int distinctCount = 0; // Counter for distinct values

        // Loop through the array
        for (int i = 0; i < inputArray.length; i++) {
            // Check to see if each value is distinct
            boolean isDistinct = true;

            // Check to see if the value at inputArray[i] is already in distinctArray
            for (int j = 0; j < distinctCount; j++) {
                if (inputArray[i] == distinctArray[j]) {
                    // Mark value if it is not distinct and break
                    isDistinct = false;
                    break;
                }
            }
            // If the value is distinct, add it to distinctArray
            if (isDistinct) {
                distinctArray[distinctCount++] = inputArray[i];
            }
        }
        // Create a new array with the size of distinctCount
        int[] resultArray = new int[distinctCount];
        // Copy each distinct value to the resultArray
        for (int i = 0; i < distinctCount; i++) {
            resultArray[i] = distinctArray[i];
        }
        //Return the new array
        return resultArray;
    }
    // Main method begins
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create variable for making a choice to retry
        char retry = 'Y';

        // Loop until the user decides to quit
        while (retry == 'Y') {
            // Prompt the user to enter 10 integer values
            System.out.print("Enter 10 integer values separated by spaces: ");
            int[] inputArray = new int[10];
            for (int i = 0; i < 10; i++) {
                inputArray[i] = scanner.nextInt();
            }
            // Get distinct values using the getValues method
            int[] distinctArray = getValues(inputArray);

            // Display the distinct numbers
            System.out.print("Distinct Numbers:\t");
            for (int i : distinctArray) {
                System.out.print(i + " ");
            }
            System.out.println();

            // Ask the user if they want to retry
            System.out.print("Retry? (Y/N): ");
            retry = scanner.next().charAt(0);
        }
     }
  }


