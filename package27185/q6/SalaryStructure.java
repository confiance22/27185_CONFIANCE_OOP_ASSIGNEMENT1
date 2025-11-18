package package27185.q6;
import java.time.LocalDate;
public class SalaryStructure extends PayrollPeriod {
    private double basicPay;
    private double transportAllowance;
    private double housingAllowance;

    public SalaryStructure(int id, String orgName, String orgCode, String rssbNumber, String contactEmail,
                           String deptName, String deptCode, String managerName,
                           int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                           int month, int year, LocalDate startDate, LocalDate endDate,
                           double basicPay, double transportAllowance, double housingAllowance) {
        super(id, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate);
        this.basicPay = basicPay >= 0 ? basicPay : 0;
        this.transportAllowance = transportAllowance >= 0 ? transportAllowance : 0;
        this.housingAllowance = housingAllowance >= 0 ? housingAllowance : 0;
    }

    public double getBasicPay() { return basicPay; }
    public double getTransportAllowance() { return transportAllowance; }
    public double getHousingAllowance() { return housingAllowance; }
}