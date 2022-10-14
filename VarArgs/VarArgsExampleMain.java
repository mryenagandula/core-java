package VarArgs;

public class VarArgsExampleMain {

    public VarArgsExampleMain() {
        System.out.println("VarArgsExampleMain.VarArgsExampleMain()");
    }

    public static void main(String args[]) {
        VarArgsExample vArgsExample = new VarArgsExample();
        vArgsExample.task1(20, 30, 40);
        vArgsExample.task1(20, 30, 40, 99, 78);
    }
}
