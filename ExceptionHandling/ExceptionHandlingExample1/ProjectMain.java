package ExceptionHandling.ExceptionHandlingExample1;

public class ProjectMain {

    public ProjectMain() {
        System.out.println("ProjectMain.ProjectMain()");
    }

    public static void main(String args[]) {
        System.out.println("ProjectMain.main()");
        ProjectApp projectApp = new ProjectAppImpl();
        projectApp.task1();
    }
}
