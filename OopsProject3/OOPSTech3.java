package OopsProject3;

public class OOPSTech3 {

    public OOPSTech3() {
        System.out.println("OOPSTech3.OOPSTech3()");
    }

    public static void main(String args[]) {
        System.out.println("OOPSTech3.main()");
        OOPSTech3 oopsTech3 = new OOPSTech3();
        WorkingWithSameMethodNames wMethodNames = new WorkingWithSameMethodNames();

        /** calling method with zero params with int type */
        wMethodNames.task();

        /** calling method with one param with int type */
        wMethodNames.task(35);

        /** calling method with two params with int type */
        wMethodNames.task(35, 45);

        /** calling method with one param with char tyoe */
        wMethodNames.task('c');

        /** calling method with three params with int type */
        wMethodNames.task(10, 20, 30);
    }
}
