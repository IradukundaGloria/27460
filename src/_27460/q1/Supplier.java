package _27460.q1;

public class Supplier {
    private String supplierName;
    private String supplierEmail;
    private String supplierPhone;

    public Supplier(String supplierName, String supplierEmail, String supplierPhone) {
        if (!supplierEmail.contains("@")) throw new IllegalArgumentException("Invalid email");
        if (supplierPhone.length() != 10) throw new IllegalArgumentException("Phone must be 10 digits");

        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.supplierPhone = supplierPhone;
    }

    public void display() {
        System.out.println("Supplier: " + supplierName + ", Email: " + supplierEmail + ", Phone: " + supplierPhone);
    }
}
