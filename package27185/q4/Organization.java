package package27185.q4;

public class Organization extends Entity {
    private String orgName;
    private String address;
    private String contactEmail;

    public Organization(int id, String orgName, String address, String contactEmail) {
        super(id, null, null);
        this.orgName = orgName;
        this.address = address;
        this.contactEmail = contactEmail.contains("@") ? contactEmail : "a@b.com";
    }

    public String getOrgName() { return orgName; }
    public String getAddress() { return address; }
    public String getContactEmail() { return contactEmail; }
}