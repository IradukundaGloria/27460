package _27460.q5;

public class AttendanceRecord extends ClassSession {
    private String status;

    public AttendanceRecord(int id, String createdDate, String updatedDate,
                            String institutionName, String code, String address,
                            String deptName, String deptHead,
                            String courseName, String courseCode, int credits,
                            String instructorName, String email, String phone,
                            String studentName, String studentID, int age,
                            String sessionDate, String topic,
                            String status) {

        super(id, createdDate, updatedDate, institutionName, code, address,
                deptName, deptHead, courseName, courseCode, credits,
                instructorName, email, phone,
                studentName, studentID, age,
                sessionDate, topic);

        if(!(status.equals("Present") || status.equals("Absent")))
            throw new IllegalArgumentException("Status must be Present/Absent");

        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void display() {
        super.display();
        System.out.println("Status: " + status);
    }
}
