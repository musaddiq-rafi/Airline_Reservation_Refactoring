import java.time.LocalDateTime;

public class Ticket {
    private Customer customer;
    private Flight flight;
    private int numberOfSeats;
    private LocalDateTime bookingTime;

    public Ticket(Customer customer, Flight flight, int numberOfSeats) {
        this.customer = customer;
        this.flight = flight;
        this.numberOfSeats = numberOfSeats;
        this.bookingTime = LocalDateTime.now();
    }

    // Getters and setters
    public Customer getCustomer() {
        return customer;
    }

    public Flight getFlight() {
        return flight;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }
}