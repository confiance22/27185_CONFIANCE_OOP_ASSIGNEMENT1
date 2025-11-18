package package27185.q4;

public class Department extends Organization {
    private String deptName;
    private String deptCode;

    public Department(int id, String orgName, String address, String contactEmail,
                      String deptName, String deptCode) {
        super(id, orgName, address, contactEmail);
        this.deptName = deptName;
        this.deptCode = deptCode.length() >= 3 ? deptCode : "DEP";
    }

    public String getDeptName() { return deptName; }
    public String getDeptCode() { return deptCode; }
}