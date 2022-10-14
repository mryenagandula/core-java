package OopsProject5;

import java.util.Scanner;

public class OOPSTechnique5 {

    public OOPSTechnique5() {
        System.out.println("OOPSTechnique5.OOPSTechnique5()");
    }

    public static void main(String args[]) {
        System.out.println("OOPSTechnique5.main()");
        OOPSTechnique5 oTechnique5 = new OOPSTechnique5();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Details");

        System.out.print("Enter Employee Id: ");
        int eid = scanner.nextInt();

        System.out.print("Enter Employee Salary: ");
        double eSalary = scanner.nextDouble();

        System.out.print("Enter Employee Name: ");
        String eName = scanner.next();

        /* Creating object */
        Employee employee = new Employee(eid, eName, eSalary);
        employee.printEmployeeDetails();

        /** close scanner */
        scanner.close();

    }
}