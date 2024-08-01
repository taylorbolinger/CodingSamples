//Name: Taylor Bolinger
//Class: CS 5040/Section W01
//Term: Summer 2024
//Instructor: Umama Tasnim
//Assignment: 2

import java.util.Scanner; // Import Scanner class for user input

// Define the Employee class
class Employee {
    int employeeID; // Employee ID
    String name; // Employee name
    String position; // Employee position
    double salary; // Employee salary

    // Constructor for Employee class
    public Employee(int employeeID, String name, String position, double salary) {
        this.employeeID = employeeID; // Set employee ID
        this.name = name; // Set employee name
        this.position = position; // Set employee position
        this.salary = salary; // Set employee salary
    }

    // Override toString method to display employee details
    @Override
    public String toString() {
        return "Employee ID: " + employeeID + ", Name: " + name + ", Position: " + position + ", Salary: " + salary;
    }
}

// Define the EmployeeLinkedList class
class EmployeeLinkedList {
    private Node head; // Head of the linked list

    // Inner class to represent a node in the linked list
    private class Node {
        Employee data; // Employee data
        Node next; // Reference to the next node

        // Constructor for Node class
        public Node(Employee data) {
            this.data = data; // Set employee data
            this.next = null; // Initialize next as null
        }
    }

    // Method to add a new employee to the list
    public void addEmployee(Employee emp) {
        Node newNode = new Node(emp); // Create a new node with employee data
        if (head == null) { // If the list is empty
            head = newNode; // Set the new node as the head
        } else {
            Node current = head; // Start from the head
            while (current.next != null) { // Traverse to the end of the list
                current = current.next; // Move to the next node
            }
            current.next = newNode; // Add the new node at the end
        }
    }

    // Method to delete an employee by their ID
    public void deleteEmployee(int employeeID) {
        if (head == null) { // If the list is empty
            System.out.println("The list is empty.");
            return;
        }

        if (head.data.employeeID == employeeID) { // If the head is to be deleted
            head = head.next; // Move the head to the next node
            System.out.println("Employee with ID " + employeeID + " deleted.");
            return;
        }

        Node current = head; // Start from the head
        Node prev = null; // To keep track of the previous node

        // Traverse the list to find the node to be deleted
        while (current != null && current.data.employeeID != employeeID) {
            prev = current; // Move prev to current node
            current = current.next; // Move to the next node
        }

        if (current == null) { // If the employee is not found
            System.out.println("Employee with ID " + employeeID + " not found.");
            return;
        }

        prev.next = current.next; // Delete the node
        System.out.println("Employee with ID " + employeeID + " deleted.");
    }

    // Method to display all employees in the list
    public void displayEmployees() {
        if (head == null) { // If the list is empty
            System.out.println("No employees to display.");
            return;
        }

        Node current = head; // Start from the head
        while (current != null) { // Traverse the list
            System.out.println(current.data); // Print each employee's details
            current = current.next; // Move to the next node
        }
    }

    // Method to check if an employee ID is unique
    public boolean isEmployeeIDUnique(int employeeID) {
        Node current = head; // Start from the head
        while (current != null) { // Traverse the list
            if (current.data.employeeID == employeeID) { // If the ID is found
                return false; // ID is not unique
            }
            current = current.next; // Move to the next node
        }
        return true; // ID is unique
    }
}

// Main class to run the Employee Management System
public class LinkedListsTaylorBolinger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        EmployeeLinkedList list = new EmployeeLinkedList(); // Create a linked list
        int choice; // Variable to store user's menu choice

        // Menu-driven program
        do {
            System.out.println("\nEmployee Management System Menu:");
            System.out.println("1. Add a new employee");
            System.out.println("2. Delete an employee");
            System.out.println("3. Display all employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt(); // Read user's choice
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    // Add a new employee
                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt(); // Read employee ID
                    scanner.nextLine(); // Consume newline character
                    if (!list.isEmployeeIDUnique(id)) { // Check if ID is unique
                        System.out.println("Employee ID must be unique.");
                        break;
                    }
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine(); // Read employee name
                    System.out.print("Enter employee position: ");
                    String position = scanner.nextLine(); // Read employee position
                    System.out.print("Enter employee salary: ");
                    double salary = scanner.nextDouble(); // Read employee salary
                    if (salary <= 0) { // Check if salary is positive
                        System.out.println("Salary must be a positive number.");
                        break;
                    }
                    list.addEmployee(new Employee(id, name, position, salary)); // Add employee to the list
                    System.out.println("Employee added successfully.");
                    break;
                case 2:
                    // Delete an employee
                    System.out.print("Enter employee ID to delete: ");
                    int deleteID = scanner.nextInt(); // Read employee ID to delete
                    scanner.nextLine(); // Consume newline character
                    list.deleteEmployee(deleteID); // Delete employee from the list
                    break;
                case 3:
                    // Display all employees
                    list.displayEmployees(); // Display all employees in the list
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again."); // Invalid menu choice
            }
        } while (choice != 4); // Repeat until the user chooses to exit

        scanner.close(); // Close the scanner
    }
}
