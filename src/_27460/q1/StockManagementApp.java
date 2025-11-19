package _27460.q1;

import java.util.ArrayList;
import java.util.Scanner;

public class StockManagementApp {
    private static final String STUDENT_ID = "27460";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Inventory> inventories = new ArrayList<>();

        System.out.println("=== Stock Management App (ID: " + STUDENT_ID + ") ===");
        System.out.print("Enter number of inventory items to add: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Inventory Item " + (i + 1) + " (ID: " + STUDENT_ID + ") ---");

            // Sale details
            System.out.print("Enter sale date (YYYY-MM-DD): ");
            String saleDate = sc.nextLine();
            System.out.print("Enter sold quantity: ");
            int soldQuantity = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter customer name: ");
            String customerName = sc.nextLine();

            // Inventory details
            System.out.print("Enter total items in stock: ");
            int totalItems = sc.nextInt();
            System.out.print("Enter stock value: ");
            double stockValue = sc.nextDouble();
            sc.nextLine(); // consume newline

            // Create inventory object
            Inventory inv = new Inventory(saleDate, soldQuantity, customerName, totalItems, stockValue);
            inventories.add(inv);
        }

        // Generate report
        System.out.println("\n=== Generating Stock Report (ID: " + STUDENT_ID + ") ===");
        StockReport report = new StockReport("2025-11-19", "Generated via StockManagementApp (ID: " + STUDENT_ID + ")");
        report.generateReport(inventories);

        sc.close();
    }
}
