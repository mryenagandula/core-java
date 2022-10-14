package Generics.GenericsExample1;

public class DevApp2<T, E> {
    private T a;
    private E b;

    public DevApp2(T a, E b) {
        this.a = a;
        this.b = b;
        System.out.println("DevApp2.DevApp2()");
    }

    public String toString() {
        return a + " , " + b;
    }
}