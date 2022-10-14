package GeneralizationAndSpecialization;

public class SubClass extends SuperClass {
    public SubClass() {
        System.out.println("SubClass.SubClass()");
    }

    @Override
    public void task1() {
        int a = 10;
        int b = 20;
        int result = a - b;
        System.out.println(result);
    }
}
