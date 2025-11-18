package package27185.q5;

import java.time.LocalDate;

public class AttendanceRecord extends ClassSession {
    private String status;

    public AttendanceRecord(int id, String institutionName, String code, String address,
                            String departmentName, String departmentHead,
                            String courseName, String courseCode, int credits,
                            String instructorName, String email, String phone,
                            String studentName, String studentID, int age,
                            LocalDate sessionDate, String topic,
                            String status) {
        super(id, institutionName, code, address, departmentName, departmentHead,
                courseName, courseCode, credits, instructorName, email, phone,
                studentName, studentID, age, sessionDate, topic);
        this.status = status.equalsIgnoreCase("Present") || status.equalsIgnoreCase("Absent") ? status : "Present";
    }

    public String getStatus() { return status; }
}