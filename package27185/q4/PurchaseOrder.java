package package27185.q4;

import java.time.LocalDate;

public class PurchaseOrder extends Product {
    private String poNumber;
    private LocalDate orderDate;
    private double totalAmount;

    public PurchaseOrder(int id, String orgName, String address, String contactEmail,
                         String deptName, String deptCode,
                         String supplierName, String supplierTin, String contact,
                         String productName, double unitPrice, int quantity,
                         String poNumber, LocalDate orderDate, double totalAmount) {
        super(id, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTin, contact,
                productName, unitPrice, quantity);
        this.poNumber = poNumber;
        this.orderDate = orderDate == null ? LocalDate.now() : orderDate;
        this.totalAmount = totalAmount > 0 ? totalAmount : 1;
    }

    public String getPoNumber() { return poNumber; }
    public LocalDate getOrderDate() { return orderDate; }
    public double getTotalAmount() { return totalAmount; }
}