package package27185.q3;

import java.time.LocalDate;

public class Payment extends TaxAssessment {
    private LocalDate paymentDate;
    private double paymentAmount;

    public Payment(int id, String authorityName, String region, String email,
                   String categoryName, double rate, String code,
                   String tin, String taxpayerName, String address,
                   String employerName, String employerTin, String contact,
                   String employeeName, double salary, String employeeTin,
                   String declarationMonth, double totalIncome,
                   LocalDate assessmentDate, double assessedTax,
                   LocalDate paymentDate, double paymentAmount) {
        super(id, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address,
                employerName, employerTin, contact, employeeName, salary, employeeTin,
                declarationMonth, totalIncome, assessmentDate, assessedTax);
        this.paymentDate = paymentDate == null ? LocalDate.now() : paymentDate;
        this.paymentAmount = paymentAmount > 0 ? paymentAmount : 1;
    }

    public LocalDate getPaymentDate() { return paymentDate; }
    public double getPaymentAmount() { return paymentAmount; }
}