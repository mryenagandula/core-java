package InheritanceTechnique1b;

public class Active {
    private int a, b, c;
    private char x;

    public Active() {
        System.out.println("Active.Active()-no args consturctor");
        this.a = 10;
        this.b = 20;
    }

    public Active(int a, int b, int c) {
        System.out.println("Active.Active()-3 args consturctor");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Active(char x, int b) {
        System.out.println("Active.Active()-2 args consturctor");
        this.x = x;
        this.b = b;
    }

    public void task1() {
        System.out.println("Active.task1()");
        System.out.println("value of a is " + a);
        System.out.println("value of b is " + b);
    }

    public void task2() {
        System.out.println("Active.task2()");
        System.out.println("value of a is " + a);
        System.out.println("value of b is " + b);
        System.out.println("value of c is " + c);
    }

    public void task3() {
        System.out.println("Active.task3()");
        System.out.println("value of a is " + a);
        System.out.println("value of x is " + x);
    }
}
