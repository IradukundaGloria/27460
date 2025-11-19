package _27460.q5;

public final class AttendanceSummary extends LeaveRequest {
    private String reportDate;
    private int totalPresent;
    private int totalAbsent;

    public AttendanceSummary(int id, String createdDate, String updatedDate,
                             String institutionName, String code, String address,
                             String deptName, String deptHead,
                             String courseName, String courseCode, int credits,
                             String instructorName, String email, String phone,
                             String studentName, String studentID, int age,
                             String sessionDate, String topic,
                             String status, String requestDate, String reason, boolean approved,
                             String reportDate, int totalPresent, int totalAbsent) {

        super(id, createdDate, updatedDate, institutionName, code, address,
                deptName, deptHead, courseName, courseCode, credits,
                instructorName, email, phone,
                studentName, studentID, age,
                sessionDate, topic,
                status, requestDate, reason, approved);

        this.reportDate = reportDate;
        this.totalPresent = totalPresent;
        this.totalAbsent = totalAbsent;
    }

    public void generateSummary() {
        int totalSessions = totalPresent + totalAbsent;
        double percentage = (totalPresent * 100.0) / totalSessions;

        System.out.println("----- Attendance Summary -----");
        System.out.println("Report Date: " + reportDate);
        System.out.println("Total Present: " + totalPresent);
        System.out.println("Total Absent: " + totalAbsent);
        System.out.println("Attendance Percentage: " + percentage + "%");
        System.out.println("27460"); // required rule
    }
}
