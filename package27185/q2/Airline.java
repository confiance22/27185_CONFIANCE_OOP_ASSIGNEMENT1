package package27185.q2;

public class Airline extends Airport {
    private String airlineName;
    private String airlineCode;
    private String contactEmail;

    public Airline(int id, String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail) {
        super(id, airportName, code, location);
        this.airlineName = airlineName;
        this.airlineCode = airlineCode.matches("[A-Za-z]{2,4}") ? airlineCode : "AB";
        this.contactEmail = contactEmail.contains("@") ? contactEmail : "a@b.com";
    }

    public String getAirlineName() { return airlineName; }
    public String getAirlineCode() { return airlineCode; }
    public String getContactEmail() { return contactEmail; }
}