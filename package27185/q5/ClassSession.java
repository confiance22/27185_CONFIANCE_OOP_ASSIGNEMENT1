package package27185.q5;

import java.time.LocalDate;

public class ClassSession extends Student {
    private LocalDate sessionDate;
    private String topic;

    public ClassSession(int id, String institutionName, String code, String address,
                        String departmentName, String departmentHead,
                        String courseName, String courseCode, int credits,
                        String instructorName, String email, String phone,
                        String studentName, String studentID, int age,
                        LocalDate sessionDate, String topic) {
        super(id, institutionName, code, address, departmentName, departmentHead,
                courseName, courseCode, credits, instructorName, email, phone,
                studentName, studentID, age);
        this.sessionDate = sessionDate == null ? LocalDate.now() : sessionDate;
        this.topic = topic.isEmpty() ? "N/A" : topic;
    }

    public LocalDate getSessionDate() { return sessionDate; }
    public String getTopic() { return topic; }
}