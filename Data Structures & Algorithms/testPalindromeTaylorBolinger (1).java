//Name: Taylor Bolinger
//Class: CS 5040/Section W01
//Term: Summer 2024
//Instructor: Umama Tasnim

import java.util.*;

public class testPalindromeTaylorBolinger {

    // Function to test character-by-character palindrome
    public static boolean isCharacterPalindrome(String input) {
        // Remove all non-alphabetic characters and convert them to lowercase
        String cleanInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Create a stack and a queue to store characters
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Push characters to stack and queue
        for (int i = 0; i < cleanInput.length(); i++) {
            char c = cleanInput.charAt(i);
            stack.push(c);
            queue.add(c);
        }

        // Compare characters from stack and queue
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                return false; // Not a palindrome if characters don't match
            }
        }
        return true; // Is a palindrome if all characters match
    }

    // Function to test word-by-word palindrome
    public static boolean isWordPalindrome(String input) {
        // Remove non-alphanumeric characters (except spaces) and convert to lowercase
        String cleanInput = input.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();

        // Split input into words
        String[] words = cleanInput.split("\\s+");

        // Create a stack and a queue to store words
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        // Push words to stack and queue
        for (String word : words) {
            stack.push(word);
            queue.add(word);
        }

        // Compare words from stack and queue
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                return false; // Not a palindrome if words don't match
            }
        }
        return true; // Is a palindrome if all words match
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option; // Variable to store user's menu selection

        do {
            // Display the main menu options
            System.out.println();
            System.out.println("----MAIN MENU----");
            System.out.println("1. Test character-by-character palindrome");
            System.out.println("2. Test word-by-word palindrome");
            System.out.println("3. Exit program");
            System.out.print("Enter option number: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.next();
            }
            option = scanner.nextInt(); // Read user's menu selection
            scanner.nextLine(); // Consume the newline

            switch (option) {
                case 1:
                    System.out.println("You selected: Option 1");
                    System.out.print("Enter a string: ");
                    String charInput = scanner.nextLine();
                    System.out.println("You entered: " + charInput);
                    boolean charPalindrome = isCharacterPalindrome(charInput);
                    System.out.println("Judgment: " + (charPalindrome ? "Palindrome" : "Not Palindrome"));
                    break;

                case 2:
                    System.out.println("You selected: Option 2");
                    System.out.print("Enter a string: ");
                    String wordInput = scanner.nextLine();
                    System.out.println("You entered: " + wordInput);
                    boolean wordPalindrome = isWordPalindrome(wordInput);
                    System.out.println("Judgment: " + (wordPalindrome ? "Palindrome" : "Not Palindrome"));
                    break;

                case 3:
                    System.out.println("Program exited.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

            // Display blank lines before and after the menu after each option is used
            System.out.println("\n\n");

        } while (option != 3); // Repeat menu display until user chooses to exit

        scanner.close();
    }
}
