package Question_2;
public class Vehicle {
    // Attributes
    private String vehicleNumber;
    protected String brand;

    // Constructor to initialize both values
    public Vehicle(String vehicleNumber, String brand) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
    }

    // Method to display vehicle information
    public void displayVehicleInfo() {
        System.out.println("Vehicle Number: " + vehicleNumber + " | Brand: " + brand);
    }

    // Method to calculate rental cost
    public double calculateRentalCost() {
        System.out.println("General vehicle rental cost calculation");
        return 0.0;
    }
}
    