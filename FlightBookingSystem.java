import java.util.*;

// Flight class to store flight details
class Flight {
    private String flightNumber;
    private String origin;
    private String destination;
    private int totalSeats;
    private boolean[] seats;

    public Flight(String flightNumber, String origin, String destination, int totalSeats) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.seats = new boolean[totalSeats];
    }

    public String getFlightNumber() { return flightNumber; }
    public String getOrigin() { return origin; }
    public String getDestination() { return destination; }
    public int getTotalSeats() { return totalSeats; }

    public boolean bookSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > totalSeats || seats[seatNumber - 1]) {
            return false;
        }
        seats[seatNumber - 1] = true;
        return true;
    }
}

// Payment class to handle payment processing
class Payment {
    public static boolean processPayment(String cardNumber, double amount) {
        if (cardNumber.length() == 16 && amount > 0) {
            System.out.println("Payment of $" + amount + " successful.");
            return true;
        }
        System.out.println("Payment failed.");
        return false;
    }
}

// Booking system
class BookingSystem {
    private Map<String, Flight> flights = new HashMap<>();

    public void addFlight(Flight flight) {
        flights.put(flight.getFlightNumber(), flight);
    }

    public Flight getFlight(String flightNumber) {
        return flights.get(flightNumber);
    }

    public boolean bookFlight(String flightNumber, int seatNumber, String cardNumber) {
        Flight flight = flights.get(flightNumber);
        if (flight == null) {
            System.out.println("Flight not found.");
            return false;
        }
        if (flight.bookSeat(seatNumber)) {
            return Payment.processPayment(cardNumber, 100.0); // Example price
        } else {
            System.out.println("Seat already booked or invalid seat number.");
            return false;
        }
    }
}

// Main class to test the system
public class FlightBookingSystem {
    public static void main(String[] args) {
        BookingSystem bookingSystem = new BookingSystem();

        // Adding flights
        Flight flight1 = new Flight("FL123", "New York", "Los Angeles", 100);
        bookingSystem.addFlight(flight1);

        // Booking a seat
        boolean success = bookingSystem.bookFlight("FL123", 10, "1234567812345678");
        System.out.println("Booking successful: " + success);
    }
}
