package OopsProject5;

public class Employee {

    private int eid;
    private String eName;
    private double eSalary;
    public final static String COMPANY_NAME = "TCS";

    public Employee() {
        System.out.println("Employee.Employee()");
    }

    public Employee(int eid, String eName, double eSalary) {
        System.out.println("Employee.Employee()");
        this.eid = eid;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    public void printEmployeeDetails() {
        System.out.println("Employee Details");
        System.out.println("Employee Id : " + eid);
        System.out.println("Employee Name : " + eName);
        System.out.println("Employee Salary : " + eSalary);
        System.out.println("Employee Company : " + COMPANY_NAME);
    }

    public static void change(String companyName) {
        /*
         * Throwing erro like The final field Employee.COMPANY_NAME cannot be assigned
         */
        // COMPANY_NAME =companyName;
    }
}
