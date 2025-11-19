package _27460.q1;

public class Product {
    private String productName;
    private double unitPrice;
    private int stockLimit;

    public Product(String productName, double unitPrice, int stockLimit) {
        if (unitPrice <= 0) throw new IllegalArgumentException("Unit price > 0");
        if (stockLimit < 0) throw new IllegalArgumentException("Stock limit >= 0");

        this.productName = productName;
        this.unitPrice = unitPrice;
        this.stockLimit = stockLimit;
    }

    public void display() {
        System.out.println("Product: " + productName + ", Unit Price: " + unitPrice + ", Stock Limit: " + stockLimit);
    }
}
