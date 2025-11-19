package _27460.q5;

public class Student extends Instructor {
    private String studentName;
    private String studentID;
    private int age;

    public Student(int id, String createdDate, String updatedDate,
                   String institutionName, String code, String address,
                   String deptName, String deptHead,
                   String courseName, String courseCode, int credits,
                   String instructorName, String email, String phone,
                   String studentName, String studentID, int age) {

        super(id, createdDate, updatedDate, institutionName, code, address,
                deptName, deptHead, courseName, courseCode, credits,
                instructorName, email, phone);

        if(age <= 0) throw new IllegalArgumentException("Age must be > 0");

        this.studentName = studentName;
        this.studentID = studentID;
        this.age = age;
    }

    public void display() {
        super.display();
        System.out.println("Student: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Age: " + age);
    }
}
