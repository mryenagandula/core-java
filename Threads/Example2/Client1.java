package Threads.Example2;

public class Client1 extends Thread {
    public Client1() {
        System.out.println("Client1.Client1()");
    }

    @Override
    public void run() {
        System.out.println("Client1.run()");
        System.out.println("Client #1 is running.....");
    }
}
