package _27460.q5;

public class ClassSession extends Student {
    private String sessionDate;
    private String topic;

    public ClassSession(int id, String createdDate, String updatedDate,
                        String institutionName, String code, String address,
                        String deptName, String deptHead,
                        String courseName, String courseCode, int credits,
                        String instructorName, String email, String phone,
                        String studentName, String studentID, int age,
                        String sessionDate, String topic) {

        super(id, createdDate, updatedDate, institutionName, code, address,
                deptName, deptHead, courseName, courseCode, credits,
                instructorName, email, phone,
                studentName, studentID, age);

        this.sessionDate = sessionDate;
        this.topic = topic;
    }

    public void display() {
        super.display();
        System.out.println("Session Date: " + sessionDate);
        System.out.println("Topic: " + topic);
    }
}
