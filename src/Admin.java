import java.util.Scanner;
public class Admin extends User {

    public Admin() {
        super();
    }


    public Admin(String name, String email, String password) {
        super(name, email, password);
        // Admin-specific initialization
    }

    @Override
    public void displayMenu() {
        displayHeader("ADMIN MENU");
        System.out.println("1. Register New Customer");
        System.out.println("2. View All Customers");
        System.out.println("3. Search Customer");
        System.out.println("4. Edit Customer Information");
        System.out.println("5. Delete Customer");
        System.out.println("6. Create Flight Schedule");
        System.out.println("7. View All Registered Users for All Flights");
        System.out.println("8. View Registered Users for a Specific Flight");
        System.out.println("9. Delete Flight");
        System.out.println("0. Logout");
    }

    @Override
    public boolean handleMenuChoice(int choice) {
        Scanner read = new Scanner(System.in);
        Customer customer = new Customer();
        Flight flight = new Flight();
        FlightReservation flightReservation = new FlightReservation();

        switch (choice) {
            case 1:
                // Rename Method (1.5.1)
                customer.addNewCustomer();
                break;
            case 2:
                // Push Down Method (1.6.2) - Moved from User to Customer
                customer.displayCustomersData(true);
                break;
            case 3:
                System.out.print("Enter the UserID to search:\t");
                customer.searchUser(read.nextLine());
                break;
            case 4:
                System.out.print("Enter the UserID to edit:\t");
                customer.editUserInfo(read.nextLine());
                break;
            case 5:
                System.out.print("Enter the UserID to delete:\t");
                customer.deleteUser(read.nextLine());
                break;
            case 6:
                flight.flightScheduler();
                flight.displayFlightSchedule();
                break;
            case 7:
                flightReservation.displayRegisteredUsersForAllFlight();
                break;
            case 8:
                System.out.print("Enter the Flight Number:\t");
                flightReservation.displayRegisteredUsersForASpecificFlight(read.nextLine());
                break;
            case 9:
                System.out.print("Enter the Flight Number to delete:\t");
                flight.deleteFlight(read.nextLine());
                break;
            case 0:
                return false;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        return true;
    }
}