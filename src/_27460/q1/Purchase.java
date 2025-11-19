package _27460.q1;

public class Purchase {
    private String purchaseDate;
    private int purchasedQuantity;
    private String supplierName;

    public Purchase(String purchaseDate, int purchasedQuantity, String supplierName) {
        if (purchasedQuantity <= 0) throw new IllegalArgumentException("Quantity > 0");
        if (purchaseDate == null) throw new IllegalArgumentException("Date cannot be null");

        this.purchaseDate = purchaseDate;
        this.purchasedQuantity = purchasedQuantity;
        this.supplierName = supplierName;
    }

    public void display() {
        System.out.println("Purchased " + purchasedQuantity + " on " + purchaseDate + " from " + supplierName);
    }
}
