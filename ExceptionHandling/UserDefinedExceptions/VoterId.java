package ExceptionHandling.UserDefinedExceptions;

import java.util.Scanner;

public class VoterId extends Exception {

    public VoterId() {
        System.out.println("VoterId.VoterId()");
    }

    public VoterId(String exceptionMessage) {
        super(exceptionMessage);
    }

    public void task1() {
        int age;
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter inputs");
        System.out.println("Enter Age");
        age = scanner.nextInt();
        System.out.println("Enter Name");
        name = scanner.next();
        scanner.close();
        if (age <= 18) {
            try {
                VoterId v = new VoterId(name + " not eligible for voting.");
                throw v;
            } catch (Exception e) {
                System.out.println("Exception" + e.getLocalizedMessage());
            }
        } else {
            System.out.println(name + " eligible for voting.");
        }
        scanner.close();
    }
}
