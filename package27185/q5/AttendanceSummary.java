package package27185.q5;

import java.time.LocalDate;
import java.util.Scanner;

public class AttendanceSummary extends LeaveRequest {
    private String reportDate;
    private int totalPresent;
    private int totalAbsent;

    public AttendanceSummary(int id, String institutionName, String code, String address,
                             String departmentName, String departmentHead,
                             String courseName, String courseCode, int credits,
                             String instructorName, String email, String phone,
                             String studentName, String studentID, int age,
                             LocalDate sessionDate, String topic,
                             String status,
                             LocalDate requestDate, String reason, boolean approved,
                             String reportDate, int totalPresent, int totalAbsent) {
        super(id, institutionName, code, address, departmentName, departmentHead,
                courseName, courseCode, credits, instructorName, email, phone,
                studentName, studentID, age, sessionDate, topic, status,
                requestDate, reason, approved);
        this.reportDate = reportDate;
        this.totalPresent = totalPresent >= 0 ? totalPresent : 0;
        this.totalAbsent = totalAbsent >= 0 ? totalAbsent : 0;
    }

    public double generateSummary() {
        int total = totalPresent + totalAbsent;
        return total == 0 ? 0 : (double) totalPresent / total * 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter report date: ");
        String rd = sc.nextLine();
        AttendanceSummary as = new AttendanceSummary(1, "UR", "UR2025", "Butare",
                "CS", "Mr. A",
                "OOP", "CS205", 3,
                "Dr. X", "x@ur.ac.rw", "0788888888",
                "Alice", "21848", 20,
                LocalDate.now(), "Inheritance",
                "Present",
                LocalDate.now(), "Sick", true,
                rd, 18, 2);
        System.out.println("28048 – Attendance %: " + as.generateSummary());
    }
}