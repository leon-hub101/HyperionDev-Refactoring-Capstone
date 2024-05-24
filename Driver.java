public class Driver {
    // Driver properties
    private String name;
    private String location;
    private int deliveryLoad;
    private int allocatedOrderNum;

    // Driver constructor
    public Driver(String name, String location, int deliveryLoad, int allocatedOrderNum) {
        this.setName(name);
        this.setLocation(location);
        this.setDeliveryLoad(deliveryLoad);
        this.setAllocatedOrderNum(allocatedOrderNum);
    }

    // Driver class methods
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setDeliveryLoad(int deliveryLoad) {
        this.deliveryLoad = deliveryLoad;
    }

    public int getDeliveryLoad() {
        return deliveryLoad;
    }

    public void setAllocatedOrderNum(int allocatedOrderNum) {
        this.allocatedOrderNum = allocatedOrderNum;
    }

    public int getAllocatedOrderNum() {
        return allocatedOrderNum;
    }

    public void updateNumOfDeliveries(int additionalDeliveries) {
        this.deliveryLoad += additionalDeliveries;
    }

    // Getinfo method renders important information about the driver class
    public String getInfo() {
        String output = "Driver name: " + getName() + "\n";
        output += "Driver location: " + getLocation() + "\n";
        output += "Driver delivery load: " + getDeliveryLoad() + "\n";

        return output;
    }
}