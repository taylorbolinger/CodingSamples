// Class:	CS500
// Term:	Spring 2024
// Name:	Taylor Bolinger
// Program Number: Assignment 2 Programming 1
// IDE:		IntelliJ
import java.util.Scanner;
public class RandomNumbersTaylorBolinger {
    public static void main(String[] args) { //Main method begins.
        Scanner input = new Scanner(System.in);
        //Generate and display random integer between 5 and 13 (inclusive).
        int randomInteger5to13 = (5 + (int)(Math.random() * 9));
        System.out.print("a) A random integer between 5 and 13 (inclusive): \t"
                        + randomInteger5to13);
        //Generate and display random integer between -11 and 2 (inclusive).
        int randomIntegerNegative11to2 = (-11 + (int)(Math.random() * 14));
        System.out.print("\nb) A random integer between -11 and 2 " +
                        "(inclusive): \t" + randomIntegerNegative11to2);
        //Generate and display random integer between -5 and -1 (inclusive).
        int randomIntegerbetweenNegative5andNegative1 = (-5 + (int)(Math.random() * 5));
        System.out.print("\nc) A random integer between -5 and -1 (inclusive): \t"
                + randomIntegerbetweenNegative5andNegative1);
        //Generate and display random floating-point number between 0.0 and 5.0 (exclusive).
        float randomFloatBetween0and5 = ((float)(Math.random() * 5.0));
        System.out.print("\nd) A random float between 0.0 and 5.0 (exclusive): \t" + randomFloatBetween0and5);
    }}
