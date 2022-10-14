package AbstractClassAndAbstractMethod.Example1;

public abstract class ProjectApp {
    public ProjectApp() {
        System.out.println("ProjectApp.ProjectApp()");
    }

    /*
     * Implementation for concrete/instance method (Optional)
     */
    public void task1() {
        System.out.println("ProjectApp.task1()");
        System.out.println("task1() completed.");
    }

    /*
     * Empty method waiting for implementation.
     */
    public abstract void task2();
}
