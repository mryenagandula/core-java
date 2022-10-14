package InheritanceTechnique2;

public class InheritanceTechnique2Main {

    public InheritanceTechnique2Main() {
        System.out.println("InheritanceTechnique2Main.InheritanceTechnique2Main()");
    }

    public static void main(String args[]) {
        System.out.println("InheritanceTechnique2Main.main()");
        NewLogic newLogic = new NewLogic();
        newLogic.task1();
    }

}

/**
 * OUT PUT = 143
 */
