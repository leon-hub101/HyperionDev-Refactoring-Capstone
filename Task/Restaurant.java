import java.util.Scanner;

public class Restaurant {
    // Properties of the restaurant class
    private String restaurantName;
    private String restaurantCity;
    private int restaurantNumber;

    // Constructor for the restaurant class
    public Restaurant(String restaurantName, String restaurantCity, int restaurantNumber) {
        this.setName(restaurantName);
        this.setCity(restaurantCity);
        this.setNumber(restaurantNumber);
    }

    // Methods for the retaurant class
    public void setName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getName() {
        return restaurantName;
    }

    public void setCity(String restaurantCity) {
        this.restaurantCity = restaurantCity;
    }

    public String getCity() {
        return restaurantCity;
    }

    public void setNumber(int restaurantNumber) {
        this.restaurantNumber = restaurantNumber;
    }

    public int getNumber() {
        return restaurantNumber;
    }

    // Getinfo method renders important information about the restaurant class
    public String getInfo() {
        String output = "Name: " + getName() + "\n";
        output += "City: " + getCity() + "\n";
        output += "To contact the restaurant, please call them on: " + getNumber() + "\n";

        return output;
    }

    // Method to capture restaurant details
    public static Restaurant captureRestaurantDetails(Scanner scanner) {
        System.out.println("Enter restaurant name: ");
        String restaurantName = scanner.nextLine();
        System.out.println("Enter restaurant city: ");
        String restaurantCity = scanner.nextLine();
        System.out.println("Enter restaurant phone number: ");
        int restaurantNumber = Integer.parseInt(scanner.nextLine());

        // Create and return a restaurant object
        return new Restaurant(restaurantName, restaurantCity, restaurantNumber);
    }
}