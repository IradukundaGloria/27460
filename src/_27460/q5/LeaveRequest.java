package _27460.q5;

public class LeaveRequest extends AttendanceRecord {
    private String requestDate;
    private String reason;
    private boolean approved;

    public LeaveRequest(int id, String createdDate, String updatedDate,
                        String institutionName, String code, String address,
                        String deptName, String deptHead,
                        String courseName, String courseCode, int credits,
                        String instructorName, String email, String phone,
                        String studentName, String studentID, int age,
                        String sessionDate, String topic,
                        String status,
                        String requestDate, String reason, boolean approved) {

        super(id, createdDate, updatedDate, institutionName, code, address,
                deptName, deptHead, courseName, courseCode, credits,
                instructorName, email, phone,
                studentName, studentID, age,
                sessionDate, topic,
                status);

        if(reason.isEmpty()) throw new IllegalArgumentException("Reason cannot be empty");

        this.requestDate = requestDate;
        this.reason = reason;
        this.approved = approved;
    }

    public void display() {
        super.display();
        System.out.println("Leave Request Date: " + requestDate);
        System.out.println("Reason: " + reason);
        System.out.println("Approved: " + approved);
    }
}
