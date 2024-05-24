import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Capture Customer, Restaurant and Order information
        Customer customer = Customer.captureCustomerDetais(scanner);
        System.out.println(customer);

        Restaurant restaurant = Restaurant.captureRestaurantDetails(scanner);
        System.out.println(restaurant);

        Order order = Order.captureOrderDetails(scanner);
        System.out.println(order);

        scanner.close();
        
        // Printing Customer, Restaurant and Order information
        String customerInfo = customer.getInfo();
        System.out.println("\nCustomer information\n" + customerInfo);

        String restaurantInfo = restaurant.getInfo();
        System.out.println("\nRestaurant Information\n" + restaurantInfo);

        String orderInfo = order.getInfo();
        System.out.println("\nOrder Information\n" + orderInfo);

        // Capturing Driver details
        // Create a list to hold all drivers
        ArrayList<Driver> drivers = new ArrayList<>();
        try {
            Scanner fileScanner = new Scanner(new File("drivers.txt"));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(", ");
                if (parts.length == 3) {
                    String name = parts[0];
                    String location = parts[1];
                    int load = Integer.parseInt(parts[2].trim());
                    drivers.add(new Driver(name, location, load, 0));
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        // Functionality to find the driver in the same city with the lowest delivery
        // load
        Driver selectedDriver = findDriverWithLowestLoad(drivers, restaurant.getCity());
        if (selectedDriver != null) {
            System.out.println("This order will be delivered by: " + selectedDriver.getName());
            selectedDriver.setAllocatedOrderNum(order.getOrderNum());
            selectedDriver.updateNumOfDeliveries(1);
        } else {
            System.out.println("No available drivers in the restaurant city.");
        }

        scanner.close();
    }

    public static Driver findDriverWithLowestLoad(ArrayList<Driver> drivers, String city) {
        Driver lowestLoadDriver = null;
        for (Driver driver : drivers) {
            if (driver.getLocation().equals(city)) {
                if (lowestLoadDriver == null || driver.getDeliveryLoad() < lowestLoadDriver.getDeliveryLoad()) {
                    lowestLoadDriver = driver;
                }
            }
        }
        return lowestLoadDriver;
    }
}