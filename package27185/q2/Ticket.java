package package27185.q2;

import java.util.Scanner;

public class Ticket extends Payment {
    private String ticketNumber;
    private String issueDate;

    public Ticket(int id, String airportName, String code, String location,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination, double baseFare,
                  String pilotName, String licenseNumber, int experienceYears,
                  String crewName, String role, String shift,
                  String passengerName, int age, String gender, String contact,
                  String bookingDate, String seatNumber, String travelClass,
                  String paymentDate, String paymentMethod, double amountPaid,
                  String ticketNumber, String issueDate) {
        super(id, airportName, code, location, airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears,
                crewName, role, shift, passengerName, age, gender, contact,
                bookingDate, seatNumber, travelClass, paymentDate, paymentMethod, amountPaid);
        this.ticketNumber = ticketNumber;
        this.issueDate = issueDate;
    }

    public double calculateFare() {
        double tax = getBaseFare() * 0.18;
        double discount = getBaseFare() * 0.05;
        return getBaseFare() + tax - discount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ticket number: ");
        String tnum = sc.nextLine();
        System.out.print("Enter issue date: ");
        String idate = sc.nextLine();

        Ticket t = new Ticket(1, "Kigali Airport", "KGL", "Kigali",
                "RwandAir", "RWD", "info@rwandair.com",
                "RW123", "Kigali", "Nairobi", 200,
                "John", "RW12345", 5,
                "Alice", "Attendant", "Day",
                "Bob", 30, "Male", "0788888888",
                "2025-11-18", "12A", "Economy",
                "2025-11-18", "Cash", 200,
                tnum, idate);
        System.out.println("28048 – Final Fare: " + t.calculateFare());
    }
}