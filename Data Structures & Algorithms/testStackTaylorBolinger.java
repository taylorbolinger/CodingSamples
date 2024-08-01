//Name: Taylor Bolinger
//Class: CS 5040/Section W01
//Term: Summer 2024
//Instructor: Umama Tasnim

import java.util.*;

public class testStackTaylorBolinger {

    public static void topToBottom(Stack<Integer> stack) {
        // Create a temporary stack to hold the elements (copy of the original stack)
        Stack<Integer> tempStack = new Stack<>();
        tempStack.addAll(stack); // Copy all elements from original stack to tempStack
        System.out.print("Function output: ");
        // Print elements from tempStack (top to bottom) without changing the original stack
        while (!tempStack.isEmpty()) {
            System.out.print(tempStack.pop() + " ");
        }
        System.out.println();
    }

    // Function to display stack content from bottom to top
    public static void bottomToTop(Stack<Double> stack) {
        // Create a temporary stack to hold the elements (copy of the original stack)
        Stack<Double> tempStack = new Stack<>();
        tempStack.addAll(stack); // Copy all elements from original stack to tempStack
        Collections.reverse(tempStack); // Reverse the order of elements in tempStack
        System.out.print("Function output: ");
        // Print elements from tempStack (bottom to top) without changing the original stack
        for (Double value : tempStack) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Function to flip the stack content
    public static Stack<String> flipStack(Stack<String> stack) {
        // Create a new stack to store the flipped elements
        Stack<String> flippedStack = new Stack<>();
        // Transfer all elements from original stack to flippedStack in reverse order
        while (!stack.isEmpty()) {
            flippedStack.push(stack.pop());
        }
        return flippedStack; // Return the flipped stack
    }

    // Function to search for a value in the stack
    public static boolean searchStack(Stack<Integer> stack, int target) {
        // Check if the target value exists in the stack
        return stack.contains(target);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int option; // Variable to store user's menu selection

        do {
            // Display the main menu options
            System.out.println();
            System.out.println("----MAIN MENU----");
            System.out.println("1. Test function topToButtom with integer stack");
            System.out.println("2. Test function bottomToTop with double stack");
            System.out.println("3. Test function flipStack with string stack");
            System.out.println("4. Test function searchStack with integer stack");
            System.out.println("5. Exit program");
            System.out.print("Enter option number: ");
            option = scanner.nextInt(); // Read user's menu selection

            switch (option) {
                case 1:
                    System.out.println("Testing function topToButtom:");
                    Stack<Integer> intStack = new Stack<>();
                    // Prompt user to enter integers for the stack
                    System.out.print("Enter integers for the stack (type 'done' to finish): ");
                    while (scanner.hasNextInt()) {
                        intStack.push(scanner.nextInt()); // Push integers to intStack
                    }
                    scanner.next(); // Consume the non-integer input
                    System.out.print("Stack content: ");
                    System.out.println(intStack); // Print original stack content
                    topToBottom(intStack); // Call function to print stack top to bottom
                    break;

                case 2:
                    System.out.println("Testing function bottomToTop:");
                    Stack<Double> doubleStack = new Stack<>();
                    // Prompt user to enter doubles for the stack
                    System.out.print("Enter doubles for the stack (type 'done' to finish): ");
                    while (scanner.hasNextDouble()) {
                        doubleStack.push(scanner.nextDouble()); // Push doubles to doubleStack
                    }
                    scanner.next(); // Consume the non-double input
                    System.out.print("Stack content: ");
                    System.out.println(doubleStack); // Print original stack content
                    bottomToTop(doubleStack); // Call function to print stack bottom to top
                    break;

                case 3:
                    System.out.println("Testing function flipStack:");
                    Stack<String> stringStack = new Stack<>();
                    // Prompt user to enter strings for the stack
                    System.out.print("Enter strings for the stack (type 'done' to finish): ");
                    while (scanner.hasNext() && !scanner.hasNext("done")) {
                        stringStack.push(scanner.next()); // Push strings to stringStack
                    }
                    scanner.next(); 
                    System.out.print("Stack content: ");
                    System.out.println(stringStack); // Print original stack content
                    stringStack = flipStack(stringStack); // Call function to flip stack
                    System.out.print("Flipped stack content: ");
                    System.out.println(stringStack); // Print flipped stack content
                    break;

                case 4:
                    System.out.println("Testing function searchStack:");
                    Stack<Integer> searchStack = new Stack<>();
                    // Prompt user to enter integers for the stack
                    System.out.print("Enter integers for the stack (type 'done' to finish): ");
                    while (scanner.hasNextInt()) {
                        searchStack.push(scanner.nextInt()); // Push integers to searchStack
                    }
                    scanner.next(); 
                    System.out.print("Enter target value: ");
                    int target = scanner.nextInt(); // Read target value from user
                    System.out.print("Stack content: ");
                    System.out.println(searchStack); // Print original stack content
                    boolean found = searchStack(searchStack, target); // Call function to search stack
                    System.out.println("Function output: " + found); // Print search result
                    break;

                case 5:
                    System.out.println("Program exited.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 5); // Repeat menu display until user chooses to exit

        scanner.close(); // Close the scanner object
    }
}
