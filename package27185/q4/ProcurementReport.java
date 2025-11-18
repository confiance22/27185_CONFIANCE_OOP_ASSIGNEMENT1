package package27185.q4;

import java.time.LocalDate;
import java.util.Scanner;

public class ProcurementReport extends Invoice {
    private String reportDate;
    private String summary;

    public ProcurementReport(int id, String orgName, String address, String contactEmail,
                             String deptName, String deptCode,
                             String supplierName, String supplierTin, String contact,
                             String productName, double unitPrice, int quantity,
                             String poNumber, LocalDate orderDate, double totalAmount,
                             LocalDate deliveryDate, String deliveredBy,
                             String inspectorName, String status, String remarks,
                             double invoiceAmount,
                             String reportDate, String summary) {
        super(id, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTin, contact,
                productName, unitPrice, quantity, poNumber, orderDate, totalAmount,
                deliveryDate, deliveredBy, inspectorName, status, remarks, invoiceAmount);
        this.reportDate = reportDate;
        this.summary = summary;
    }

    public double calculateTotal() {
        return getInvoiceAmount(); // simple
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter report date: ");
        String rd = sc.nextLine();
        System.out.print("Enter summary: ");
        String sm = sc.nextLine();

        ProcurementReport pr = new ProcurementReport(1, "MINECOFIN", "KK 15", "a@gov.rw",
                "FIN", "FIN",
                "BK Tech", "123456789", "0788888888",
                "Laptop", 800, 5,
                "PO123", LocalDate.now(), 4000,
                LocalDate.now(), "John",
                "Alice", "Passed", "OK",
                4000,
                rd, sm);
        System.out.println("28048 – Total Procurement: " + pr.calculateTotal());
    }
}