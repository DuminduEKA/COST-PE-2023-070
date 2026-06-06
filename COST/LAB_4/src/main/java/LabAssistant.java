// department can be used inside the child class because it is declared as protected
// in the parent class, which allows access to subclasses
public class LabAssistant extends StaffMember {
    private double hoursWorked;
    private double hourlyRate;
    
    public LabAssistant(String fullName, String staffId, String department,
                        double hoursWorked, double hourlyRate) {
        super(fullName, staffId, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    
    @Override
    public double calculateMonthlyPayment() {
        return hoursWorked * hourlyRate;
    }
    
    public void displayLabAssistantDetails() {
        displayBasicDetails();  // call inherited method first
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Monthly Payment: " + calculateMonthlyPayment());
    }
}