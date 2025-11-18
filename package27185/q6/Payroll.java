package package27185.q6;
import java.time.LocalDate;

public class Payroll extends Allowance {
    private double grossSalary;
    private double totalDeductions;
    private double netSalary;

    public Payroll(int id, String orgName, String orgCode, String rssbNumber, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                   int month, int year, LocalDate startDate, LocalDate endDate,
                   double basicPay, double transportAllowance, double housingAllowance,
                   double rssbContribution, double payeTax, double loanDeduction,
                   int overtimeHours, double overtimeRate, double bonus) {
        super(id, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate,
                basicPay, transportAllowance, housingAllowance, rssbContribution, payeTax, loanDeduction,
                overtimeHours, overtimeRate, bonus);

        this.grossSalary = basicPay + transportAllowance + housingAllowance + (overtimeHours * overtimeRate) + bonus;
        this.totalDeductions = rssbContribution + payeTax + loanDeduction;
        this.netSalary = grossSalary - totalDeductions;
    }

    public double getGrossSalary() { return grossSalary; }
    public double getTotalDeductions() { return totalDeductions; }
    public double getNetSalary() { return netSalary; }
}