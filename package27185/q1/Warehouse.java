package package27185.q1;

public class Warehouse extends Entity {
    private String warehouseName;
    private String location;
    private String contactNumber;

    public Warehouse(int id, String warehouseName, String location, String contactNumber) {
        super(id, null, null);
        this.warehouseName = warehouseName;
        this.location = location;
        this.contactNumber = contactNumber.matches("\\d{10}") ? contactNumber : "0000000000";
    }

    public String getWarehouseName() { return warehouseName; }
    public String getLocation() { return location; }
    public String getContactNumber() { return contactNumber; }
}