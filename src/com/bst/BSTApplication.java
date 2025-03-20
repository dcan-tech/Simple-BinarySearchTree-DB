package com.bst;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BSTApplication {
    public static void main(String[] args) {
        BinarySearchTree myTree = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("\nBinary Search Tree - Menu:");
            System.out.println("1. Insert Hardcoded Values");
            System.out.println("2. Insert Manually");
            System.out.println("3. Insert Random Values");
            System.out.println("4. Search for a Value");
            System.out.println("5. Delete a Value");
            System.out.println("6. Display Tree (In-Order Traversal)");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = getValidInt(scanner);
            switch (choice) {
                case 1:
                    myTree = new BinarySearchTree();
                    myTree.insert(50);
                    myTree.insert(30);
                    myTree.insert(70);
                    myTree.insert(20);
                    myTree.insert(40);
                    myTree.insert(60);
                    myTree.insert(80);
                    System.out.println("Hardcoded Tree: " + myTree);
                    break;

                case 2:
                    System.out.println("Enter numbers to insert (space-separated): ");
                    scanner.nextLine(); // Consume newline
                    String[] numbers = scanner.nextLine().split(" ");
                    for (String num : numbers) {
                        try {
                            int value = Integer.parseInt(num.trim());
                            if (myTree.contains(value)) {
                                System.out.println("Value " + value + " already exists. Skipping...");
                            } else {
                                myTree.insert(value);
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input: '" + num + "' is not a number. Skipping...");
                        }
                    }
                    System.out.println("Tree after manual insertions: " + myTree);
                    break;

                case 3:
                    System.out.print("How many random numbers? ");
                    int count = getValidInt(scanner);
                    for (int i = 0; i < count; i++) {
                        int value = random.nextInt(100);
                        myTree.insert(value);
                    }
                    System.out.println("Tree after random insertions: " + myTree);
                    break;

                case 4:
                    System.out.print("Enter value to search: ");
                    int searchValue = getValidInt(scanner);
                    System.out.println("Contains " + searchValue + "? " + myTree.contains(searchValue));
                    break;

                case 5:
                    System.out.print("Enter value to delete: ");
                    int deleteValue = getValidInt(scanner);
                    if (myTree.contains(deleteValue)) {
                        myTree.delete(deleteValue);
                        System.out.println("Deleted " + deleteValue);
                    } else {
                        System.out.println("Value " + deleteValue + " not found. Cannot delete.");
                    }
                    System.out.println("Tree after deletion: " + myTree);
                    break;

                case 6:
                    System.out.println("Tree (In-Order Traversal): " + myTree);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
    }

    // Only accept integer input
    private static int getValidInt(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
                scanner.next(); // Consume the invalid input
            }
        }
    }
}
