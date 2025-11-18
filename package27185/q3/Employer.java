package package27185.q3;

public class Employer extends Taxpayer {
    private String employerName;
    private String employerTin;
    private String contact;

    public Employer(int id, String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address,
                    String employerName, String employerTin, String contact) {
        super(id, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address);
        this.employerName = employerName;
        this.employerTin = employerTin.matches("\\d{9}") ? employerTin : "000000000";
        this.contact = contact.matches("\\d{10}") ? contact : "0000000000";
    }

    public String getEmployerName() { return employerName; }
    public String getEmployerTin() { return employerTin; }
    public String getContact() { return contact; }
}