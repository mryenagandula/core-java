public class SecondJavaApp {
    int empId;
    String empName;
    Double empSalary;

    public SecondJavaApp(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        System.out.println("SecondJavaApp.SecondJavaApp()");
    }

    public void printEmployeeDetails() {
        System.out.println("==================================");
        System.out.println("Employee Id  : " + this.empId);
        System.out.println("Employee Name : " + this.empName);
        System.out.println("Employee Salary : " + this.empSalary);
        System.out.println("==================================");
    }

    public static void main(String args[]) {
        SecondJavaApp secondJavaApp = new SecondJavaApp(504, "Srikanth Y", 50000);
        secondJavaApp.printEmployeeDetails();

    }
}