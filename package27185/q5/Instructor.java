package package27185.q5;

public class Instructor extends Course {
    private String instructorName;
    private String email;
    private String phone;

    public Instructor(int id, String institutionName, String code, String address,
                      String departmentName, String departmentHead,
                      String courseName, String courseCode, int credits,
                      String instructorName, String email, String phone) {
        super(id, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits);
        this.instructorName = instructorName;
        this.email = email.contains("@") ? email : "a@b.com";
        this.phone = phone.matches("\\d{10}") ? phone : "0000000000";
    }

    public String getInstructorName() { return instructorName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
}