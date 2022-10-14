package ExceptionHandling.UserDefinedExceptions;

import java.util.Scanner;

public class BankApp extends Exception {

    public BankApp() {
        System.out.println("BankApp.BankApp()");
    }

    public BankApp(String message) {
        super(message);
    }

    public void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give inputs below");
        System.out.println("Enter Account number");
        int acno = scanner.nextInt();
        System.out.println("Enter Name");
        String name = scanner.next();
        System.out.println("Enter balance");
        double bal = scanner.nextDouble();
        scanner.close();
        if (bal < 1000) {
            try {
                BankApp bankApp = new BankApp("Please maintain minimum balance");
                throw bankApp;
            } catch (Exception e) {
                System.out.println("Exception " + e.getLocalizedMessage());
            }
        } else {
            System.out.println("Your Account balance is " + bal);
        }
    }
}
