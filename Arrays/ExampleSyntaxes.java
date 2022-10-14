package Arrays;

import java.util.Arrays;

public class ExampleSyntaxes {

    public ExampleSyntaxes() {
        System.out.println("ExampleSyntaxes.ExampleSyntaxes()");
    }

    public static void main(String args[]) {
        System.out.println("ExampleSyntaxes.main()");

        int array[] = new int[] { 10, 20, 30 };// valid
        int[] array2 = { 20, 30, 40 };// valid
        int[] array3 = new int[3];// valid
        array3[0] = 23;
        array3[1] = 0;
        array3[2] = 40;
        int[] array4 = new int[1];// valid
        array4[0] = 75;
        int array5[] = new int[2];// valid
        array5[0] = 45;
        array5[1] = 0;

        Integer arr[] = new Integer[1];

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(arr));

        for (int i : array5) {
            System.out.println(i);
        }

    }
}
