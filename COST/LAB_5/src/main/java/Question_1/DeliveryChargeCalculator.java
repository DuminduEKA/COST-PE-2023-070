package Question_1;

public class DeliveryChargeCalculator {

    // Part A: Calculate charge using only base charge
    public double calculateCharge(double baseCharge) {
        return baseCharge;
    }

    // Part A: Calculate charge using base charge and distance
    public double calculateCharge(double baseCharge, double distanceKm) {
        double distanceCharge = distanceKm * 100.0;
        return baseCharge + distanceCharge;
    }

    // Part B: Calculate charge using base charge, distance, and weight
    public double calculateCharge(double baseCharge, double distanceKm, double weightKg) {
        double distanceCharge = distanceKm * 100.0; 
        double weightCharge = weightKg * 50.0;      
        return baseCharge + distanceCharge + weightCharge;
    }

    // Part B: Calculate charge using base charge and express delivery status
    public double calculateCharge(double baseCharge, boolean expressDelivery) {
        if (expressDelivery) {
            return baseCharge + 500.0; 
        }
        return baseCharge;
    }
}