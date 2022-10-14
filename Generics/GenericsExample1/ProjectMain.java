package Generics.GenericsExample1;

public class ProjectMain {

    public ProjectMain() {
        System.out.println("ProjectMain.ProjectMain()");
    }

    public static void main(String... args) {
        DevApp1<Integer> devApp1 = new DevApp1<Integer>(10);
        System.out.println("ID :: " + devApp1.getId());

        DevApp1<String> devApp = new DevApp1<String>("25");
        System.out.println("ID :: " + devApp.getId());

        DevApp2<Integer, String> devApp2 = new DevApp2<Integer, String>(102, "Srikanth");
        System.out.println(devApp2);

        DevApp2<String, String> devApp22 = new DevApp2<String, String>("Raju", "Kumar");
        System.out.println(devApp22);
    }
}
