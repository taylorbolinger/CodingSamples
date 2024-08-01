//Name: Taylor Bolinger
//Class: CS 5040/Section W01
//Term: Summer 2024
//Instructor: Umama Tasnim

import java.util.Scanner;

// Class representing a node in the binary search tree (BST)
class Node {
    int data;
    Node left;
    Node right;

    // Create and set up a node
    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

// Class representing the BST
public class binarysearchtreeTaylorBolinger {
    private Node root;

    // Set up the BST
    public binarysearchtreeTaylorBolinger() {
        root = null;
    }

    // Add elements to the BST
    public void add(int data) {
        root = addRecursive(root, data);
    }

    // Add elements recursively to the BST
    private Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }

        return current;
    }

    // Remove a node from the BST
    public void remove(int data) {
        root = removeRecursive(root, data);
    }

    // Remove a node recursively from the BST
    private Node removeRecursive(Node current, int data) {
        if (current == null) {
            return null;
        }

        if (data < current.data) {
            current.left = removeRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = removeRecursive(current.right, data);
        } else {
            // Case 1: No children (leaf node)
            if (current.left == null && current.right == null) {
                return null;
            }

            // Case 2: Only one child
            if (current.left == null) {
                return current.right;
            }
            if (current.right == null) {
                return current.left;
            }

            // Case 3: Two children
            int smallestValue = findSmallestValue(current.right);
            current.data = smallestValue;
            current.right = removeRecursive(current.right, smallestValue);
        }

        return current;
    }

    // Find the smallest value in a subtree
    private int findSmallestValue(Node root) {
        return root.left == null ? root.data : findSmallestValue(root.left);
    }

    // Print the BST (In-Order Traversal)
    public void inOrderTraversal() {
        inOrderTraversalRecursive(root);
    }

    // Print the BST recursively
    private void inOrderTraversalRecursive(Node node) {
        if (node != null) {
            inOrderTraversalRecursive(node.left);
            System.out.print(node.data + " ");
            inOrderTraversalRecursive(node.right);
        }
    }

    // Main method to show how everything works
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner for user input
        binarysearchtreeTaylorBolinger bst = new binarysearchtreeTaylorBolinger(); // Create a new binary search tree
        boolean exit = false; 

        while (!exit) { // Loop until user decides to exit the program
            System.out.println("\n----MAIN MENU----");
            System.out.println("1. Add elements to the BST"); 
            System.out.println("2. Remove a node from the BST"); 
            System.out.println("3. Display BST (In-Order Traversal)"); 
            System.out.println("4. Create a new BST"); 
            System.out.println("5. Exit"); 
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt(); // Read the user's choice

            switch (choice) {
                case 1:
                    // Add elements to the BST
                    System.out.print("Enter the number of elements to add to the BST: ");
                    int n = scanner.nextInt(); // Number of elements to add
                    System.out.println("Enter the elements (one per line then press enter):");
                    for (int i = 0; i < n; i++) { // Loop to read each element
                        int element = scanner.nextInt(); // Read element
                        bst.add(element); // Add element to the tree
                    }
                    break;
                case 2:
                    // Remove an element from the BST
                    System.out.print("Enter the element to remove from the BST: ");
                    int elementToRemove = scanner.nextInt(); // Read the element to remove
                    bst.remove(elementToRemove); // Remove the element from the tree
                    System.out.println("Element removed from the BST.");
                    break;
                case 3:
                    // Display the BST
                    System.out.println("BST (In-Order Traversal):");
                    bst.inOrderTraversal(); 
                    System.out.println(); 
                    break;
                case 4:
                    // Create a new BST
                    bst = new binarysearchtreeTaylorBolinger(); // Create a new tree
                    System.out.println("New BST created.");
                    break;
                case 5:
                    // Exit the program
                    exit = true; 
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again."); 
            }
        }

        scanner.close(); 
    }
}
