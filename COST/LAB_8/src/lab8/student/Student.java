package lab8.student;

public class Student {
    private int studentId;
    private String studentName;
    private int mark;

    // Constructor
    public Student(int studentId, String studentName, int mark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mark = mark;
    }

    // Getters
    public int getStudentId() { 
        return studentId; 
    }

    public String getStudentName() { 
        return studentName; 
    }

    public int getMark() { 
        return mark; 
    }
}