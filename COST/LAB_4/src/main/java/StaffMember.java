// StaffMember is abstract because it represents a general concept
// and should not be instantiated directly. Only specific staff types can be created.
public abstract class StaffMember {
    private String fullName;
    private final String staffId;  
    protected String department;   
    
    private static int staffCount = 0;  
    
    public StaffMember(String fullName, String staffId, String department) {
        this.fullName = fullName;
        this.staffId = staffId;
        this.department = department;
        staffCount++;  
    }
    
    // Getter methods
    public String getFullName() {
        return fullName;
    }
    
    public String getStaffId() {
        return staffId;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void changeDepartment(String newDepartment) {
        if (newDepartment != null && !newDepartment.isEmpty()) {
            this.department = newDepartment;
        }
    }
    
    public final void displayBasicDetails() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
    }
    
    public final void showCommonNotice() {
        System.out.println("Notice: All staff must attend the monthly meeting on Friday at 10 AM.");
    }
    
    public abstract double calculateMonthlyPayment();
    
    public static void showSystemName() {
        System.out.println("=== University Staff Payment System ===");
    }
    
    public static int getStaffCount() {
        return staffCount;
    }
}