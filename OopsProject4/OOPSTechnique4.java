package OopsProject4;

public class OOPSTechnique4 {

    public OOPSTechnique4() {
        System.out.println("OOPSTechnique4.OOPSTechnique4()");
    }

    public static void main(String args[]) {
        System.out.println("OOPSTechnique4.main()");
        OOPSTechnique4 oopsTechnique4 = new OOPSTechnique4();
        ConstructorsExample cExample = new ConstructorsExample();
        cExample.task1();
        cExample.task2();
        cExample.task3();
        cExample.task4();

        ConstructorsExample constructorsExample = new ConstructorsExample(70);
        constructorsExample.task1();
        constructorsExample.task2();
        constructorsExample.task3();
        constructorsExample.task4();

        ConstructorsExample cExample2 = new ConstructorsExample('R');
        cExample2.task1();
        cExample2.task2();
        cExample2.task3();
        cExample2.task4();

        ConstructorsExample cExample3 = new ConstructorsExample(85, 'D');
        cExample3.task1();
        cExample3.task2();
        cExample3.task3();
        cExample3.task4();

        ConstructorsExample cExample4 = new ConstructorsExample(65, 75);
        cExample4.task1();
        cExample4.task2();
        cExample4.task3();
        cExample4.task4();

        ConstructorsExample cExample5 = new ConstructorsExample(25, 56, 'L');
        cExample5.task1();
        cExample5.task2();
        cExample5.task3();
        cExample5.task4();
    }
}