package InheritanceProject1;

public class CActive extends BeActive {
    private int c = 30;

    public CActive() {
        System.out.println("CActive.CActive()");
    }

    public void task3() {
        System.out.println("Value of c is " + c);
    }
}
