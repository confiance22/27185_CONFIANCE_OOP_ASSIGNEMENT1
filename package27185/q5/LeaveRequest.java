package package27185.q5;

import java.time.LocalDate;

public class LeaveRequest extends AttendanceRecord {
    private LocalDate requestDate;
    private String reason;
    private boolean approved;

    public LeaveRequest(int id, String institutionName, String code, String address,
                        String departmentName, String departmentHead,
                        String courseName, String courseCode, int credits,
                        String instructorName, String email, String phone,
                        String studentName, String studentID, int age,
                        LocalDate sessionDate, String topic,
                        String status,
                        LocalDate requestDate, String reason, boolean approved) {
        super(id, institutionName, code, address, departmentName, departmentHead,
                courseName, courseCode, credits, instructorName, email, phone,
                studentName, studentID, age, sessionDate, topic, status);
        this.requestDate = requestDate == null ? LocalDate.now() : requestDate;
        this.reason = reason.isEmpty() ? "N/A" : reason;
        this.approved = approved;
    }

    public LocalDate getRequestDate() { return requestDate; }
    public String getReason() { return reason; }
    public boolean isApproved() { return approved; }
}