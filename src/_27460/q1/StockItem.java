package _27460.q1;

public class StockItem {
    private int quantityAvailable;
    private int reorderLevel;

    public StockItem(int quantityAvailable, int reorderLevel) {
        if (quantityAvailable < 0 || reorderLevel < 0)
            throw new IllegalArgumentException("Values >= 0");

        this.quantityAvailable = quantityAvailable;
        this.reorderLevel = reorderLevel;
    }

    public void display() {
        System.out.println("Quantity Available: " + quantityAvailable + ", Reorder Level: " + reorderLevel);
    }

    public int getQuantityAvailable() { return quantityAvailable; }
}
