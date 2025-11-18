package package27185.q3;

public class Employee extends Employer {
    private String employeeName;
    private double salary;
    private String employeeTin;

    public Employee(int id, String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address,
                    String employerName, String employerTin, String contact,
                    String employeeName, double salary, String employeeTin) {
        super(id, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address,
                employerName, employerTin, contact);
        this.employeeName = employeeName;
        this.salary = salary > 0 ? salary : 1;
        this.employeeTin = employeeTin.matches("\\d{9}") ? employeeTin : "000000000";
    }

    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }
    public String getEmployeeTin() { return employeeTin; }
}