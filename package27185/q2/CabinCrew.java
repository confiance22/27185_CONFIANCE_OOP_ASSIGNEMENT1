package package27185.q2;

public class CabinCrew extends Pilot {
    private String crewName;
    private String role;
    private String shift;

    public CabinCrew(int id, String airportName, String code, String location,
                     String airlineName, String airlineCode, String contactEmail,
                     String flightNumber, String departure, String destination, double baseFare,
                     String pilotName, String licenseNumber, int experienceYears,
                     String crewName, String role, String shift) {
        super(id, airportName, code, location, airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears);
        this.crewName = crewName;
        this.role = role.isEmpty() ? "N/A" : role;
        this.shift = shift.equalsIgnoreCase("Day") || shift.equalsIgnoreCase("Night") ? shift : "Day";
    }

    public String getCrewName() { return crewName; }
    public String getRole() { return role; }
    public String getShift() { return shift; }
}