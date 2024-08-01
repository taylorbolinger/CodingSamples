// Class:	CS500
// Term:	Spring 2024
// Name:	Taylor Bolinger
// Program Number: Assignment 4 Programming 1
// IDE:		IntelliJ
import java.util.Scanner;

public class ColumnSortingTaylorBolinger {
    // Create method that will sort columns of an array
    public static double[][] sortColumns(double[][] m) {
        // Create a new array to store sorted values
        double[][] sortedArray = new double[m.length][m[0].length];

        // Copy the original array to the sorted array
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sortedArray[i][j] = m[i][j];
            }
        }
        // Sort each column of the sorted array
        for (int col = 0; col < sortedArray[0].length; col++) {
            for (int i = 0; i < sortedArray.length - 1; i++) {
                for (int j = i + 1; j < sortedArray.length; j++) {
                    if (sortedArray[i][col] > sortedArray[j][col]) {
                        double temp = sortedArray[i][col];
                        sortedArray[i][col] = sortedArray[j][col];
                        sortedArray[j][col] = temp;
                    }
                }
            }
        }
        // Return the sorted array
        return sortedArray;
    }
    // Main method begins
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create variable for making a choice to retry
        char retry = 'Y';

        // Loop until the user decides to quit
        while (retry == 'Y') {
            System.out.println("Enter a 3-by-3 matrix row by row:");
            double[][] matrix = new double[3][3];

            // Read the user's input
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = scanner.nextDouble();
                }
            }
            // Sort the columns
            double[][] sortedMatrix = sortColumns(matrix);

            // Print the column-sorted values
            System.out.println("The column-sorted array is:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(sortedMatrix[i][j] + " ");
                }
                System.out.println();
            }
            // Ask the user if they want to retry
            System.out.print("Retry? (Y/N): ");
            retry = scanner.next().charAt(0);
        }
    }
}
