package CastingInJava;

public class ExplicitCasting {
    public ExplicitCasting() {
        System.out.println("ExplicitCasting.ExplicitCasting()");
    }

    public void doExplicityCasting() {
        System.out.println("ExplicitCasting.doExplicityCasting()");
        /**
         * Here in explicit casting we are storing big datatypes
         * of requirements into small datatypes.
         */
        double d = 778955.5566;
        System.out.println("value of d is " + d);
        int i = (int) d;
        System.out.println("value of i is " + i);

        long l = 77899566625L;
        System.out.println("value of l is " + l);
        int intValue = (int) l;
        System.out.println("vlaue of intValue is " + intValue);

        double doubleValue = 88588888.55566;
        System.out.println("Double value is " + doubleValue);
        float fvalue = (float) doubleValue;
        System.out.println("value of fvalue is " + fvalue);

    }

}
