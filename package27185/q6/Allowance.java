package package27185.q6;

import java.time.LocalDate;
public class Allowance extends Deduction {
    private int overtimeHours;
    private double overtimeRate;
    private double bonus;

    public Allowance(int id, String orgName, String orgCode, String rssbNumber, String contactEmail,
                     String deptName, String deptCode, String managerName,
                     int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                     int month, int year, LocalDate startDate, LocalDate endDate,
                     double basicPay, double transportAllowance, double housingAllowance,
                     double rssbContribution, double payeTax, double loanDeduction,
                     int overtimeHours, double overtimeRate, double bonus) {
        super(id, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate,
                basicPay, transportAllowance, housingAllowance, rssbContribution, payeTax, loanDeduction);
        this.overtimeHours = overtimeHours >= 0 ? overtimeHours : 0;
        this.overtimeRate = overtimeRate >= 0 ? overtimeRate : 0;
        this.bonus = bonus >= 0 ? bonus : 0;
    }

    public int getOvertimeHours() { return overtimeHours; }
    public double getOvertimeRate() { return overtimeRate; }
    public double getBonus() { return bonus; }
}