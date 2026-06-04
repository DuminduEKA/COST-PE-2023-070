package Question_1;
public class StudentAverageCalculator {private int totalMarks;
    private int numberOfStudents;

    public StudentAverageCalculator(int totalMarks, int numberOfStudents) {
        this.totalMarks = totalMarks;
        this.numberOfStudents = numberOfStudents;
    }

    public int calculateAverage() {
        // Part C: ArithmeticException occurs here because dividing an integer 
        // by zero is mathematically undefined in Java.
        return totalMarks / numberOfStudents;
    }
    
}
