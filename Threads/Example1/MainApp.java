package Threads.Example1;

public class MainApp {
    public MainApp() {
        System.out.println("MainApp.MainApp()");
    }

    public static void main(String args[]) {
        System.out.println("MainApp.main()");
        Thread thread1 = new SBIAtm1();
        Thread thread2 = new SBIAtm2();
        Thread thread3 = new SBIAtm3();

        /** Threads will be executed by ThreadSchedular by using run method */
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
