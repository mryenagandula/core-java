package FinalClasses;

public final class ProjectSubClass implements ProjectApp {

    public ProjectSubClass() {
        System.out.println("ProjectSubClass.ProjectSubClass()");
    }

    @Override
    public void task1() {
        System.out.println("ProjectSubClass.task1()");
    }

}
