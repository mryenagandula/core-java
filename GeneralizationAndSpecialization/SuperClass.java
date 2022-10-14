package GeneralizationAndSpecialization;

public class SuperClass {
    public SuperClass() {
        System.out.println("SuperClass.SuperClass()");
    }

    public void task1() {
        System.out.println("SuperClass.task1()");
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println(result);
    }
}
