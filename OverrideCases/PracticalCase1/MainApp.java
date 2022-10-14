package OverrideCases.PracticalCase1;

public class MainApp {
    public MainApp() {
        System.out.println("MainApp.MainApp()");
    }

    public static void main(String args[]) {
        System.out.println("MainApp.main()");
        ProjectApp projectApp = new DevApp();
        projectApp.task(3);
    }

}