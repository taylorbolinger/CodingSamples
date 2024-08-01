//Name: Taylor Bolinger
//Class: CS 5040/Section W01
//Term: Summer 2024
//Instructor: Umama Tasnim

import java.util.*;

public class hashFunctionsTaylorBolinger {
    // Define the size of the hash table
    private static final int TABLE_SIZE = 50;
    // Set up the hash table with dimensions for keys and probes
    private static int[][] Table = new int[TABLE_SIZE][2];
    
    // Main method
    public static void main(String[] args) {
        // Array of keys to be hashed
        int[] keys = {
            1234, 8234, 7867, 1009, 5438, 4312, 3420, 9487, 5418, 5299,
            5078, 8239, 1208, 5098, 5195, 5329, 4543, 3344, 7698, 5412,
            5567, 5672, 7934, 1254, 6091, 8732, 3095, 1975, 3843, 5589,
            5439, 8907, 4097, 3096, 4310, 5298, 9156, 3895, 6673, 7871,
            5787, 9289, 4553, 7822, 8755, 3398, 6774, 8289, 7665, 5523
        };

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        // Boolean variable to control program exit
        boolean exit = false;

        while (!exit) {
            System.out.println("\n----MAIN MENU----");
            System.out.println("1 – Run HF1 (Division method with Linear Probing)");
            System.out.println("2 – Run HF2 (Division method with Quadratic Probing)");
            System.out.println("3 – Run HF3 (Division method with Double Hashing)");
            System.out.println("4 – Run HF4 (Student Designed HF)");
            System.out.println("5 – Exit Program");
            System.out.print("Enter option number: ");

            int option = scanner.nextInt();  // Read user input for menu option

            switch (option) {
                case 1:
                    System.out.println("Hash table resulted from HF1:");
                    HF1(keys);  // Call HF1 with keys array
                    break;
                case 2:
                    System.out.println("Hash table resulted from HF2:");
                    HF2(keys);  // Call HF2 with keys array
                    break;
                case 3:
                    System.out.println("Hash table resulted from HF3:");
                    HF3(keys);  // Call HF3 with keys array
                    break;
                case 4:
                    System.out.println("Hash table resulted from HF4:");
                    HF4(keys);  // Call HF4 with keys array
                    break;
                case 5:
                    exit = true;  // Exit the loop and end the program
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }

        System.out.println("Program exited.");
        scanner.close();  
    }
    // Calculate and return the sum of all probe values in the hash table
    private static int sumProbes() {
        int sum = 0;
        for (int i = 0; i < TABLE_SIZE; i++) {
            sum += Table[i][1];
        }
        return sum;
    }

    // HF1: Division method with linear probing
    private static void HF1(int[] keys) {
        initializeTable();  
        int probes = 0;
        // Iterate through each key in the keys array to hash and store it in the hash table
        for (int key : keys) {
            int index = key % TABLE_SIZE;
            while (Table[index][0] != -1) {
                index = (index + 1) % TABLE_SIZE;  // Linear probing
                probes++;
            }
            Table[index][0] = key;
            Table[index][1] = probes;
            probes = 0;
        }

        displayTable();  // Display hash table and probe info
    }

      // HF2: Division method with quadratic probing
      private static void HF2(int[] keys) {
        initializeTable();  // Initialize Table array
        int probes = 0;

        for (int key : keys) {
            int index = key % TABLE_SIZE;
            int i = 1;
            while (Table[index][0] != -1) {
                index = (index + i * i) % TABLE_SIZE;  // Quadratic probing
                i++;
                probes++;
                if (i > TABLE_SIZE) {
                    System.out.println("Unable to hash key " + key + " to the table.");
                    break;
                }
            }
            Table[index][0] = key;
            Table[index][1] = probes;
            probes = 0;
        }

        displayTable();  // Display hash table and probe information
    }

    // HF3: Division method with double hashing
    private static void HF3(int[] keys) {
        initializeTable();  // Initialize Table array
        int probes = 0;

        for (int key : keys) {
            int index = key % TABLE_SIZE;
            int H2 = 30 - (key % 25);  // Second hashing function
            int i = 1;
            while (Table[index][0] != -1 && i <= TABLE_SIZE) {
                index = (index + i * H2) % TABLE_SIZE;  // Double hashing
                i++;
                probes++;
            }
            if (i > TABLE_SIZE) {
                System.out.println("Unable to hash key " + key + " to the table.");
            } else {
                Table[index][0] = key;
                Table[index][1] = probes;
            }
            probes = 0;
        }

        displayTable();  // Display hash table and probe information
    }

    // HF4: Student Designed HF
    // Uses (key * key) % TABLE_SIZE for hashing and 2 steps for probing
    // Minimizes collisions by spreading keys more evenly
    // Uses 2 steps in probing to prevent clustering, potentially reducing the total number of probes compared to HF1, HF2, & HF3

    private static void HF4(int[] keys) {
        initializeTable();  // Initialize Table array
        int probes = 0;

        for (int key : keys) {
            int index = (key * key) % TABLE_SIZE;  // Use (key * key) % TABLE_SIZE for hashing
            int i = 1;
            while (Table[index][0] != -1 && i <= TABLE_SIZE) {
                index = (index + i * 2) % TABLE_SIZE;  // Use 2 steps for probing
                i++;
                probes++;
            }
            if (i > TABLE_SIZE) {
                System.out.println("Unable to hash key " + key + " to the table.");
            } else {
                Table[index][0] = key;
                Table[index][1] = probes;
            }
            probes = 0;
        }

        displayTable();  // Display hash table and probe information
    }

    private static void initializeTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            Arrays.fill(Table[i], -1);  // Initialize each element of Table with -1
        }
    }
    // Display the hash table contents and the total number of probes
    private static void displayTable() {
        System.out.println("Index\tKey\tprobes");
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.println(i + "\t" + Table[i][0] + "\t" + Table[i][1]);
        }
        System.out.println("Sum of probe values = " + sumProbes() + " probes.");
    }
}
