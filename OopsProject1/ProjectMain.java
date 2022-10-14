package OopsProject1;

public class ProjectMain {

    public static void main(String args[]) {
        System.out.println("------------------------------------------");
        /** object creation for App1 */
        App1 app1 = new App1();
        app1.task1();
        System.out.println("------------------------------------------");

        /** object creation for App2 */
        App2 app2 = new App2();
        app2.task2();
        System.out.println("------------------------------------------");

        /** object creation for App3 */
        App3 app3 = new App3();
        app3.task3();
        System.out.println("------------------------------------------");
    }
}