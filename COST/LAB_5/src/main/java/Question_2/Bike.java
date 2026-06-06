package Question_2;
public class Bike extends Vehicle {
    // Private attributes
    private int numberOfHours;
    private double hourlyRate;

    // Constructor using super(...)
    public Bike(String vehicleNumber, String brand, int numberOfHours, double hourlyRate) {
        super(vehicleNumber, brand);
        this.numberOfHours = numberOfHours;
        this.hourlyRate = hourlyRate;
    }

    // Override calculateRentalCost()
    @Override
    public double calculateRentalCost() {
        super.calculateRentalCost(); // Call parent method first
        return numberOfHours * hourlyRate;
    }
}
    

