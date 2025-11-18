package package27185.q4;

import java.time.LocalDate;

public class Invoice extends Inspection {
    private double invoiceAmount;

    public Invoice(int id, String orgName, String address, String contactEmail,
                   String deptName, String deptCode,
                   String supplierName, String supplierTin, String contact,
                   String productName, double unitPrice, int quantity,
                   String poNumber, LocalDate orderDate, double totalAmount,
                   LocalDate deliveryDate, String deliveredBy,
                   String inspectorName, String status, String remarks,
                   double invoiceAmount) {
        super(id, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTin, contact,
                productName, unitPrice, quantity, poNumber, orderDate, totalAmount,
                deliveryDate, deliveredBy, inspectorName, status, remarks);
        this.invoiceAmount = invoiceAmount > 0 ? invoiceAmount : 1;
    }

    public double getInvoiceAmount() { return invoiceAmount; }
}