package InheritanceProject1;

public class BeActive extends Active {
    private int b = 20;

    public BeActive() {
        System.out.println("BeActive.BeActive()");
    }

    public void task2() {
        System.out.println("value of b is " + b);
    }

}
