package _27460.q1;

public class Category {
    private String categoryName;
    private String categoryCode;

    public Category(String categoryName, String categoryCode) {
        if (categoryCode.length() < 3)
            throw new IllegalArgumentException("Category code must be >= 3 chars");
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() { return categoryName; }
    public String getCategoryCode() { return categoryCode; }

    public void display() {
        System.out.println("Category: " + categoryName + " (" + categoryCode + ")");
    }
}
