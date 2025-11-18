package package27185.q5;

public class Course extends Department {
    private String courseName;
    private String courseCode;
    private int credits;

    public Course(int id, String institutionName, String code, String address,
                  String departmentName, String departmentHead,
                  String courseName, String courseCode, int credits) {
        super(id, institutionName, code, address, departmentName, departmentHead);
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits > 0 ? credits : 1;
    }

    public String getCourseName() { return courseName; }
    public String getCourseCode() { return courseCode; }
    public int getCredits() { return credits; }
}