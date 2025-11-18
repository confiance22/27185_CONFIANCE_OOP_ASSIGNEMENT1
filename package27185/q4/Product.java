package package27185.q4;

public class Product extends Supplier {
    private String productName;
    private double unitPrice;
    private int quantity;

    public Product(int id, String orgName, String address, String contactEmail,
                   String deptName, String deptCode,
                   String supplierName, String supplierTin, String contact,
                   String productName, double unitPrice, int quantity) {
        super(id, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTin, contact);
        this.productName = productName;
        this.unitPrice = unitPrice > 0 ? unitPrice : 1;
        this.quantity = quantity >= 0 ? quantity : 0;
    }

    public String getProductName() { return productName; }
    public double getUnitPrice() { return unitPrice; }
    public int getQuantity() { return quantity; }
}