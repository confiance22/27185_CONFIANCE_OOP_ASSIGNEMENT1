package package27185.q2;

public class Airport extends Entity {
    private String airportName;
    private String code;
    private String location;

    public Airport(int id, String airportName, String code, String location) {
        super(id, null, null);
        this.airportName = airportName;
        this.code = code.matches("[A-Z]{3}") ? code : "AAA";
        this.location = location;
    }

    public String getAirportName() { return airportName; }
    public String getCode() { return code; }
    public String getLocation() { return location; }
}