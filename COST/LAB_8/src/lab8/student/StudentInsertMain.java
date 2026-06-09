package lab8.student;

public class StudentInsertMain {
    public static void main(String[] args) {
        // Instantiate a student model block
        Student student = new Student(1, "Nimal Perera", 82);
        
        // Pass model reference into engine logic
        StudentDAO dao = new StudentDAO();
        dao.addStudent(student);
    }
}