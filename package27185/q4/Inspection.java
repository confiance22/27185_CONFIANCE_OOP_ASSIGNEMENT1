package package27185.q4;

import java.time.LocalDate;

public class Inspection extends Delivery {
    private String inspectorName;
    private String status;
    private String remarks;

    public Inspection(int id, String orgName, String address, String contactEmail,
                      String deptName, String deptCode,
                      String supplierName, String supplierTin, String contact,
                      String productName, double unitPrice, int quantity,
                      String poNumber, LocalDate orderDate, double totalAmount,
                      LocalDate deliveryDate, String deliveredBy,
                      String inspectorName, String status, String remarks) {
        super(id, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTin, contact,
                productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy);
        this.inspectorName = inspectorName;
        this.status = status.equalsIgnoreCase("Passed") || status.equalsIgnoreCase("Failed") ? status : "Passed";
        this.remarks = remarks;
    }

    public String getInspectorName() { return inspectorName; }
    public String getStatus() { return status; }
    public String getRemarks() { return remarks; }
}