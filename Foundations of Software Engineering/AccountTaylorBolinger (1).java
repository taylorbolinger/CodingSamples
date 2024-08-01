// Class:	CS500
// Term:	Spring 2024
// Name:	Taylor Bolinger
// Program Number: Assignment 5 Programming 1
// IDE:		IntelliJ
import java.util.Date;

public class AccountTaylorBolinger {
    // Create private class variables id, balance, annualInterestRate, and dateCreated
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    // Initialize variables with default values of 0
    public AccountTaylorBolinger() {
        this.id = 0;
        this.balance = 0.0;
        this.annualInterestRate = 0.0;
        this.dateCreated = new Date();
    }
    // Set initial values for object variables
    public AccountTaylorBolinger(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0.0;
        this.dateCreated = new Date();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    // Method to calculate and return monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }
    // Method to calculate and return monthly interest
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    // Method to withdraw specified amount from balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
    // Method to deposit specified amount to balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public String toString() {
        return "Account ID:\t\t" + id +
                "\nAccount Balance:\t$" + balance +
                "\nInterest Rate:\t\t" + (annualInterestRate * 100) + "%" +
                "\nDate Opened:\t\t" + dateCreated;
    }
    public static void main(String[] args) {
        AccountTaylorBolinger account = new AccountTaylorBolinger(123456, 10000.0);
        account.withdraw(500.0);
        System.out.println(account);
        account.deposit(700.0);
        System.out.println(account);
    }
}
