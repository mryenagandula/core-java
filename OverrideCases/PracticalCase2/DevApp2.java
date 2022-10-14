package OverrideCases.PracticalCase2;

public class DevApp2 extends DevApp1 {

    public DevApp2() {
        System.out.println("DevApp2.DevApp2()");
    }

    @Override
    public void task(int x) {
        System.out.println("DevApp2.task()");
        System.out.println("The value of x in devapp2 is" + x);
    }
}
