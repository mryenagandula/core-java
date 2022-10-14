package CollectionFramework.Set.TreeSetExamples;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample1 {

    public TreeSetExample1() {
        System.out.println("TreeSetExample1.TreeSetExample1()");
    }

    public static void main(String args[]) {
        System.out.println("TreeSetExample1.main()");
        TreeSet<String> fruitNames = new TreeSet<String>();
        fruitNames.add("Mango");
        fruitNames.add("Orange");
        fruitNames.add("Apple");
        fruitNames.add("Banana");
        fruitNames.add("Grapes");
        System.out.println(fruitNames);
        System.out.println();
        System.out.println("List of fruits ");
        Iterator<String> fIterator = fruitNames.iterator();
        while (fIterator.hasNext()) {
            System.out.println(" + " + fIterator.next());
        }
    }
}
