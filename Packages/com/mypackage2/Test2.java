package Packages.com.mypackage2;

import Packages.com.mypackage.Test;

public class Test2 {
    public Test2() {
        System.out.println("Test2.Test2()");
    }

    public static void main(String args[]) {
        System.out.println("Test2.main()");
        Test test = new Test();
        test.task1();
    }
}
