package CastingInJava;

public class CastingInJavaMain {

    public CastingInJavaMain() {
        System.out.println("CastingInJavaMain.CastingInJavaMain()");
    }

    public static void main(String args[]) {
        System.out.println("CastingInJavaMain.main()");
        ImplecityCasting implecityCasting = new ImplecityCasting();
        implecityCasting.doImplicityCasting();

        ExplicitCasting explicitCasting = new ExplicitCasting();
        explicitCasting.doExplicityCasting();

    }
}
