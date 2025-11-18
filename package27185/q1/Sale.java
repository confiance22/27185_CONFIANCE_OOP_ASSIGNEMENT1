package package27185.q1;

import java.time.LocalDate;

public class Sale extends StockItem {
    private LocalDate saleDate;
    private int soldQuantity;
    private String customerName;

    public Sale(int id, String productName, double unitPrice, int stockLimit,
                int quantityAvailable, int reorderLevel,
                LocalDate saleDate, int soldQuantity, String customerName) {
        super(id, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel);
        this.saleDate = saleDate == null ? LocalDate.now() : saleDate;
        this.soldQuantity = soldQuantity > 0 ? soldQuantity : 1;
        this.customerName = customerName;
    }

    public LocalDate getSaleDate() { return saleDate; }
    public int getSoldQuantity() { return soldQuantity; }
    public String getCustomerName() { return customerName; }
}