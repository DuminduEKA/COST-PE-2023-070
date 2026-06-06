package Question_1;

public class DeliveryChargeTest {
    public static void main(String[] args) {
        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        System.out.println("--- Delivery Charge Test Results ---");
        
        double test1 = calculator.calculateCharge(250.0);
        System.out.println("Base Charge Only: Rs. " + test1);

        double test2 = calculator.calculateCharge(250.0, 5.5);
        System.out.println("Base Charge + Distance (5.5 km): Rs. " + test2);

        double test3 = calculator.calculateCharge(250.0, 10.0, 3.0);
        System.out.println("Base Charge + Distance (10.0 km) + Weight (3.0 kg): Rs. " + test3);

        double test4 = calculator.calculateCharge(250.0, true);
        System.out.println("Base Charge + Express Delivery (True): Rs. " + test4);
        
        /* * Why this is compile time polymorphism:
         * This is compile time polymorphism (method overloading) because all methods share the same name 
         * but have different parameter signatures. The compiler binds the method calls to their specific 
         * definitions at compile time based purely on the arguments passed.
         */
    }
}