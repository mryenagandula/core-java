package OopsProject2;

import java.util.Scanner;

public class Employee {
    private int eid;
    private String eName;
    private String eCompany;
    private double eSalary;

    public Employee() {
        System.out.println("Employee.Employee()");
    }

    public void reading() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter employee details below");
        System.out.println("Employee Eid : ");
        this.eid = scanner.nextInt();
        System.out.println("Employee Name : ");
        this.eName = scanner.next();
        System.out.println("Employee Company : ");
        this.eCompany = scanner.next();
        System.out.println("Employee Salary : ");
        this.eSalary = scanner.nextDouble();
        scanner.close();
    }

    public void details() {
        System.out.println("Entered Employee Details");
        System.out.println("Employee Id: " + this.eid);
        System.out.println("Employee Name: " + this.eName);
        System.out.println("Employee Company: " + this.eCompany);
        System.out.println("Employee Salary: " + this.eSalary);
    }
}
