// Class:	CS500
// Term:	Spring 2024
// Name:	Taylor Bolinger
// Program Number: Assignment 1 Programming 1
// IDE:		Eclipse
import java.util.Scanner; // import scanner class

public class DrivingCostTaylorBolinger {
    public static void main(String args[]) //program main method starts
    {
        Scanner input = new Scanner(System.in);
        // prompt the user to enter the distance to drive, the fuel efficiency
        // of the car in miles, and the price per gallon
        System.out.print ("Enter the distance to drive in:\t");
        double distance  = input.nextDouble();
        System.out.print ("Enter miles per gallon:\t\t\t");
        double milesPerGallon = input.nextDouble();
        System.out.print ("Enter price per gallon:\t\t\t$");
        double pricePerGallon = input.nextDouble();

        // compute the drive cost
        double drivingCost = (distance / milesPerGallon) * pricePerGallon;

        // display results
        System.out.print ("The driving cost is:\t\t\t$" + drivingCost);
    }
}
