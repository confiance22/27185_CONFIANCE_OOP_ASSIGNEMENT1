package package27185.q1;

public class Supplier extends Entity {
    private String supplierName;
    private String supplierEmail;
    private String supplierPhone;

    public Supplier(int id, String supplierName, String supplierEmail, String supplierPhone) {
        super(id, null, null);
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail.contains("@") ? supplierEmail : "a@b.com";
        this.supplierPhone = supplierPhone.matches("\\d{10}") ? supplierPhone : "0000000000";
    }

    public String getSupplierName() { return supplierName; }
    public String getSupplierEmail() { return supplierEmail; }
    public String getSupplierPhone() { return supplierPhone; }
}