package _27460.q1;

public class Sale {
    private String saleDate;
    private int soldQuantity;
    private String customerName;

    public Sale(String saleDate, int soldQuantity, String customerName) {
        if (soldQuantity <= 0) throw new IllegalArgumentException("Sold quantity > 0");
        if (saleDate == null) throw new IllegalArgumentException("Sale date invalid");

        this.saleDate = saleDate;
        this.soldQuantity = soldQuantity;
        this.customerName = customerName;
    }

    public void display() {
        System.out.println("Sold " + soldQuantity + " on " + saleDate + " to " + customerName);
    }
}
