package Interfaces.Example1;

public class ClientApp {
    public ClientApp() {
        System.out.println("ClientApp.ClientApp()");
    }

    public static void main(String args[]) {
        System.out.println("ClientApp.main()");
        ProjectApp projectApp = new DevApp();
        projectApp.task1();
        projectApp.task2();

        ProjectApp2 projectApp2 = new DevApp();
        projectApp2.task3();
        projectApp2.task4();

        DevApp devApp = new DevApp();
        devApp.task1();
        devApp.task2();
        devApp.task3();
        devApp.task4();
    }
}
