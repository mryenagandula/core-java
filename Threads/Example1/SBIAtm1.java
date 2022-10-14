package Threads.Example1;

public class SBIAtm1 extends Thread {
    public SBIAtm1() {
        System.out.println("SBIAtm1.SBIAtm1()");
    }

    @Override
    public void run() {
        System.out.println("SBIAtm1.run()");
        task1();
    }

    public void task1() {
        System.out.println("SBIAtm1.task1()");
        System.out.println("Task1 is completed");
    }
}
