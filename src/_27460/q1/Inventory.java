package _27460.q1;

public class Inventory extends Sale {
    private int totalItems;
    private double stockValue;

    public Inventory(String saleDate, int soldQuantity, String customerName,
                     int totalItems, double stockValue) {
        super(saleDate, soldQuantity, customerName);
        this.totalItems = totalItems;
        this.stockValue = stockValue;
    }

    public int getTotalItems() { return totalItems; }
    public double getStockValue() { return stockValue; }

    public void display() {
        super.display();
        System.out.println("Total Items: " + totalItems + ", Stock Value: " + stockValue);
    }
}
