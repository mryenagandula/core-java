package OopsProject3;

public class WorkingWithSameMethodNames {

    private int a = 10;
    private int b = 20;

    public WorkingWithSameMethodNames() {
        System.out.println("WorkingWithSameMethodNames.WorkingWithSameMethodNames()");
    }

    public void task(int a, int b) {
        System.out.println("WorkingWithSameMethodNames.task()");
        System.out.println("value of a and b is " + a + " , " + b);
    }

    public void task() {
        System.out.println("WorkingWithSameMethodNames.task()");
        System.out.println("value of a and b is " + a + " , " + b);
    }

    public void task(int a) {
        System.out.println("WorkingWithSameMethodNames.task()");
        System.out.println("value of a and b is " + a + "," + b);
    }

    public void task(char c) {
        System.out.println("WorkingWithSameMethodNames.task()");
        System.out.println("value of a and b is " + a + " , " + b);
    }

    public void task(int a, int b, int c) {
        System.out.println("WorkingWithSameMethodNames.task()");
        System.out.println("value of a and b is " + a + " , " + b);
    }

    public static void main(int a, char b) {
        System.out.println("WorkingWithSameMethodNames.main()");
        System.out.println("value of a and b is " + a + "," + b);
    }
}
