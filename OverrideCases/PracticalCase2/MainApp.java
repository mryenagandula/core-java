package OverrideCases.PracticalCase2;

public class MainApp {
    public MainApp() {
        System.out.println("MainApp.MainApp()");
    }

    public static void main(String args[]) {
        System.out.println("MainApp.main()");
        /**
         * We can update the method implementation by using overiding class
         * In that way we can able use different methods in deferent situations
         */
        /**
         * Here am creating DevApp1 object with shared memory.
         */
        ProjectApp projectApp1 = new DevApp1();
        projectApp1.task(7);

        /**
         * Here am creating DevApp2 object with shared memory.
         */
        ProjectApp projectApp2 = new DevApp2();
        projectApp2.task(5);

    }
}
