package Generics.GenericsExample1;

public class DevApp1<T> {

    private T id;

    public DevApp1(T id) {
        this.id = id;
        System.out.println("DevApp1.DevApp1()");
    }

    public T getId() {
        return id;
    }
}