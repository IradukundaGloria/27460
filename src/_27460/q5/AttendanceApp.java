package _27460.q5;

import java.util.Scanner;

public class AttendanceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total present: ");
        int present = sc.nextInt();

        System.out.println("Enter total absent: ");
        int absent = sc.nextInt();

        AttendanceSummary summary = new AttendanceSummary(
                1, "2025-11-20", "2025-11-20",
                "AUCA", "AUC", "Kigali",
                "IT", "Mr John",
                "OOP", "OOP101", 3,
                "Gloria", "gloria@gmail.com", "0780000000",
                "Iradukunda Gloria", "ST27460", 20,
                "2025-11-20", "Inheritance",
                "Present", "2025-11-19", "Sick", false,
                "2025-11-20", present, absent
        );

        summary.generateSummary();

        System.out.println("Attendance Summary Completed. Student ID: " + 27460);
    }
}
