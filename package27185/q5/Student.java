package package27185.q5;

public class Student extends Instructor {
    private String studentName;
    private String studentID;
    private int age;

    public Student(int id, String institutionName, String code, String address,
                   String departmentName, String departmentHead,
                   String courseName, String courseCode, int credits,
                   String instructorName, String email, String phone,
                   String studentName, String studentID, int age) {
        super(id, institutionName, code, address, departmentName, departmentHead,
                courseName, courseCode, credits, instructorName, email, phone);
        this.studentName = studentName;
        this.studentID = studentID;
        this.age = age > 0 ? age : 1;
    }

    public String getStudentName() { return studentName; }
    public String getStudentID() { return studentID; }
    public int getAge() { return age; }
}