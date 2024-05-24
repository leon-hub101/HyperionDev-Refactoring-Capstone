# HyperionDev-Refactoring-Capstone

## Overview

This repository contains a Java program designed for managing a food delivery system. The program captures and displays information about customers, restaurants, orders, and delivery drivers. It also includes functionality to select the driver with the lowest delivery load in a specific city.

## Features

1. **Customer Information Capture**: Allows input of customer details and validates email and phone number formats.
2. **Restaurant Information Capture**: Allows input of restaurant details.
3. **Order Information Capture**: Allows input of order details, including meal quantity and special preparation instructions.
4. **Driver Information Capture**: Reads driver details from a file and selects the driver with the lowest delivery load for a specific city.
5. **Data Display**: Outputs captured details for customers, restaurants, orders, and drivers.

## Classes

### 1. Main
- Entry point for the program.
- Captures customer, restaurant, and order details.
- Reads driver details from a file and selects the driver with the lowest delivery load in the restaurant's city.

### 2. Customer
- Captures and stores customer details.
- Validates email and phone number formats.

### 3. Driver
- Stores driver details and manages their delivery load.
- Updates the number of deliveries assigned to a driver.

### 4. Order
- Captures and stores order details.
- Calculates the total price of an order.

### 5. Restaurant
- Captures and stores restaurant details.

## How to Run

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/HyperionDev-Refactoring-Capstone.git
   cd HyperionDev-Refactoring-Capstone
   ```

2. **Compile the Java Files**:
   ```bash
   javac Main.java Customer.java Driver.java Order.java Restaurant.java
   ```

3. **Run the Program**:
   ```bash
   java Main
   ```

4. **Input Details**: Follow the prompts to input customer, restaurant, and order details. Ensure that a file named `drivers.txt` exists in the same directory, containing driver details in the format: `name, location, load`.

## drivers.txt Format
```
John Doe, CityName, 3
Jane Smith, CityName, 2
Bob Johnson, AnotherCity, 5
```

## Example Usage

1. **Customer Details**:
   ```
   Enter customer name: John Doe
   Enter customer email: john.doe@example.com
   Enter customer phone number: 1234567890
   Enter customer address: 123 Main St
   Enter customer city: CityName
   ```

2. **Restaurant Details**:
   ```
   Enter restaurant name: Food Palace
   Enter restaurant city: CityName
   Enter restaurant phone number: 9876543210
   ```

3. **Order Details**:
   ```
   Enter the order number: 1
   Enter the meal name: Burger
   How many of this meal was ordered? 2
   Enter the price for this meal: 5.99
   Please enter any special instructions for the meal: Extra cheese
   ```

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any enhancements or bug fixes.

## Contact

For questions or comments, please contact [yourname](mailto:your.email@example.com).

---

Feel free to modify the content to better suit your project or preferences.
