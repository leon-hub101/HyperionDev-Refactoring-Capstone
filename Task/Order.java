import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Order {
    // Order class properties
    private int orderNum;
    private String mealName;
    private int mealQuantity;
    private double mealPrice;
    private String prepInstructions;

    // Order class constructor
    public Order(int orderNum, String mealName, int mealQuantity, double mealPrice, String prepInstructions) {
        this.setOrderNum(orderNum);
        this.setMealName(mealName);
        this.setMealQuantity(mealQuantity);
        this.setMealPrice(mealPrice);
        this.setPrepInstructions(prepInstructions);
    }

    // Order class methods
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealQuantity(int mealQuantity) {
        this.mealQuantity = mealQuantity;
    }

    public int getMealQuantity() {
        return mealQuantity;
    }

    public void setMealPrice(double mealPrice) {
        this.mealPrice = mealPrice;
    }

    public double getMealPrice() {
        return mealPrice;
    }

    public void setPrepInstructions(String prepInstructions) {
        this.prepInstructions = prepInstructions;
    }

    public String getPrepInstructions() {
        return prepInstructions;
    }

    public double getTotalPrice() {
        double totalPrice = mealPrice * mealQuantity;
        // Round to 2 decimal places
        BigDecimal bd = new BigDecimal(Double.toString(totalPrice));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    // Getinfo method renders important information about the order class
    String getInfo() {
        String output = getMealQuantity() + " x " + getMealName() + "(" + getMealPrice() + ")\n";
        output += "Special instructions: " + getPrepInstructions() + "\n";
        output += "Total price: " + getTotalPrice() + "\n";

        return output;
    }

    public static Order captureOrderDetails(Scanner scanner) {
        int orderNum = 0;
        while (true) {
            try {
                System.out.println("Enter the order number: ");
                orderNum = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid order number.");
            }
        }

        System.out.println("Enter the meal name: ");
        String mealName = scanner.nextLine();

        int mealQuantity = 0;
        while (true) {
            try {
                System.out.println("How many of this meal was ordered? ");
                mealQuantity = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for meal quantity.");
            }
        }

        double mealPrice = 0;
        while (true) {
            try {
                System.out.println("Enter the price for this meal: ");
                mealPrice = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid price.");
            }
        }

        System.out.println("Please enter any special instructions for the meal: ");
        String prepInstructions = scanner.nextLine();

        return new Order(orderNum, mealName, mealQuantity, mealPrice, prepInstructions);
    }
}