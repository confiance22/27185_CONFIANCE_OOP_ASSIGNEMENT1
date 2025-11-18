package package27185.q1;

public class StockItem extends Product {
    private int quantityAvailable;
    private int reorderLevel;

    public StockItem(int id, String productName, double unitPrice, int stockLimit,
                     int quantityAvailable, int reorderLevel) {
        super(id, productName, unitPrice, stockLimit);
        this.quantityAvailable = quantityAvailable >= 0 ? quantityAvailable : 0;
        this.reorderLevel = reorderLevel >= 0 ? reorderLevel : 0;
    }

    public int getQuantityAvailable() { return quantityAvailable; }
    public int getReorderLevel() { return reorderLevel; }
}