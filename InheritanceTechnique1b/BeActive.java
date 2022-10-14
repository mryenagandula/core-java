package InheritanceTechnique1b;

public class BeActive extends Active {
    private int x, y;

    public BeActive() {
        super();
    }

    public BeActive(int a, int b, int c) {
        super(a, b, c);
    }

    public BeActive(char x, int b) {
        super(x, b);
    }

    public BeActive(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void task4() {
        System.out.println("BeActive.task4()");
        System.out.println("the value of x is " + x);
        System.out.println("the value of y is " + y);
    }

}
