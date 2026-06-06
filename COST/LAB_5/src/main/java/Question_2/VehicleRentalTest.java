package Question_2;
public class VehicleRentalTest {
    public static void main(String[] args) {
        System.out.println("--- Vehicle Rental System Test ---\n");

        // Create objects and store them using Vehicle references (Runtime Polymorphism)
        Vehicle vehicle1 = new Car("WP-CAD-1234", "Toyota", 5, 4500.0);
        Vehicle vehicle2 = new Bike("WP-BCC-5678", "Yamaha", 6, 250.0);

        // Test Car execution
        System.out.println("[Testing Car Reference]");
        vehicle1.displayVehicleInfo();
        double carCost = vehicle1.calculateRentalCost();
        System.out.println("Calculated Car Rental Cost: Rs. " + carCost + "\n");

        // Test Bike execution
        System.out.println("[Testing Bike Reference]");
        vehicle2.displayVehicleInfo();
        double bikeCost = vehicle2.calculateRentalCost();
        System.out.println("Calculated Bike Rental Cost: Rs. " + bikeCost + "\n");

        /* * Why this is runtime polymorphism:
         * Even though both objects are declared under the parent reference type 'Vehicle', 
         * Java waits until runtime to determine the actual object type (Car or Bike) 
         * and dynamically invokes the corresponding overridden 'calculateRentalCost()' implementation.
         */
    }
}

    

