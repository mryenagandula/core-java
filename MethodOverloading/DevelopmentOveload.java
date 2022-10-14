package MethodOverloading;

public class DevelopmentOveload {
    private int a;
    private int b;

    public DevelopmentOveload() {
        System.out.println("DevelopmentOveload.DevelopmentOveload()");
    }

    public DevelopmentOveload(int a, int b) {
        System.out.println("DevelopmentOveload.DevelopmentOveload()");
        this.a = a;
        this.b = b;
    }

    public void task1() {
        System.out.println("DevelopmentOveload.task1() - zero params");
        int res = this.a + this.b;
        System.out.println("res is " + res);
    }

    public void task1(int a, int b) {
        System.out.println("DevelopmentOveload.task1() - two params");
        this.a = a;
        this.b = b;
        int res = this.a + this.b;
        System.out.println("res is " + res);
    }

    public void task1(int a) {
        System.out.println("DevelopmentOveload.task1() - one param");
        this.a = a;
        int res = this.a + this.b;
        System.out.println("res is " + res);
    }

    public void task1(int a, int b, int c) {
        System.out.println("DevelopmentOveload.task1() - three params");
        this.a = a;
        this.b = b;
        int res = this.a + this.b + c;
        System.out.println("res value is " + res);
    }

    public void task1(int a, int b, int c, int d) {
        System.out.println("DevelopmentOveload.task1() - four params");
        this.a = a;
        this.b = b;
        int res = this.a + this.b + c + d;
        System.out.println("res value is " + res);
    }

}
