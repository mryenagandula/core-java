package InheritanceTechnique1;

public class NewLogic extends ExistedLogic {
    public NewLogic(int a, int b) {
        /**
         * Here is super is used to send the constructor parameters
         * of child class will pass to parent class constructor
         */
        super(a, b);
    }
}
