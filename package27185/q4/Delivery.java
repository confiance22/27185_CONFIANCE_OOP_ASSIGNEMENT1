package package27185.q4;

import java.time.LocalDate;

public class Delivery extends PurchaseOrder {
    private LocalDate deliveryDate;
    private String deliveredBy;

    public Delivery(int id, String orgName, String address, String contactEmail,
                    String deptName, String deptCode,
                    String supplierName, String supplierTin, String contact,
                    String productName, double unitPrice, int quantity,
                    String poNumber, LocalDate orderDate, double totalAmount,
                    LocalDate deliveryDate, String deliveredBy) {
        super(id, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTin, contact,
                productName, unitPrice, quantity, poNumber, orderDate, totalAmount);
        this.deliveryDate = deliveryDate == null ? LocalDate.now() : deliveryDate;
        this.deliveredBy = deliveredBy.isEmpty() ? "N/A" : deliveredBy;
    }

    public LocalDate getDeliveryDate() { return deliveryDate; }
    public String getDeliveredBy() { return deliveredBy; }
}