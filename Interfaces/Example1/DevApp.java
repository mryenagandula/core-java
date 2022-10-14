package Interfaces.Example1;

public class DevApp implements ProjectApp, ProjectApp2 {

    public DevApp() {
        System.out.println("DevApp.DevApp()");
    }

    @Override
    public void task1() {
        System.out.println("DevApp.task1()");
        System.out.println("task1() - value of a is " + a);

    }

    @Override
    public void task2() {
        System.out.println("DevApp.task2()");
        System.out.println("task2() - value of a is " + a);
    }

    @Override
    public void task3() {
        System.out.println("DevApp.task3()");
        System.out.println("task3() - value of b is " + b);
    }

    @Override
    public void task4() {
        System.out.println("DevApp.task4()");
        System.out.println("task4() - value of b is " + b);

    }

}
