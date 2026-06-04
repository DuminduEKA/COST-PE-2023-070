package Question_1;
public class StudentAverageTest {public static void main(String[] args) {
        StudentAverageCalculator calculator = new StudentAverageCalculator(450, 0);

        try {
            int average = calculator.calculateAverage();
            System.out.println("Average Mark: " + average);
        } catch (ArithmeticException e) {
            System.out.println("Error: Number of students cannot be zero.");
        } finally {
            System.out.println("Average calculation completed.");
        }

        System.out.println("Program continues...");
    }
    
}
