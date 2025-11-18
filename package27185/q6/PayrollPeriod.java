package package27185.q6;

import java.time.LocalDate;

public class PayrollPeriod extends Employee {
    private int month;
    private int year;
    private LocalDate startDate;
    private LocalDate endDate;

    public PayrollPeriod(int id, String orgName, String orgCode, String rssbNumber, String contactEmail,
                         String deptName, String deptCode, String managerName,
                         int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                         int month, int year, LocalDate startDate, LocalDate endDate) {
        super(id, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered);
        this.month = (month >= 1 && month <= 12) ? month : 1;
        this.year = year >= 2000 ? year : 2000;
        this.startDate = startDate == null ? LocalDate.now() : startDate;
        this.endDate = endDate == null ? LocalDate.now() : endDate;
    }

    public int getMonth() { return month; }
    public int getYear() { return year; }
    public LocalDate getStartDate() { return startDate; }
    public LocalDate getEndDate() { return endDate; }
}