// A final class should not be inherited because it represents a complete,
// unchanging policy that shouldn't be modified or extended by subclasses
public final class UniversityPolicy {
    public static final String UNIVERSITY_NAME = "Tech University";
    public static final double BONUS_RATE = 0.10;  // 10% bonus
    
    public static void showPolicyHeader() {
        System.out.println("=== UNIVERSITY POLICY ===");
        System.out.println("All payments are processed on the 25th of each month.");
        System.out.println("A bonus of " + (BONUS_RATE * 100) + "% may be awarded for excellent performance.");
    }
    
    public static double calculateBonus(double monthlyPayment) {
        return monthlyPayment * BONUS_RATE;
    }
}
