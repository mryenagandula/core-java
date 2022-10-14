package CastingInJava;

public class ImplecityCasting {

    public ImplecityCasting() {
        System.out.println("ImplecityCasting.ImplecityCasting()");
    }

    public void doImplicityCasting() {
        /**
         * Implicti casting(Lower to Higher)
         */
        int a = 20; // 4 bytes
        System.out.println("value of a is " + a);
        double d = a;
        System.out.println("value of b is " + d);

        float f = 20.555F;
        System.out.println("value of f is " + f);
        double g = f;
        System.out.println("value of g is " + g);

        int r = 2345;
        System.out.println("value of r is " + r);
        long l = r;
        System.out.println("value of l is " + l);

    }
}
