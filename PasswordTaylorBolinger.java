// Class:	CS500
// Term:	Spring 2024
// Name:	Taylor Bolinger
// Program Number: Assignment 3 Programming 1
// IDE:		IntelliJ
import java.util.Scanner;
public class PasswordTaylorBolinger {
    public static void main(String[] args) { //Main method begins.
        Scanner scanner = new Scanner(System.in);
        boolean retryPassword = true; //Initialize boolean.

        while (retryPassword) {
            //Prompt user to enter a password.
            System.out.print("Enter a password: ");
            //User's input will be stored as a string.
            String password = scanner.nextLine();
            //Display user's entered password.
            System.out.println("Entered password: " + password);
            //Display if password is valid or invalid.
            if (validPassword(password)) {
                System.out.println("Judgment: Valid Password");
            } else {
                System.out.println("Judgment: Invalid Password");
            }

            //Ask user if they would like to retry.
            System.out.print("Retry? (Y/N): ");
            String retryInput = scanner.nextLine();
            //If user does not enter "Y" to retry, the program will end.
            if (!retryInput.equals("Y")) {
                retryPassword = false;
            }
        }
    }
    //Program will check password validity rules.
    public static boolean validPassword(String password) {
        //Check to make sure password is at least 9 characters long.
        if (password.length() < 9) {
            return false;
        }
        int digitCount = 0;
        int length = password.length();
        //Check each entered character to make sure it is either a letter or a digit.
        for (int i = 0; i < length; i++) {
            char character = password.charAt(i);

            if (!Character.isLetterOrDigit(character)) {
                return false;
            }
            //If character is a digit add it to digit count.
            if (Character.isDigit(character)) {
                digitCount++;
            }
        }
        //Password digit count must be greater than or equal to 3.
        return digitCount >= 3;
    }
}