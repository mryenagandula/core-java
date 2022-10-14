package Threads.Example2;

public class Client2 extends Thread {

    public Client2() {
        System.out.println("Client2.Client2()");
    }

    @Override
    public void run() {
        System.out.println("Client2.run()");
        System.out.println("Client #2 is running....");
    }
}
