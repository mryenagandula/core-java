package InnerClasses.AnonymousInnerClasses;

public class MainApp {

    public MainApp() {
        System.out.println("MainApp.MainApp()");
    }

    public static void main(String args[]) {
        ProjectApp projectApp = new ProjectApp() {
            @Override
            public void task1() {
                System.out.println("MainApp.main(...).new ProjectApp() {...}.task1()");
                System.out.println("Anonymous Inner class");
            }
        };

        projectApp.task1();
    }
}
