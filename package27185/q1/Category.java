package package27185.q1;

public class Category extends Entity {
    private String categoryName;
    private String categoryCode;

    public Category(int id, String categoryName, String categoryCode) {
        super(id, null, null);
        this.categoryName = categoryName;
        this.categoryCode = categoryCode.length() >= 3 ? categoryCode : "CAT";
    }

    public String getCategoryName() { return categoryName; }
    public String getCategoryCode() { return categoryCode; }
}