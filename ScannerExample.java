import java.util.Scanner;

public class ScannerExample {
    public static void main(String... args) {
        int id;
        String name;
        double salary;
        String companyName;

        // creating scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Employee-Id");
        id = sc.nextInt();
        System.out.println("Please Enter Employee name");
        name = sc.next();
        System.out.println("Please Enter Company Name");
        companyName = sc.next();
        System.out.println("Please Enter Employee Salary");
        salary = sc.nextDouble();
        System.out.println("============= Employee Details ==============");
        System.out.println("Employee-Id : " + id);
        System.out.println("Employee-name : " + name);
        System.out.println("Employee Company : " + companyName);
        System.out.println("Employee-salary : " + salary);
        sc.close();// close scanner
    }
}