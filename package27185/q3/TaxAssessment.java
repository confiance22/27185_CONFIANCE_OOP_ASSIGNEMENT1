package package27185.q3;

import java.time.LocalDate;

public class TaxAssessment extends TaxDeclaration {
    private LocalDate assessmentDate;
    private double assessedTax;

    public TaxAssessment(int id, String authorityName, String region, String email,
                         String categoryName, double rate, String code,
                         String tin, String taxpayerName, String address,
                         String employerName, String employerTin, String contact,
                         String employeeName, double salary, String employeeTin,
                         String declarationMonth, double totalIncome,
                         LocalDate assessmentDate, double assessedTax) {
        super(id, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address,
                employerName, employerTin, contact, employeeName, salary, employeeTin,
                declarationMonth, totalIncome);
        this.assessmentDate = assessmentDate == null ? LocalDate.now() : assessmentDate;
        this.assessedTax = assessedTax >= 0 ? assessedTax : 0;
    }

    public LocalDate getAssessmentDate() { return assessmentDate; }
    public double getAssessedTax() { return assessedTax; }
}