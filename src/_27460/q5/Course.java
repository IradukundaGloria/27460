package _27460.q5;

public class Course extends Department {
    private String courseName;
    private String courseCode;
    private int credits;

    public Course(int id, String createdDate, String updatedDate,
                  String institutionName, String code, String address,
                  String deptName, String deptHead,
                  String courseName, String courseCode, int credits) {

        super(id, createdDate, updatedDate, institutionName, code, address, deptName, deptHead);

        if(credits <= 0) throw new IllegalArgumentException("Credits must be > 0");

        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }

    public void display() {
        super.display();
        System.out.println("Course: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Credits: " + credits);
    }
}
