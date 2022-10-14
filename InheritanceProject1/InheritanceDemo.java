package InheritanceProject1;

public class InheritanceDemo {
    public InheritanceDemo() {
        System.out.println("InheritanceDemo.InheritanceDemo()");
    }

    public static void main(String args[]) {
        System.out.println("InheritanceDemo.main()");
        CActive cActive = new CActive();
        cActive.task1();
        cActive.task2();
        cActive.task3();
    }
}
