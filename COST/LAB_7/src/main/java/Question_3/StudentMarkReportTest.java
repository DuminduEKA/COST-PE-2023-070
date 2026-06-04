package Question_3;
public class StudentMarkReportTest {
    public static void main(String[] args) {
        String[] marks = {"78", "82", "absent", "90"};
        StudentMarkReport report = new StudentMarkReport(marks);
        
        // Test 1: Invalid array index 
        try {
            int mark = report.getMarkAt(6);
            System.out.println("Mark at index 6: " + mark);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Selected mark position does not exist.");
        } finally {
            System.out.println("Array access checking completed.");
        }
        
        System.out.println();
        
        // Test 2: Invalid number format
        try {
            int mark = report.getMarkAt(2);
            System.out.println("Mark at index 2: " + mark);
        } catch (NumberFormatException e) {
            System.out.println("Error: Selected mark is not a valid number.");
        } finally {
            System.out.println("Number conversion checking completed.");
        }
        
        System.out.println();
        System.out.println("Report checking completed.");
    }
}

