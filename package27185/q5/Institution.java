package package27185.q5;

public class Institution extends Entity {
    private String institutionName;
    private String code;
    private String address;

    public Institution(int id, String institutionName, String code, String address) {
        super(id, null, null);
        this.institutionName = institutionName;
        this.code = code.length() >= 3 ? code : "INS";
        this.address = address;
    }

    public String getInstitutionName() { return institutionName; }
    public String getCode() { return code; }
    public String getAddress() { return address; }
}