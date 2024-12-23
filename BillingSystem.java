// Billing System Example
// Author: [Your Name]
// Date: [Add Date]

import java.util.Scanner;

public class BillingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables for storing billing information
        String[] itemNames = new String[5];
        double[] itemPrices = new double[5];
        int[] itemQuantities = new int[5];
        double total = 0.0;
        double discount = 0.0;

        System.out.println("Welcome to the Simple Billing System!");
        System.out.println("Please enter the details for up to 5 items:");

        // Input item details
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name of item " + (i + 1) + ": ");
            itemNames[i] = scanner.nextLine();

            System.out.print("Enter price of " + itemNames[i] + ": ");
            itemPrices[i] = scanner.nextDouble();

            System.out.print("Enter quantity of " + itemNames[i] + ": ");
            itemQuantities[i] = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Calculate total for the item and add to the overall total
            total += itemPrices[i] * itemQuantities[i];
        }

        // Apply discount if total exceeds a certain amount
        if (total > 1000) {
            discount = total * 0.1; // 10% discount
            total -= discount;
        }

        // Print the bill
        System.out.println("\n--------- BILL SUMMARY ---------");
        System.out.printf("%-20s %-10s %-10s %-10s\n", "Item Name", "Price", "Quantity", "Total");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-20s %-10.2f %-10d %-10.2f\n", 
                              itemNames[i], itemPrices[i], itemQuantities[i], 
                              itemPrices[i] * itemQuantities[i]);
        }
        System.out.println("---------------------------------");
        System.out.printf("Discount: %.2f\n", discount);
        System.out.printf("Grand Total: %.2f\n", total);
        System.out.println("---------------------------------");
        System.out.println("Thank you for shopping with us!");

        scanner.close();
    }
}
