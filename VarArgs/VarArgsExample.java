package VarArgs;

import java.util.Arrays;

public class VarArgsExample {

    public VarArgsExample() {
        System.out.println("VarArgsExample.VarArgsExample()");
    }

    public void task1(int... array) {
        System.out.println("VarArgsExample.task1()");
        String value = Arrays.toString(array);
        for (int arrayValue : array) {
            System.out.println(arrayValue);
        }
        System.out.println(value);
    }
}