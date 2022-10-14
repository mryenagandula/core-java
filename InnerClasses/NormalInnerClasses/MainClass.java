package InnerClasses.NormalInnerClasses;

public class MainClass {
    public MainClass() {
        System.out.println("MainClass.MainClass()");
    }

    public static void main(String args[]) {
        OuterClass outerClass = new OuterClass();
        outerClass.task1();

        OuterClass.Inner inner = new OuterClass.Inner();
        inner.task2();
    }
}
