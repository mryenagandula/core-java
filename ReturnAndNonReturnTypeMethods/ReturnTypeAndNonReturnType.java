package ReturnAndNonReturnTypeMethods;

public class ReturnTypeAndNonReturnType {

    public ReturnTypeAndNonReturnType() {
        System.out.println("ReturnTypeAndNonReturnType.ReturnTypeAndNonReturnType()");
    }

    public void addTwoNumberNonReturnType(int a, int b) {
        System.out.println("ReturnTypeAndNonReturnType.addTwoNumberNonReturnType()");
        int result = a + b;
        System.out.println("value of result is " + result);
    }

    public int addTwoNumberReturnType(int a, int b) {
        System.out.println("ReturnTypeAndNonReturnType.addTwoNumberReturnType()");
        int result = a + b;
        return result;
    }
}
