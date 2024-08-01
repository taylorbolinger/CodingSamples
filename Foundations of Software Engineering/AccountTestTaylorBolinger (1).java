// Class:	CS500
// Term:	Spring 2024
// Name:	Taylor Bolinger
// Program Number: Assignment 5 Programming 1
// IDE:		IntelliJ
import java.util.Scanner;

public class AccountTestTaylorBolinger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create first account object
        System.out.println("Enter account ID for myAccount:");
        int id1 = scanner.nextInt();
        System.out.println("Enter initial balance for myAccount:");
        double balance1 = scanner.nextDouble();
        AccountTaylorBolinger myAccount = new AccountTaylorBolinger(id1, balance1);

        // Testing myAccount
        System.out.println("\nTesting myAccount:");
        System.out.println("Initial balance for myAccount: $" + myAccount.getBalance());
        myAccount.withdraw(3500);
        System.out.println("Balance after withdrawal for myAccount: $" + myAccount.getBalance());
        myAccount.deposit(500);
        System.out.println("Balance after deposit for myAccount: $" + myAccount.getBalance());
        System.out.println("Monthly interest earned for myAccount: $" + myAccount.getMonthlyInterest());
        System.out.println("Date the account was created for myAccount: " + myAccount.getDateCreated());

        // Create second account object
        System.out.println("\nEnter account ID for myAccount2:");
        int id2 = scanner.nextInt();
        System.out.println("Enter initial balance for myAccount2:");
        double balance2 = scanner.nextDouble();
        System.out.println("Enter annual interest rate for myAccount2:");
        double annualInterestRate2 = scanner.nextDouble();
        AccountTaylorBolinger myAccount2 = new AccountTaylorBolinger(id2, balance2);
        myAccount2.setAnnualInterestRate(annualInterestRate2 / 100);

        // Testing myAccount2
        System.out.println("\nTesting myAccount2:");
        System.out.println("Initial balance for myAccount2: $" + myAccount2.getBalance());
        System.out.println("Monthly interest earned for myAccount2: $" + myAccount2.getMonthlyInterest());
        System.out.println("Date the account was created for myAccount2: " + myAccount2.getDateCreated());
    }
}
