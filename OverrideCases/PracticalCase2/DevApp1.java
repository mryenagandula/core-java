package OverrideCases.PracticalCase2;

public class DevApp1 extends ProjectApp {

    public DevApp1() {
        System.out.println("DevApp.DevApp()");
    }

    @Override
    public void task(int x) {
        System.out.println("DevApp.task()");
        System.out.println("value of x is " + x);
        System.out.println("sqrt of x is " + Math.sqrt(x));
    }
}
