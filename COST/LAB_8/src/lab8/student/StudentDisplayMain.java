package lab8.student;

public class StudentDisplayMain {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        
        // Add more records to satisfy Part A data requirements
        dao.addStudent(new Student(2, "Kamal Silva", 74));
        dao.addStudent(new Student(3, "Sunethra Fernando", 91));
        
        // Run select queries to display active collection status
        dao.displayAllStudents();
    }
}
