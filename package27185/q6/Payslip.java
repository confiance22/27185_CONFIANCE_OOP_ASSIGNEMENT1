package package27185.q6;

import java.time.LocalDate;
import java.util.Scanner;

public class Payslip extends Payroll {
    private String payslipNumber;
    private String issueDate;

    public Payslip(int id, String orgName, String orgCode, String rssbNumber, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                   int month, int year, LocalDate startDate, LocalDate endDate,
                   double basicPay, double transportAllowance, double housingAllowance,
                   double rssbContribution, double payeTax, double loanDeduction,
                   int overtimeHours, double overtimeRate, double bonus,
                   String payslipNumber, String issueDate) {
        super(id, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate,
                basicPay, transportAllowance, housingAllowance, rssbContribution, payeTax, loanDeduction,
                overtimeHours, overtimeRate, bonus);
        this.payslipNumber = payslipNumber;
        this.issueDate = issueDate;
    }

    public void generatePayslip() {
        System.out.println("28048 – PAYSLIP");
        System.out.println("Payslip No: " + payslipNumber);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Name: " + getFullName());
        System.out.println("Position: " + getPosition());
        System.out.println("Department: " + getDeptName());
        System.out.println("Gross Salary: " + getGrossSalary());
        System.out.println("Total Deductions: " + getTotalDeductions());
        System.out.println("Net Salary: " + getNetSalary());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter payslip number: ");
        String pn = sc.nextLine();
        System.out.print("Enter issue date: ");
        String idate = sc.nextLine();

        Payslip p = new Payslip(1, "RSSB", "RSSB2025", "12345678", "a@rssb.rw",
                "IT", "IT", "Mr. A",
                21848, "RUDAHIGWA M. Loic", "Developer", 500000, true,
                11, 2025, LocalDate.now(), LocalDate.now(),
                400000, 50000, 100000,
                20000, 50000, 10000,
                10, 5000, 20000,
                pn, idate);
        p.generatePayslip();
    }
}