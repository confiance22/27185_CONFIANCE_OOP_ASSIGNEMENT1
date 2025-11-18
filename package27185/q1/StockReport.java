package package27185.q1;

import java.util.Scanner;

public class StockReport extends Inventory {
    private String reportDate;
    private String remarks;

    public StockReport(int id, String productName, double unitPrice, int stockLimit,
                       int quantityAvailable, int reorderLevel,
                       java.time.LocalDate saleDate, int soldQuantity, String customerName,
                       int totalItems, double stockValue,
                       String reportDate, String remarks) {
        super(id, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel,
                saleDate, soldQuantity, customerName, totalItems, stockValue);
        this.reportDate = reportDate;
        this.remarks = remarks;
    }

    public void generateReport() {
        System.out.println("28048 – Stock Report");
        System.out.println("Date: " + reportDate);
        System.out.println("Total Items: " + getTotalItems());
        System.out.println("Stock Value: " + getStockValue());
        System.out.println("Remarks: " + remarks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter report date: ");
        String date = sc.nextLine();
        System.out.print("Enter remarks: ");
        String rem = sc.nextLine();

        StockReport r = new StockReport(1, "Pen", 10, 100, 50, 20,
                java.time.LocalDate.now(), 5, "John",
                50, 500, date, rem);
        r.generateReport();
    }
}