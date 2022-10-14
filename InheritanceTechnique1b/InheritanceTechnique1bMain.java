package InheritanceTechnique1b;

public class InheritanceTechnique1bMain {
    public InheritanceTechnique1bMain() {
        System.out.println("InheritanceTechnique1bMain.InheritanceTechnique1bMain()");
    }

    public static void main(String args[]) {
        BeActive beActive = new BeActive();
        beActive.task1();
        beActive.task2();
        beActive.task3();
        beActive.task4();

        BeActive beActive2 = new BeActive(10, 20, 30);
        beActive2.task1();
        beActive2.task2();
        beActive2.task3();
        beActive2.task4();

        BeActive beActive3 = new BeActive('r', 20);
        beActive3.task1();
        beActive3.task2();
        beActive3.task3();
        beActive3.task4();

        BeActive beActive4 = new BeActive(79, 20);
        beActive4.task1();
        beActive4.task2();
        beActive4.task3();
        beActive4.task4();
    }
}