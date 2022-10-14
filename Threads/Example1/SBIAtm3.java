package Threads.Example1;

public class SBIAtm3 extends Thread {
    public SBIAtm3() {
        System.out.println("SBIAtm3.SBIAtm3()");
    }

    @Override
    public void run() {
        System.out.println("SBIAtm3.run()");
        task3();
    }

    public void task3() {
        System.out.println("SBIAtm3.task3()");
        System.out.println("Task3 is completed.");
    }
}
