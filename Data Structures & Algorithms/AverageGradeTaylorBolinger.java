//Name: Taylor Bolinger
//Class: CS 5040/Section W01
//Term: Summer 2024
//Instructor: Umama Tasnim

import java.util.Scanner;

public class AverageGradeTaylorBolinger {

    public static void main(String[] args) { //Main method begins
        Scanner scanner = new Scanner(System.in); //Scanner to read user's input  
        char tryAgain;  // Variable to store user's choice to continue program or not

        do { //Do-while loop created to continue program as long as user enters "Y"
            
            System.out.print("Class size: ");// Ask user for the number of students
            int classSize = scanner.nextInt();  // Read the class size

            // Create an array to hold the grades
            int[] grades = new int[classSize]; 

            // Ask user for the grades
            System.out.print("Entered grades: ");
            for (int i = 0; i < classSize; i++) {
                grades[i] = scanner.nextInt();  // Read each grade and store in the array
            }

            // Compute average 
            double average = computeAverage(grades, classSize);  

            // Display the class average to two decimal places
            System.out.printf("Class average: %.2f\n", average);   

            // Ask the user if they want to run the program again
            System.out.print("Do you want to try again? (Y/N): ");
            tryAgain = scanner.next().charAt(0);  // Read the user's choice

        } while (Character.toUpperCase(tryAgain) == 'Y');  // Continue if the user enters 'Y'
    }

      public static double computeAverage(int[] grades, int n) {
        return computeSum(grades, n) / (double) n;  // Compute the sum of grades and divide by the number of grades
    }

      private static int computeSum(int[] grades, int n) {
        // Base case: If no more grades to add, return 0
        if (n == 0) {
            return 0;
        } else {
            // Recursive case: Add the last grade to the sum and call computeSum with one less grade
            return grades[n - 1] + computeSum(grades, n - 1);
        }
    }
}
