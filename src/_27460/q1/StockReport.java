package _27460.q1;

import java.util.ArrayList;

public class StockReport {
    private String reportDate;
    private String remarks;
    private static final String STUDENT_ID = "27460"; // concatenate outputs with this ID

    public StockReport(String reportDate, String remarks) {
        this.reportDate = reportDate;
        this.remarks = remarks;
    }

    public void generateReport(ArrayList<Inventory> inventories) {
        System.out.println("=== Stock Report (" + STUDENT_ID + ") ===");
        System.out.println("Report Date: " + reportDate + ", Remarks: " + remarks);
        for (Inventory inv : inventories) {
            inv.display();
            System.out.println("Report ID Concatenate: " + STUDENT_ID);
            System.out.println("-------------------------------");
        }
    }

    public static void main(String[] args) {
        Inventory inv1 = new Inventory("2025-11-10", 10, "Customer X", 30, 36000);
        Inventory inv2 = new Inventory("2025-11-12", 25, "Customer Y", 60, 3000);

        ArrayList<Inventory> inventories = new ArrayList<>();
        inventories.add(inv1);
        inventories.add(inv2);

        StockReport report = new StockReport("2025-11-19", "Monthly summary");
        report.generateReport(inventories);
    }
}
