package OopsProject3;

public class ParametersActualVsFormal {

    int a;
    int b;

    public ParametersActualVsFormal() {
        System.out.println("ParametersActualVsFormal.ParametersActualVsFormal()");
    }

    public void actualParams(int a, int b) {
        System.out.println("ParametersActualVsFormal.actualParams()");
        /*
         * Actual parameters habituated with this keyword
         */
        this.a = a;
        this.b = b;
        int sum = a + b;
        System.out.println(sum);
    }

    public void formalParms(int c, int d) {
        System.out.println("ParametersActualVsFormal.formalParms()");
        a = c;
        b = d;
        int sum = a + b;
        System.out.println(sum);
    }

    public void printInstVariableValues() {
        System.out.println("value of a is " + a);
        System.out.println("value of b is " + b);
    }

    public static void main(String args[]) {
        System.out.println("ParametersActualVsFormal.main()");
        /* Creating a object */
        ParametersActualVsFormal actualVsFormal = new ParametersActualVsFormal();
        actualVsFormal.printInstVariableValues();
        actualVsFormal.actualParams(10, 20);
        actualVsFormal.printInstVariableValues();

        actualVsFormal.formalParms(40, 60);
        actualVsFormal.printInstVariableValues();

    }
}