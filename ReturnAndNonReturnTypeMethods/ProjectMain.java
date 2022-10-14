package ReturnAndNonReturnTypeMethods;

public class ProjectMain {

    public ProjectMain() {
        System.out.println("ProjectMain.ProjectMain()");
    }

    public static void main(String args[]) {
        System.out.println("ProjectMain.main()");
        ReturnTypeAndNonReturnType returnTypeAndNonReturnType = new ReturnTypeAndNonReturnType();
        returnTypeAndNonReturnType.addTwoNumberNonReturnType(20, 17);
        System.out.println("value of result is " + returnTypeAndNonReturnType.addTwoNumberReturnType(11, 19));
    }
}
