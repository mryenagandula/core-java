package AbstractClassAndAbstractMethod.Example1;

public class DevApp extends ProjectApp {

    public DevApp() {
        System.out.println("DevApp.DevApp()");
    }

    /**
     * Implementation for concrete method / instance method (Optional)
     */
    @Override
    public void task1() {
        System.out.println("DevApp.task1()");
        System.out.println("Task 1 is completed");
    }

    /**
     * Implementation for abstract method (Mandatory)
     */
    @Override
    public void task2() {
        System.out.println("DevApp.task2()");
        System.out.println("Task 2 is completed");
    }

}
