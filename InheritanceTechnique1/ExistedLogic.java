package InheritanceTechnique1;

public class ExistedLogic {
    private int a = 5;
    private int b = 3;

    public ExistedLogic() {
        System.out.println("ExistedLogic.ExistedLogic()");
    }

    public ExistedLogic(int a, int b) {
        System.out.println("ExistedLogic.ExistedLogic()");
        this.a = a;
        this.b = b;
    }

    public void task1() {
        System.out.println("value of a is " + a);
        System.out.println("value of b is " + b);
    }
}
