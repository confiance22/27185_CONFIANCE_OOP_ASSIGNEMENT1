package package27185.q1;

public class Product extends Entity {
    private String productName;
    private double unitPrice;
    private int stockLimit;

    public Product(int id, String productName, double unitPrice, int stockLimit) {
        super(id, null, null);
        this.productName = productName;
        this.unitPrice = unitPrice > 0 ? unitPrice : 1;
        this.stockLimit = stockLimit >= 0 ? stockLimit : 0;
    }

    public String getProductName() { return productName; }
    public double getUnitPrice() { return unitPrice; }
    public int getStockLimit() { return stockLimit; }
}
