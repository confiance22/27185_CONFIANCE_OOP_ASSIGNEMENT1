package package27185.q2;

public class Payment extends Booking {
    private String paymentDate;
    private String paymentMethod;
    private double amountPaid;

    public Payment(int id, String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail,
                   String flightNumber, String departure, String destination, double baseFare,
                   String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift,
                   String passengerName, int age, String gender, String contact,
                   String bookingDate, String seatNumber, String travelClass,
                   String paymentDate, String paymentMethod, double amountPaid) {
        super(id, airportName, code, location, airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears,
                crewName, role, shift, passengerName, age, gender, contact,
                bookingDate, seatNumber, travelClass);
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod.isEmpty() ? "Cash" : paymentMethod;
        this.amountPaid = amountPaid > 0 ? amountPaid : 1;
    }

    public String getPaymentDate() { return paymentDate; }
    public String getPaymentMethod() { return paymentMethod; }
    public double getAmountPaid() { return amountPaid; }
}