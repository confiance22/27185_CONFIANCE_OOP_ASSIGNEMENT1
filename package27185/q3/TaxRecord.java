package package27185.q3;

import java.time.LocalDate;
import java.util.Scanner;

public class TaxRecord extends Payment {
    private String receiptNo;
    private double totalTax;

    public TaxRecord(int id, String authorityName, String region, String email,
                     String categoryName, double rate, String code,
                     String tin, String taxpayerName, String address,
                     String employerName, String employerTin, String contact,
                     String employeeName, double salary, String employeeTin,
                     String declarationMonth, double totalIncome,
                     LocalDate assessmentDate, double assessedTax,
                     LocalDate paymentDate, double paymentAmount,
                     String receiptNo, double totalTax) {
        super(id, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address,
                employerName, employerTin, contact, employeeName, salary, employeeTin,
                declarationMonth, totalIncome, assessmentDate, assessedTax, paymentDate, paymentAmount);
        this.receiptNo = receiptNo;
        this.totalTax = totalTax;
    }

    public double computeTax() {
        double credits = 5000;
        return (getSalary() * getRate()) - credits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter receipt number: ");
        String r = sc.nextLine();
        TaxRecord tr = new TaxRecord(1, "RRA", "Kigali", "a@rra.rw",
                "Income", 0.2, "INC",
                "123456789", "Alice", "KG 123",
                "ABC Ltd", "987654321", "0788888888",
                "Bob", 500000, "111111111",
                "November", 500000,
                LocalDate.now(), 100000,
                LocalDate.now(), 100000,
                r, 100000);
        System.out.println("28048 – Computed Tax: " + tr.computeTax());
    }
}