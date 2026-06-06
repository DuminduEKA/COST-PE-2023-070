public class Lab04Main {
    public static void main(String[] args) {
        System.out.println("=" .repeat(60));
        
        // Question 5: Call static method from parent class
        StaffMember.showSystemName();
        
        System.out.println("-".repeat(60));
        
        // Question 4: Call university policy methods
        UniversityPolicy.showPolicyHeader();
        System.out.println("University: " + UniversityPolicy.UNIVERSITY_NAME);
        
        System.out.println("-".repeat(60));
        
        // Question 5 & 6: Create exactly 3 staff objects total
        // 2 Lecturer objects and 1 LabAssistant object
        Lecturer lecturer1 = new Lecturer("Dr. saman perera", "LEC001", 
                                          "Computer Science", 4, 1500.0);
        Lecturer lecturer2 = new Lecturer("Prof. kamal dias", "LEC002", 
                                          "Mathematics", 3, 1800.0);
        LabAssistant assistant1 = new LabAssistant("sunil fdo", "LAB001", 
                                                   "Computer Science", 120, 25.0);
        
        // Question 6: Change department of one object using controlled update
        System.out.println("\n--- Before Department Change ---");
        System.out.println("Lecturer 1 Department: " + lecturer1.getDepartment());
        
        lecturer1.changeDepartment("Software Engineering");
        
        System.out.println("\n--- After Department Change ---");
        System.out.println("Lecturer 1 Department: " + lecturer1.getDepartment());
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("STAFF MEMBER DETAILS");
        System.out.println("=".repeat(60));
        
        // Display all 3 staff members
        System.out.println("\n--- LECTURER 1 ---");
        lecturer1.displayLecturerDetails();
        
        System.out.println("\n--- LECTURER 2 ---");
        lecturer2.displayLecturerDetails();
        
        System.out.println("\n--- LAB ASSISTANT ---");
        assistant1.displayLabAssistantDetails();
        
        System.out.println("\n" + "=".repeat(60));
        
        // Question 6: Print monthly payment of all 3
        System.out.println("MONTHLY PAYMENTS");
        System.out.println("=".repeat(60));
        System.out.println("Lecturer 1 (saman perera): " + lecturer1.calculateMonthlyPayment());
        System.out.println("Lecturer 2 (kamal dias): " + lecturer2.calculateMonthlyPayment());
        System.out.println("Lab Assistant (sunil fdo): " + assistant1.calculateMonthlyPayment());
        
        // Question 6: Print total monthly payment
        double totalPayment = lecturer1.calculateMonthlyPayment() + 
                              lecturer2.calculateMonthlyPayment() + 
                              assistant1.calculateMonthlyPayment();
        System.out.println("\nTotal Monthly Payment: " + totalPayment);
        
        // Question 4: Calculate bonus estimates
        System.out.println("\n" + "=".repeat(60));
        System.out.println("BONUS ESTIMATES");
        System.out.println("=".repeat(60));
        System.out.println("Lecturer 1 Bonus: " + UniversityPolicy.calculateBonus(lecturer1.calculateMonthlyPayment()));
        System.out.println("Lecturer 2 Bonus: " + UniversityPolicy.calculateBonus(lecturer2.calculateMonthlyPayment()));
        System.out.println("Lab Assistant Bonus: " + UniversityPolicy.calculateBonus(assistant1.calculateMonthlyPayment()));
        
        // Question 5 & 6: Print total number of created staff objects
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Total Staff Objects Created: " + StaffMember.getStaffCount());
        
        // Question 6: Call showCommonNotice() for all 3
        System.out.println("\n" + "=".repeat(60));
        System.out.println("COMMON NOTICES");
        System.out.println("=".repeat(60));
        System.out.print("Lecturer 1: ");
        lecturer1.showCommonNotice();
        System.out.print("Lecturer 2: ");
        lecturer2.showCommonNotice();
        System.out.print("Lab Assistant: ");
        assistant1.showCommonNotice();
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Program Completed Successfully!");
    }
}
