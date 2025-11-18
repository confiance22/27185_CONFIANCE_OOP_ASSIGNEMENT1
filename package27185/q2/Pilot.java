package package27185.q2;

public class Pilot extends Flight {
    private String pilotName;
    private String licenseNumber;
    private int experienceYears;

    public Pilot(int id, String airportName, String code, String location,
                 String airlineName, String airlineCode, String contactEmail,
                 String flightNumber, String departure, String destination, double baseFare,
                 String pilotName, String licenseNumber, int experienceYears) {
        super(id, airportName, code, location, airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare);
        this.pilotName = pilotName;
        this.licenseNumber = licenseNumber.isEmpty() ? "N/A" : licenseNumber;
        this.experienceYears = experienceYears >= 2 ? experienceYears : 2;
    }

    public String getPilotName() { return pilotName; }
    public String getLicenseNumber() { return licenseNumber; }
    public int getExperienceYears() { return experienceYears; }
}