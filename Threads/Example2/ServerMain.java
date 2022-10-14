package Threads.Example2;

public class ServerMain {

    public ServerMain() {
        System.out.println("ServerMain.ServerMain()");
    }

    public static void main(String[] args) {
        System.out.println("ServerMain.main()");
        Thread thread1 = new Client1();
        Thread thread2 = new Client2();
        Thread thread3 = new Clinet3();

        synchronized (thread1) {
            try {
                Client1.sleep(8000);
                thread1.start();
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
        }

        synchronized (thread2) {
            try {
                Client2.sleep(10000);
                thread2.start();
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
        }

        synchronized (thread3) {
            try {
                Clinet3.sleep(12000);
                thread3.start();
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
    }
}
