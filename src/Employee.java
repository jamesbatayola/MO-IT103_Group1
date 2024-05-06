public class Employee {

    //Fields
    private String employeeName;
    private int employeeID;
    private String userName;
    private String password;
    private String position;
    private double hoursWorked;
    private double taxRate;
    private double deductions;
    private String paymentMethod;
    private boolean isLoggedIn;

    // Methods
    public boolean signIn() { return true; };
    public void printEmployeeDetails() {};
    public void updateEmployeeInfo() {};
    public double calculateNetPay() { return 0.0; };
    public void setPassword() {};
    public String getPassword() { return null; };
    public void setUserName() {};
    public String getUserName() { return null; };
    public void generatePayslip() {};
    public void recordLeave() {};
    public void recordTimeSheet() {};
    public void timeOut() {};
    public void timeIn() {};
    public boolean resetPassword() { return true; }
    public void logOut() {};

}