// Class:	CS500
// Term:	Spring 2024
// Name:	Taylor Bolinger
// Program Number: Assignment 3 Programming 1
// IDE:		IntelliJ
import java.util.Scanner;
public class PatternTaylorBolinger {
    public static void main(String[] args) { //Main method begins.
        Scanner scanner = new Scanner(System.in);
        //Prompt user to enter an integer.
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        // Decrease the value of user's integer by 1 on each line as long as the number is greater than or equal to 1.
        for (int i = n; i >= 1; i--) {
            // Increase the number of spaces t the beginning of each line by one as the value of i decreases.
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            //Print a space between each digit as long as the current value of i is less than or equal to 1.
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}