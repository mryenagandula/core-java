package ExceptionHandling.ExceptionHandlingExample1;

import java.util.Scanner;

public class ProjectAppImpl implements ProjectApp {

    public ProjectAppImpl() {
        System.out.println("ProjectAppImpl.ProjectAppImpl()");
    }

    @Override
    public void task1() {
        System.out.println("ProjectAppImpl.task1()");
        int a;
        int b;
        int c;
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the outputs");
        System.out.println("Enter a value :");
        a = scanner.nextInt();
        System.out.println("Enter b value :");
        b = scanner.nextInt();
        System.out.println("Enter c value :");
        c = scanner.nextInt();
        scanner.close();
        try {
            result = (a + b) / c;
            System.out.println("Result is " + result);
        } catch (Exception e) {
            System.out.println("Exception Details");
            System.out.println(e.toString());
            System.out.println(e.getClass());
            System.out.println(e.getLocalizedMessage());
        } finally {
            System.out.println("Exception closed");
            System.out.println("Completed");
        }

    }
}
