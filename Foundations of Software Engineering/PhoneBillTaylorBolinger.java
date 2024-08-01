// Class:	CS500
// Term:	Spring 2024
// Name:	Taylor Bolinger
// Program Number: Assignment 2 Programming 1
// IDE:		IntelliJ

import java.util.Scanner;
public class PhoneBillTaylorBolinger {
    public static void main(String[] args) { //Main method begins
    Scanner input = new Scanner(System.in);
            //Prompt use to enter number of daytime minutes and nighttime minutes used.
            System.out.print("Please enter the minutes of service usage. ");

    //User will input daytime minutes and nighttime minutes separately.
    System.out.print("\nDaytime minutes: ");
    double daytimeMinutes = input.nextDouble();
    System.out.print("Nighttime minutes: ");
    double nighttimeMinutes = input.nextDouble();

        //Final variables that will not change.
        final double basicFee = 25.0;
        final double freeDaytimeMinutes = 25.0;
        final double freeNighttimeMinutes = 45.0;
        final double daytimeRate = .1;
        final double nighttimeRate = .05;

        //Display basic fee.
        System.out.print("Basic Fee: \t\t$" + basicFee);
        //Calculate and display daytime fee.
        double daytimeFee = (daytimeMinutes - freeDaytimeMinutes) * daytimeRate;
        System.out.print("\nDaytime Fee: \t$" + daytimeFee);
        //Calculate and display nighttime fee.
        double nighttimeFee = (nighttimeMinutes - freeNighttimeMinutes) * nighttimeRate;
        System.out.print("\nNighttime Fee: \t$" + nighttimeFee);
        //Calculate and display total amount.
        double totalAmount = basicFee + daytimeFee + nighttimeFee;
        System.out.print("\nTotal amount: \t$" + totalAmount);
    }}
