// Class:	CS500
// Term:	Spring 2024
// Name:	Taylor Bolinger
// Program Number: Assignment 1 Programming 1
// IDE:		Eclipse
import java.util.Scanner; // import scanner class

public class HelloTaylorBolinger 
{
	public static void main(String args[]) //program main method starts
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter your name: "); //print the instruction
		String name = s.nextLine(); //read user input (one line as a string)
		System.out.println("Hello " + name + "!"); //print out your message
	}

}
