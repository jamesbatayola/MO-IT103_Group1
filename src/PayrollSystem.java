import java.util.Date;
import java.util.List;

public class PayrollSystem {

    //Fields
    private List<Employee> employees;
    private Date payrollPeriod;
    private String paymentMethod;
    private double taxInformation;
    private double deductionInformation;
    private String reportConfiguration;
    private String systemSettings;
    private boolean PayrollProcessed;
    private String payrollHistory;

    //Methods
    public void addEmployee() {};
    public void removeEmployee() {};
    public String getPayrollHistory() { return payrollHistory; };
    public boolean isPayrollProcessed() { return true; };
    public void setReportConfiguration() {};
    public void setPaymentMethod() {};
    public Employee getEmployee(int id) { return employees.get(id); };
    public double calculateTotalPayroll() { return 0.0; };
    public void generatePayrollReport() {};
    public void setPayrollPeriod() {};
    public void processPayroll() {};

}

