package package27185.q6;

public class Department extends Organization {
    private String deptName;
    private String deptCode;
    private String managerName;

    public Department(int id, String orgName, String orgCode, String rssbNumber, String contactEmail,
                      String deptName, String deptCode, String managerName) {
        super(id, orgName, orgCode, rssbNumber, contactEmail);
        this.deptName = deptName;
        this.deptCode = deptCode.length() >= 3 ? deptCode : "DEP";
        this.managerName = managerName;
    }

    public String getDeptName() { return deptName; }
    public String getDeptCode() { return deptCode; }
    public String getManagerName() { return managerName; }
}