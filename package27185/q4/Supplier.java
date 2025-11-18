package package27185.q4;

public class Supplier extends Department {
    private String supplierName;
    private String supplierTin;
    private String contact;

    public Supplier(int id, String orgName, String address, String contactEmail,
                    String deptName, String deptCode,
                    String supplierName, String supplierTin, String contact) {
        super(id, orgName, address, contactEmail, deptName, deptCode);
        this.supplierName = supplierName;
        this.supplierTin = supplierTin.matches("\\d{9}") ? supplierTin : "000000000";
        this.contact = contact.matches("\\d{10}") ? contact : "0000000000";
    }

    public String getSupplierName() { return supplierName; }
    public String getSupplierTin() { return supplierTin; }
    public String getContact() { return contact; }
}