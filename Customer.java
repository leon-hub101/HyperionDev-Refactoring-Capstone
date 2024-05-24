import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Customer {
    // Customer class properties
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;
    private String customerAddress;
    private String customerCity;

    // Customer class constructor
    public Customer(String customerName, String customerEmail, String customerPhoneNumber, String customerAddress,
            String customerCity) {
        this.setCustomerName(customerName);
        this.setCustomerEmail(customerEmail);
        this.setCustomerPhoneNumber(customerPhoneNumber);
        this.setCustomerAddress(customerAddress);
        this.setCustomerCity(customerCity);
    }

    // Customer class methods
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    // Getinfo method renders important information about the customer class
    public String getInfo() {
        String output = "Customer: " + getCustomerName() + "\n";
        output += "Email: " + getCustomerEmail() + "\n";
        output += "Phone number: " + getCustomerPhoneNumber() + "\n";
        output += "Customer location: " + getCustomerCity() + "\n";

        return output;
    }

    // captureCustomerDetails method captures customer info from FoodQuick
    public static Customer captureCustomerDetais(Scanner scanner) {

        System.out.println("Enter customer name: ");
        String customerName = scanner.nextLine();

        String customerEmail;
        while (true) {
            System.out.println("Enter customer email: ");
            customerEmail = scanner.nextLine();
            if (isValidEmail(customerEmail)) {
                break;
            } else {
                System.out.println("Invalid email format. Please enter a valid email.");
            }
        }

        String customerPhoneNumber;
        while (true) {
            System.out.println("Enter customer phone number: ");
            customerPhoneNumber = scanner.nextLine();
            if (customerPhoneNumber.matches("\\d+")) {
                break;
            } else {
                System.out.println("Invalid phone number. Please enter digits only.");
            }
        }

        System.out.println("Enter customer address: ");
        String customerAddress = scanner.nextLine();

        System.out.println("Enter customer city: ");
        String customerCity = scanner.nextLine();

        return new Customer(customerName, customerEmail, customerPhoneNumber, customerAddress, customerCity);
    }

    private static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
