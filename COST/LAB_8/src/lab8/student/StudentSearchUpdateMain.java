package lab8.student;

public class StudentSearchUpdateMain {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        
        // 1. Initial lookup query
        dao.findStudentById(1);
        
        // 2. Perform modification update
        dao.updateStudentMark(1, 95);
        
        // 3. Re-verify the mutated structural values
        dao.findStudentById(1);
    }
}
