package InheritanceTechnique1;

public class InheritanceTechnique1Main {
    public InheritanceTechnique1Main() {
        System.out.println("InheritanceTechnique1Main.InheritanceTechnique1Main()");
    }

    public static void main(String args[]) {
        ExistedLogic existedLogic = new ExistedLogic(10, 50);
        existedLogic.task1();
        NewLogic newLogic = new NewLogic(20, 30);
        newLogic.task1();
    }
}
