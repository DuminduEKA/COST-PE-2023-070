package Question_2;
public class Car extends Vehicle {
    // Private attributes
    private int numberOfDays;
    private double dailyRate;

    // Constructor using super(...)
    public Car(String vehicleNumber, String brand, int numberOfDays, double dailyRate) {
        super(vehicleNumber, brand);
        this.numberOfDays = numberOfDays;
        this.dailyRate = dailyRate;
    }

    // Override calculateRentalCost()
    @Override
    public double calculateRentalCost() {
        super.calculateRentalCost(); // Call parent method first
        return numberOfDays * dailyRate;
    }
}