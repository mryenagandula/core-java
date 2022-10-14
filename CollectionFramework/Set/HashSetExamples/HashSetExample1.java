package CollectionFramework.Set.HashSetExamples;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample1 {
    public HashSetExample1() {
        System.out.println("HashSetExample1.HashSetExample1()");
    }

    public static void main(String args[]) {
        System.out.println("HashSetExample1.main()");
        HashSet<String> names = new HashSet<String>();
        // hashset will add the items based on hash code
        names.add("ramesh");
        names.add("suresh");
        names.add("mahesh");
        names.add("somesh");
        names.add("raju");
        names.add("ranveer");
        names.add("raju");
        System.out.println(names);

        System.out.println("Size of set is " + names.size());
        names.remove("raju");
        System.out.println(names);

        // fetching data from sets is
        System.out.println();
        System.out.println("List of names in set ");
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            System.out.println(" - " + namesIterator.next());
        }
    }
}
