package Threads.Example1;

public class SBIAtm2 extends Thread {
    public SBIAtm2() {
        System.out.println("SBIAtm2.SBIAtm2()");
    }

    @Override
    public void run() {
        System.out.println("SBIAtm2.run()");
        task2();
    }

    public void task2() {
        System.out.println("SBIAtm2.task2()");
        System.out.println("Task2 is completed");
    }
}
