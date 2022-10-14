package AbstractClassAndAbstractMethod.Example1;

public class ClientApp {
    public ClientApp() {
        System.out.println("ClientApp.ClientApp()");
    }

    public static void main(String args[]) {
        System.out.println("ClientApp.main()");
        ProjectApp projectApp = new DevApp();
        projectApp.task1();
        projectApp.task2();

    }
}
