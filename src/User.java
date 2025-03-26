/*
 * This class is intended to be the main class for this Project. All necessary methods are getting calls from this class.
 *
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class User {


    protected String userId;
    protected String name;
    protected String email;
    protected String password;


    protected User() {
        this.userId = null;
        this.name = null;
        this.email = null;
        this.password = null;
    }
    protected User(String name, String email, String password) {
        this.userId = new RandomGenerator().getRandomNumber();
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // ************************************************************ Fields
    // ************************************************************

    /*
     * 2D Array to store admin credentials. Default credentials are stored on [0][0]
     * index. Max num of admins can be 10....
     */
    static String[][] adminUserNameAndPassword = new String[10][2];
    private static final List<Customer> customersCollection = new ArrayList<>();

    static MenuHandler menuHandler = new MenuHandler();
    static UserInputHandler userInputHandler = new UserInputHandler();

    // ************************************************************
    // Behaviours/Methods
    // ************************************************************

    public static void main(String[] args) {

        initializeSystem();
        displayWelcomeMessage();
        menuHandler.displayMainMenu();
        UserInputHandler.handleUserInput();
    }

    private static void initializeSystem() {
        int countNumOfUsers = 1;
        RolesAndPermissions r1 = new RolesAndPermissions();
        Flight f1 = new Flight();
        FlightReservation bookingAndReserving = new FlightReservation();
        Customer c1 = new Customer();
        f1.flightScheduler();

    }

    private static void displayWelcomeMessage() {
        System.out.println(
                "\n\t\t\t\t\t+++++++++++++ Welcome to BAV AirLines +++++++++++++\n\nTo Further Proceed, Please enter a value.");
        System.out.println(
                "\n***** Default Username && Password is root-root ***** Using Default Credentials will restrict you to just view the list of Passengers....\n");
    }

    protected void displayHeader(String title) {
        System.out.println("\n" + " ".repeat(20) + title);
        System.out.println("+".repeat(50) + "\n");
    }

    public abstract void displayMenu();


    public boolean validateCredentials(String email, String password) {
        return email.equals(this.email) && password.equals(this.password);
    }



    // ************************************************************ Setters &
    // Getters ************************************************************

    public static List<Customer> getCustomersCollection() {
        return customersCollection;
    }


}

