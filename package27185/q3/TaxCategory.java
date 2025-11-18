package package27185.q3;

public class TaxCategory extends TaxAuthority {
    private String categoryName;
    private double rate;
    private String code;

    public TaxCategory(int id, String authorityName, String region, String email,
                       String categoryName, double rate, String code) {
        super(id, authorityName, region, email);
        this.categoryName = categoryName;
        this.rate = rate > 0 ? rate : 0.1;
        this.code = code.length() >= 3 ? code : "CAT";
    }

    public String getCategoryName() { return categoryName; }
    public double getRate() { return rate; }
    public String getCode() { return code; }
}