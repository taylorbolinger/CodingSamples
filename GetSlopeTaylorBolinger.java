// Class:	CS500
// Term:	Spring 2024
// Name:	Taylor Bolinger
// Program Number: Assignment 1 Programming 1
// IDE:		Eclipse

import java.util.Scanner;
public class GetSlopeTaylorBolinger {
    public static void main(String args[]) // program main method starts
    {
        Scanner input = new Scanner(System.in);

        // prompt the user to enter coordinates (x1,y1) & (x2,y2)
        System.out.println ("Enter coordinates:\t");
        System.out.print ("x1=\t");
        double x1 = input.nextDouble();
        System.out.print ("y1=\t");
        double y1 = input.nextDouble();
        System.out.print ("x2=\t");
        double x2 = input.nextDouble();
        System.out.print ("y2=\t");
        double y2 = input.nextDouble();

        //Calculate & Output Slope
        System.out.print ((y2-y1)/(x2-x1));

    }
}
