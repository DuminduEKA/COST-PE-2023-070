package Question_3;
public class StudentMarkReport {
    private String[] marks;
    
    // Constructor to initialize the array
    public StudentMarkReport(String[] marks) {
        this.marks = marks;
    }
    
    public int getMarkAt(int index) {
        String selectedMark = marks[index];
        return Integer.parseInt(selectedMark);
    }
}
