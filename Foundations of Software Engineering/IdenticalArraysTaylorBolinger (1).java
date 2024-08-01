// Class:	CS500
// Term:	Spring 2024
// Name:	Taylor Bolinger
// Program Number: Assignment 4 Programming 1
// IDE:		IntelliJ
import java.util.Scanner;

public class IdenticalArraysTaylorBolinger {
    // Create a method to check if two arrays are identical
    public static boolean equals(int[][] m1, int[][] m2) {
        // Check to see if the arrays have the same dimensions
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            return false;
        }
        // Check to see if each corresponding element in the arrays are equal
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    // Main method begins
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create variable for making a choice to retry
        char retry = 'Y';

        // Loop until the user decides to quit
        while (retry == 'Y') {
            // Ask the user to enter the first 3x3 array
            System.out.println("Enter list 1:");
            int[][] array1 = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    array1[i][j] = scanner.nextInt();
                }
            }
            scanner.nextLine();
            // Ask the user to enter the second 3x3 array
            System.out.println("Enter list 2:");
            int[][] array2 = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    array2[i][j] = scanner.nextInt();
                }
            }
            scanner.nextLine();
            // Check to see if the arrays are identical
            boolean result = equals(array1, array2);

            // Display the results
            if (result) {
                System.out.println("The two arrays are identical.");
            } else {
                System.out.println("The two arrays are not identical.");
            }
            // Ask the user if they want to retry
            System.out.print("Retry? (Y/N): ");
            retry = scanner.nextLine().charAt(0);
        }
    }
}