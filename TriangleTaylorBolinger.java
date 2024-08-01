// Class:	CS500
// Term:	Spring 2024
// Name:	Taylor Bolinger
// Program Number: Assignment 3 Programming 1
// IDE:		IntelliJ
import java.util.Scanner;
public class TriangleTaylorBolinger {
    public static void main(String[] args) { //Main method begins.
        Scanner scanner = new Scanner(System.in);
        //Prompt user to enter an integer.
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        //Program will loop n amount of times.
        for (int i = 1; i <= n; i++) {
            //Decrease the number of spaces before the stars on each line by 1 to create triangle shape.
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //Calculate and display number of stars based on which line is being printed (i).
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
