package package27185.q2;

public class Booking extends Passenger {
    private String bookingDate;
    private String seatNumber;
    private String travelClass;

    public Booking(int id, String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail,
                   String flightNumber, String departure, String destination, double baseFare,
                   String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift,
                   String passengerName, int age, String gender, String contact,
                   String bookingDate, String seatNumber, String travelClass) {
        super(id, airportName, code, location, airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears,
                crewName, role, shift, passengerName, age, gender, contact);
        this.bookingDate = bookingDate;
        this.seatNumber = seatNumber;
        this.travelClass = travelClass.equalsIgnoreCase("Economy") ||
                travelClass.equalsIgnoreCase("Business") ||
                travelClass.equalsIgnoreCase("First") ? travelClass : "Economy";
    }

    public String getBookingDate() { return bookingDate; }
    public String getSeatNumber() { return seatNumber; }
    public String getTravelClass() { return travelClass; }
}