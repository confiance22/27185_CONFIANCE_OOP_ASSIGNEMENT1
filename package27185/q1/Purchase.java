package package27185.q1;

import java.time.LocalDate;

public class Purchase extends StockItem {
    private LocalDate purchaseDate;
    private int purchasedQuantity;
    private String supplierName;

    public Purchase(int id, String productName, double unitPrice, int stockLimit,
                    int quantityAvailable, int reorderLevel,
                    LocalDate purchaseDate, int purchasedQuantity, String supplierName) {
        super(id, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel);
        this.purchaseDate = purchaseDate == null ? LocalDate.now() : purchaseDate;
        this.purchasedQuantity = purchasedQuantity > 0 ? purchasedQuantity : 1;
        this.supplierName = supplierName;
    }

    public LocalDate getPurchaseDate() { return purchaseDate; }
    public int getPurchasedQuantity() { return purchasedQuantity; }
    public String getSupplierName() { return supplierName; }
}