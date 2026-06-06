package Question_4;
public class Member {
    private String memberName;
    private String membershipType;
    private boolean newsletterSelected;
    private int numberOfMonths;

    public Member(String memberName, String membershipType, boolean newsletterSelected, int numberOfMonths) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.newsletterSelected = newsletterSelected;
        this.numberOfMonths = numberOfMonths;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public String getNewsletterText() {
        return newsletterSelected ? "Yes" : "No";
    }

    public double getMonthlyFee() {
        if (membershipType.equals("Premium")) {
            return 2500.0;
        } else {
            return 1000.0; // Regular membership
        }
    }

    public double getMembershipFee() {
        double totalFee = this.getMonthlyFee() * numberOfMonths;
        if (newsletterSelected) {
            totalFee += 200;
        }
        return totalFee;
    }
}