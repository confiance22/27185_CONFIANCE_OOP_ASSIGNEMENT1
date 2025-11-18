package package27185.q3;

public class TaxDeclaration extends Employee {
    private String declarationMonth;
    private double totalIncome;

    public TaxDeclaration(int id, String authorityName, String region, String email,
                          String categoryName, double rate, String code,
                          String tin, String taxpayerName, String address,
                          String employerName, String employerTin, String contact,
                          String employeeName, double salary, String employeeTin,
                          String declarationMonth, double totalIncome) {
        super(id, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address,
                employerName, employerTin, contact, employeeName, salary, employeeTin);
        this.declarationMonth = declarationMonth;
        this.totalIncome = totalIncome >= 0 ? totalIncome : 0;
    }

    public String getDeclarationMonth() { return declarationMonth; }
    public double getTotalIncome() { return totalIncome; }
}