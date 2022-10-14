package InheritanceTechnique2;

public class NewLogic extends ExistedLogic {

    public NewLogic() {
        System.out.println("NewLogic.NewLogic()");
    }

    @Override
    public void task1() {
        System.out.println("NewLogic.task1()");
        int a = 67;
        int b = 76;
        int result = a + b;
        System.out.println("Result :: " + result);
    }
}
