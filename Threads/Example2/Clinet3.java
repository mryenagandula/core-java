package Threads.Example2;

public class Clinet3 extends Thread {

    public Clinet3() {
        System.out.println("Clinet3.Clinet3()");
    }

    @Override
    public void run() {
        System.out.println("Clinet3.run()");
        System.out.println("Client 3 is running ....");
    }
}
