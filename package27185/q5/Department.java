package package27185.q5;

public class Department extends Institution {
    private String departmentName;
    private String departmentHead;

    public Department(int id, String institutionName, String code, String address,
                      String departmentName, String departmentHead) {
        super(id, institutionName, code, address);
        this.departmentName = departmentName.isEmpty() ? "N/A" : departmentName;
        this.departmentHead = departmentHead.isEmpty() ? "N/A" : departmentHead;
    }

    public String getDepartmentName() { return departmentName; }
    public String getDepartmentHead() { return departmentHead; }
}