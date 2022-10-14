package CollectionFramework.List.VectorExamples;

import java.util.ListIterator;
import java.util.Vector;

public class VectorExample1 {

    public VectorExample1() {
        System.out.println("VectorExample1.VectorExample1()");
    }

    public static void main(String args[]) {
        System.out.println("VectorExample1.main()");
        Vector<String> mountains = new Vector<String>();
        mountains.add("Everest");
        mountains.add("kailasa");
        mountains.add("kanchana ganga");
        mountains.add("batura sar");
        mountains.add("himalaya");

        System.out.println(mountains);
        ListIterator<String> iterator = mountains.listIterator();
        System.out.println();
        System.out.println("List of mountains");
        while (iterator.hasNext()) {
            System.out.println(" - " + iterator.next().toUpperCase());
        }

        System.out.println();
        System.out.println(mountains.contains("himalaya"));
        System.out.println(mountains.get(0));
        System.out.println(mountains.elementAt(2));
        System.out.println(mountains.firstElement());
        System.out.println(mountains.lastElement());
        System.out.println(mountains.remove(2));
        System.out.println(mountains);

    }
}
