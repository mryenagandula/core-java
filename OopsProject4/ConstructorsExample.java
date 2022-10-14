package OopsProject4;

public class ConstructorsExample {

    int a = 10;
    int b = 20;
    char x = 'y';

    public ConstructorsExample() {
        System.out.println("ConstructorsExample.ConstructorsExample()");
    }

    public ConstructorsExample(int a) {
        System.out.println("ConstructorsExample.ConstructorsExample()");
        this.a = a;
    }

    public ConstructorsExample(int a, int b) {
        System.out.println("ConstructorsExample.ConstructorsExample()");
        this.a = a;
        this.b = b;
    }

    public ConstructorsExample(int a, char x) {
        System.out.println("ConstructorsExample.ConstructorsExample()");
        this.a = a;
        this.x = x;
    }

    public ConstructorsExample(int a, int b, char x) {
        System.out.println("ConstructorsExample.ConstructorsExample()");
        this.a = a;
        this.b = b;
        this.x = x;
    }

    public ConstructorsExample(char x) {
        System.out.println("ConstructorsExample.ConstructorsExample()");
        this.x = x;
    }

    public void task1() {
        System.out.println("ConstructorsExample.task1()");
        System.out.println("The value of a is " + a);
    }

    public void task2() {
        System.out.println("ConstructorsExample.task2()");
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);
        System.out.println("The valeu of x is " + x);
    }

    public void task3() {
        System.out.println("ConstructorsExample.task3()");
        System.out.println("The value of a is " + a);
        System.out.println("The valeu of b is " + b);
        System.out.println("The value of x is " + x);
    }

    public void task4() {
        System.out.println("ConstructorsExample.task4()");
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);
        System.out.println("The value of x is " + x);
    }
}
