package package27185.q1;

public class Inventory extends Sale {
    private int totalItems;
    private double stockValue;

    public Inventory(int id, String productName, double unitPrice, int stockLimit,
                     int quantityAvailable, int reorderLevel,
                     java.time.LocalDate saleDate, int soldQuantity, String customerName,
                     int totalItems, double stockValue) {
        super(id, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel,
                saleDate, soldQuantity, customerName);
        this.totalItems = totalItems >= 0 ? totalItems : 0;
        this.stockValue = stockValue >= 0 ? stockValue : 0;
    }

    public int getTotalItems() { return totalItems; }
    public double getStockValue() { return stockValue; }
}