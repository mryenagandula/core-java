package OverrideCases.PracticalCase1;

public class DevApp extends ProjectApp {

    public DevApp() {
        System.out.println("DevApp.DevApp()");
    }

    @Override
    public void task(int x) {
        System.out.println("DevApp.task()");
        System.out.println("Square root of x is " + Math.sqrt(x));
        System.out.println("Square root of x is " + (x * 0.5));
    }

}
