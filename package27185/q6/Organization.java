package package27185.q6;

public class Organization extends Entity {
    private String orgName;
    private String orgCode;
    private String rssbNumber;
    private String contactEmail;

    public Organization(int id, String orgName, String orgCode, String rssbNumber, String contactEmail) {
        super(id, null, null);
        this.orgName = orgName;
        this.orgCode = orgCode.length() >= 3 ? orgCode : "ORG";
        this.rssbNumber = rssbNumber.matches("\\d{8}") ? rssbNumber : "00000000";
        this.contactEmail = contactEmail.contains("@") ? contactEmail : "a@b.com";
    }

    public String getOrgName() { return orgName; }
    public String getOrgCode() { return orgCode; }
    public String getRssbNumber() { return rssbNumber; }
    public String getContactEmail() { return contactEmail; }
}