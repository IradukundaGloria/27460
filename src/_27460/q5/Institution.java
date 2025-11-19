package _27460.q5;

public class Institution extends Entity {
    private String institutionName;
    private String code;
    private String address;

    public Institution(int id, String createdDate, String updatedDate,
                       String institutionName, String code, String address) {
        super(id, createdDate, updatedDate);

        if(code.length() < 3) throw new IllegalArgumentException("Code must be ≥ 3 characters");

        this.institutionName = institutionName;
        this.code = code;
        this.address = address;
    }

    public void display() {
        super.display();
        System.out.println("Institution: " + institutionName);
        System.out.println("Code: " + code);
        System.out.println("Address: " + address);
    }
}
