package InnerClasses.NormalInnerClasses;

public class OuterClass {
    public OuterClass() {
        System.out.println("OuterClass.OuterClass()");
    }

    public void task1() {
        System.out.println("OuterClass.task1()");
    }

    /** Here static block is mandatory to create inner class */
    static class Inner {
        public void task2() {
            System.out.println("OuterClass.Inner.task2()");
        }
    }
}
