package _27460.q5;

public class Department extends Institution {
    private String departmentName;
    private String departmentHead;

    public Department(int id, String createdDate, String updatedDate,
                      String institutionName, String code, String address,
                      String departmentName, String departmentHead) {
        super(id, createdDate, updatedDate, institutionName, code, address);

        if(departmentName.isEmpty() || departmentHead.isEmpty())
            throw new IllegalArgumentException("Department fields cannot be empty");

        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
    }

    public void display() {
        super.display();
        System.out.println("Department: " + departmentName);
        System.out.println("Head: " + departmentHead);
    }
}
