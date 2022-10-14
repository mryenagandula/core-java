package GeneralizationAndSpecialization;

public class GeneralizationAndSpecialization {

    public GeneralizationAndSpecialization() {
        System.out.println("GeneralizationAndSpecialization.GeneralizationAndSpecialization()");
    }

    public static void main(String args[]) {
        System.out.println("GeneralizationAndSpecialization.main()");
        GeneralizationAndSpecialization generalizationAndSpecialization = new GeneralizationAndSpecialization();

        /* Implicit Casting */
        SuperClass superClass = new SubClass();
        superClass.task1();

        /* Explicit Casting */
        SubClass subClass = (SubClass) new SuperClass();
        subClass.task1();

    }

}