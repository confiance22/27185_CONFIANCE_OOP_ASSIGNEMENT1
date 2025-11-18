package package27185.q6;

public class Employee extends Department {
    private int employeeID;
    private String fullName;
    private String position;
    private double baseSalary;
    private boolean rssbRegistered;

    public Employee(int id, String orgName, String orgCode, String rssbNumber, String contactEmail,
                    String deptName, String deptCode, String managerName,
                    int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered) {
        super(id, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName);
        this.employeeID = employeeID >= 1000 ? employeeID : 1000;
        this.fullName = fullName;
        this.position = position;
        this.baseSalary = baseSalary > 0 ? baseSalary : 1;
        this.rssbRegistered = rssbRegistered;
    }

    public int getEmployeeID() { return employeeID; }
    public String getFullName() { return fullName; }
    public String getPosition() { return position; }
    public double getBaseSalary() { return baseSalary; }
    public boolean isRssbRegistered() { return rssbRegistered; }
}