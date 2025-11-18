package package27185.q6;

import java.time.LocalDate;

public class Deduction extends SalaryStructure {
    private double rssbContribution;
    private double payeTax;
    private double loanDeduction;

    public Deduction(int id, String orgName, String orgCode, String rssbNumber, String contactEmail,
                     String deptName, String deptCode, String managerName,
                     int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                     int month, int year, LocalDate startDate, LocalDate endDate,
                     double basicPay, double transportAllowance, double housingAllowance,
                     double rssbContribution, double payeTax, double loanDeduction) {
        super(id, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate,  endDate,
                basicPay, transportAllowance, housingAllowance);
        this.rssbContribution = rssbContribution >= 0 ? rssbContribution : 0;
        this.payeTax = payeTax >= 0 ? payeTax : 0;
        this.loanDeduction = loanDeduction >= 0 ? loanDeduction : 0;
    }

    public double getRssbContribution() { return rssbContribution; }
    public double getPayeTax() { return payeTax; }
    public double getLoanDeduction() { return loanDeduction; }
}