//Name: Taylor Bolinger
//Class: CS 5040/Section W01
//Term: Summer 2024
//Instructor: Umama Tasnim

import java.util.*; public class bucketSortingTaylorBolinger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        while (true) { // Infinite loop to keep the program running until user chooses to exit the program
            System.out.println("----MAIN MENU----");
            System.out.println("1. Enter numbers separated by spaces");
            System.out.println("2. Exit program");
            System.out.print("Enter option number: ");
            String option = scanner.nextLine(); // Read the user's choice

            if (option.equals("2")) { // Check to see if the user wants to exit
                break; // Exit the loop if the user chooses option 2
            }

            if (option.equals("1")) { // Check to see if the user wants to enter numbers
                System.out.println("Enter numbers separated by spaces:");
                String input = scanner.nextLine(); // Read the user's input

                String[] inputArray = input.split(" "); // Split the input string into an array of strings
                List<Integer> numbers = new ArrayList<>(); // Create a list to store the integers

                for (String s : inputArray) { // Go over each string in the input array
                    try {
                        numbers.add(Integer.parseInt(s)); // Convert the string to an integer and add to the list
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter numbers only.");                     }
                }

                int[] arr = numbers.stream().mapToInt(i -> i).toArray(); // Convert the list of integers to an array

                // Print the original unsorted array
                System.out.print("Unsorted Array: ");
                printArray(arr);

                // Sort the array using bucket sort
                bucketSort(arr);

                // Print the sorted array
                System.out.print("Sorted Array: ");
                printArray(arr);
            } else {
                System.out.println("Invalid option. Please enter 1 or 2."); 
            }
        }

        scanner.close(); 
    }

    // Method for bucket sort on the array
    public static void bucketSort(int[] arr) {
        // Find the maximum value in the array to determine the number of buckets
        int maxValue = findMaxValue(arr);

        // Create an array of ArrayLists to store the sorted elements
        ArrayList<Integer>[] buckets = new ArrayList[arr.length];

        // Initialize each bucket
        for (int i = 0; i < arr.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        // Distribute the numbers in the array into buckets based on their value
        for (int i = 0; i < arr.length; i++) {
            int bucketIndex = (arr[i] * arr.length) / (maxValue + 1);
            buckets[bucketIndex].add(arr[i]);
        }

        // Sort each bucket and merge the sorted elements back into the original array
        int index = 0;
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }

    // Method to find the maximum value in the array
    public static int findMaxValue(int[] arr) {
        int maxValue = arr[0]; // Initialize the maximum value with the first element
        for (int i = 1; i < arr.length; i++) { // Go over the array starting from the second element
            if (arr[i] > maxValue) { // Update the maximum value if the current element is larger
                maxValue = arr[i];
            }
        }
        return maxValue; // Return the maximum value found
    }

    // Method to print the elements of the array
    public static void printArray(int[] arr) {
        System.out.print("["); // Opening bracket for the beginning of the array
        for (int i = 0; i < arr.length; i++) { // Go over the array elements
            System.out.print(arr[i]); // Print the current element
            if (i < arr.length - 1) { // Check if the current element is not the last one
                System.out.print(", "); // Print a comma and a space if it is not the last element
            }
        }
        System.out.println("]"); // Closing bracket for the end of the array
    }
}
