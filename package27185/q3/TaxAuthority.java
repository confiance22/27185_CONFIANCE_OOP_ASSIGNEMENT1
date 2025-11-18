package package27185.q3;

public class TaxAuthority extends Entity {
    private String authorityName;
    private String region;
    private String email;

    public TaxAuthority(int id, String authorityName, String region, String email) {
        super(id, null, null);
        this.authorityName = authorityName;
        this.region = region;
        this.email = email.contains("@") ? email : "a@b.com";
    }

    public String getAuthorityName() { return authorityName; }
    public String getRegion() { return region; }
    public String getEmail() { return email; }
}