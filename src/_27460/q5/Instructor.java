package _27460.q5;

public class Instructor extends Course {
    private String instructorName;
    private String email;
    private String phone;

    public Instructor(int id, String createdDate, String updatedDate,
                      String institutionName, String code, String address,
                      String deptName, String deptHead,
                      String courseName, String courseCode, int credits,
                      String instructorName, String email, String phone) {

        super(id, createdDate, updatedDate, institutionName, code, address,
                deptName, deptHead, courseName, courseCode, credits);

        if(!email.contains("@")) throw new IllegalArgumentException("Invalid email");
        if(phone.length() != 10) throw new IllegalArgumentException("Phone must be 10 digits");

        this.instructorName = instructorName;
        this.email = email;
        this.phone = phone;
    }

    public void display() {
        super.display();
        System.out.println("Instructor: " + instructorName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}
