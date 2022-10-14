package Packages.com.mypackage;

public class Test {
    private int a;

    public Test() {
        System.out.println("Test.Test()");
        a = 10;
    }

    public void task1() {
        System.out.println("Test.task1()");
        System.out.println("The value of a is " + a);
    }
}
