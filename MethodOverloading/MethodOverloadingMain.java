package MethodOverloading;

public class MethodOverloadingMain {

    public MethodOverloadingMain() {
        System.out.println("MethodOverloadingMain.MethodOverloadingMain()");
    }

    public static void main(String args[]) {
        System.out.println("MethodOverloadingMain.main()");
        DevelopmentOveload dOveload = new DevelopmentOveload(15, 25);
        dOveload.task1();
        dOveload.task1(25);
        dOveload.task1(47, 98);
        dOveload.task1(11, 22, 85);
        dOveload.task1(75, 99, 11, 73);
    }
}
